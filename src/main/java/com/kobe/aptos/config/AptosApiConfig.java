package com.kobe.aptos.config;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kobe.aptos.exception.AptosApiError;
import com.kobe.aptos.exception.AptosApiException;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.concurrent.TimeUnit;

public class AptosApiConfig {

    private final String API_BASE_URL = "https://fullnode.devnet.aptoslabs.com/";

    private OkHttpClient okHttpClient = null;
    private Retrofit retrofit = null;

    public <S> S createService(Class<S> serviceClass, Long connectionTimeoutSeconds, Long readTimeoutSeconds, Long writeTimeoutSeconds) {
        okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(connectionTimeoutSeconds, TimeUnit.SECONDS)
                .readTimeout(readTimeoutSeconds, TimeUnit.SECONDS)
                .writeTimeout(writeTimeoutSeconds, TimeUnit.SECONDS)
                .build();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.setPropertyNamingStrategy(com.fasterxml.jackson.databind.PropertyNamingStrategy.SNAKE_CASE);
        retrofit = new Retrofit.Builder()
                .baseUrl(API_BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(JacksonConverterFactory.create(objectMapper))
                .build();

        return retrofit.create(serviceClass);
    }

    public <T> T executeSync(Call<T> call) {
        try {
            Response<T> response = call.execute();
            if (response.isSuccessful()) {
                return response.body();
            } else if (response.code() == 429) {
                AptosApiError apiError = new AptosApiError();
                apiError.setCode(1015);
                apiError.setMessage("Rate limited");
                throw new AptosApiException(apiError);
            } else {
                try {
                    AptosApiError apiError = getAptosApiError(response);
                    apiError.setCode(response.code());
                    throw new AptosApiException(apiError);
                } catch (IOException e) {
                    throw new AptosApiException(response.toString(), e);
                }
            }
        } catch (IOException e) {
            throw new AptosApiException(e);
        }
    }

    public void shutdown() {
        try {
            if (okHttpClient != null) {
                okHttpClient.dispatcher().executorService().shutdown();
                okHttpClient.connectionPool().evictAll();
            }
        } catch (Exception e) {
            throw new AptosApiException(e);
        }
    }

    private AptosApiError getAptosApiError(Response<?> response) throws IOException {
        return (AptosApiError) retrofit.responseBodyConverter(AptosApiError.class, new Annotation[0])
                .convert(response.errorBody());

    }

}
