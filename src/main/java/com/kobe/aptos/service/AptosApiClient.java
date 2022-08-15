package com.kobe.aptos.service;

import retrofit2.Call;

public interface AptosApiClient {
    Call<String> ledgerInformation();
}
