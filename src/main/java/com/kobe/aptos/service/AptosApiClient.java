package com.kobe.aptos.service;


import com.kobe.aptos.model.LedgerInformation;
import com.kobe.aptos.model.transaction.SubmitTransaction;
import com.kobe.aptos.model.transaction.Transaction;
import com.kobe.aptos.request.transaction.TransactionRequest;
import retrofit2.http.Body;

import java.util.List;

public interface AptosApiClient {
    LedgerInformation ledgerInformation();

    List<Transaction> getTransactions(Integer limit, Integer start);

    SubmitTransaction submitTransaction( TransactionRequest request);

}
