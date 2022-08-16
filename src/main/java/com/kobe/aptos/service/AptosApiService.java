package com.kobe.aptos.service;

import com.kobe.aptos.model.LedgerInformation;
import com.kobe.aptos.model.account.Account;
import com.kobe.aptos.model.account.module.Module;
import com.kobe.aptos.model.account.resource.Resource;
import com.kobe.aptos.model.transaction.SigningMessage;
import com.kobe.aptos.model.transaction.SubmitTransaction;
import com.kobe.aptos.model.transaction.Transaction;
import com.kobe.aptos.request.transaction.TransactionRequest;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface AptosApiService {
    @GET("/")
    Call<LedgerInformation> ledgerInformation();

    @GET("/transactions")
    Call<List<Transaction>> getTransactions(@Query("start") Integer start, @Query("limit") Integer limit);

    @POST("/transactions")
    Call<SubmitTransaction> submitTransaction(@Body TransactionRequest request);

    @GET("/accounts/{address}/transactions")
    Call<List<Transaction>> getTransactionsByAddress(@Path("address") String address, @Query("start") Integer start, @Query("limit") Integer limit);


    @GET("/transactions/{txHash}")
    Call<Transaction> getTransactionsByTxHash(@Path("txHash") String txHash);

    @GET("/transactions/{version}")
    Call<Transaction> getTransactionsByVersion(@Path("version") String version);


    @POST("/transactions/signing_message")
    Call<SigningMessage> signingMessage(@Body TransactionRequest request);


    @GET("/accounts/{address}")
    Call<Account> account(@Path("address") String address);

    @GET("/accounts/{address}/resources")
    Call<List<Resource>> getResources(@Path("address") String address, @Query("version") String version);

    @GET("/accounts/{address}/resource/{resourceType}")
    Call<Resource> getResourcesByType(@Path("address") String address, @Path("resourceType") String resourceType, @Query("version") String version);

    @GET("/accounts/{address}/modules")
    Call<List<Module>> getModules(@Path("address") String address, @Query("version") String version);

    @GET("/accounts/{address}/module/{moduleName}")
    Call<Module> getModulesByModuleName(@Path("address") String address, @Path("moduleName") String moduleName, @Query("version") String version);


}
