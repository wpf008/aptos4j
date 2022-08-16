package com.kobe.aptos.service;


import com.kobe.aptos.model.LedgerInformation;
import com.kobe.aptos.model.transaction.SigningMessage;
import com.kobe.aptos.model.transaction.SubmitTransaction;
import com.kobe.aptos.model.transaction.Transaction;
import com.kobe.aptos.request.transaction.TransactionRequest;
import retrofit2.http.Body;

import java.util.List;

public interface AptosApiClient {
    LedgerInformation ledgerInformation();

    List<Transaction> getTransactions(Integer start, Integer limit);

    SubmitTransaction submitTransaction(TransactionRequest request);


    List<Transaction> getTransactionsByAddress(String address, Integer start, Integer limit);


    Transaction getTransactionsByTxHash(String txHash);

    Transaction getTransactionsByVersion(String version);

    SigningMessage signingMessage(TransactionRequest request);


}
