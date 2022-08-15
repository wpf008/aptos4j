package com.kobe.aptos.service;

import retrofit2.Call;
import retrofit2.http.GET;

public interface AptosApiService {

    @GET("ping")
    Call<String> ledgerInformation();
}
