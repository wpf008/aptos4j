package com.kobe.aptos.service;


import com.kobe.aptos.model.LedgerInformation;
import com.kobe.aptos.model.account.Account;
import com.kobe.aptos.model.account.module.Module;
import com.kobe.aptos.model.account.resource.Resource;
import com.kobe.aptos.model.transaction.SigningMessage;
import com.kobe.aptos.model.transaction.SubmitTransaction;
import com.kobe.aptos.model.transaction.Transaction;
import com.kobe.aptos.request.transaction.TransactionRequest;

import java.util.List;

public interface AptosApiClient {
    LedgerInformation ledgerInformation();

    List<Transaction> getTransactions(Integer start, Integer limit);

    SubmitTransaction submitTransaction(TransactionRequest request);


    List<Transaction> getTransactionsByAddress(String address, Integer start, Integer limit);


    Transaction getTransactionsByTxHash(String txHash);

    Transaction getTransactionsByVersion(String version);

    SigningMessage signingMessage(TransactionRequest request);

    Account account(String address);

    List<Resource> getResources(String address,String version);

    Resource getResourcesByType(String address, String resourceType, String version);

    List<Module> getModules(String address, String version);

    Module getModulesByModuleName(String address, String moduleName, String version);


}
