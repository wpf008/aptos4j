package com.kobe.aptos.service;

import com.kobe.aptos.model.LedgerInformation;
import com.kobe.aptos.model.transaction.SubmitTransaction;
import com.kobe.aptos.model.transaction.Transaction;
import com.kobe.aptos.request.transaction.TransactionRequest;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

import java.util.List;

public interface AptosApiService {
    @GET("/")
    Call<LedgerInformation> ledgerInformation();

    @GET("/transactions")
    Call<List<Transaction>> getTransactions(@Query("start") Integer start, @Query("limit") Integer limit);

    @POST("/transactions")
    Call<SubmitTransaction> submitTransaction(@Body TransactionRequest request);

}
