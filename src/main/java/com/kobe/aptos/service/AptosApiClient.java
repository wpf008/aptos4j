package com.kobe.aptos.service;


import com.kobe.aptos.model.LedgerInformation;
import com.kobe.aptos.model.transaction.SubmitTransaction;
import com.kobe.aptos.model.transaction.Transaction;
import com.kobe.aptos.request.transaction.TransactionRequest;

import java.util.List;

public interface AptosApiClient {
    LedgerInformation ledgerInformation();

    List<Transaction> getTransactions(Integer start, Integer limit);

    SubmitTransaction submitTransaction( TransactionRequest request);

}
