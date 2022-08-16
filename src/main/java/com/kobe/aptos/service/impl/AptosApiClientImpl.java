package com.kobe.aptos.service.impl;

import com.kobe.aptos.config.AptosApiConfig;
import com.kobe.aptos.model.LedgerInformation;
import com.kobe.aptos.model.account.Account;
import com.kobe.aptos.model.account.module.Module;
import com.kobe.aptos.model.account.resource.Resource;
import com.kobe.aptos.model.transaction.SigningMessage;
import com.kobe.aptos.model.transaction.SubmitTransaction;
import com.kobe.aptos.model.transaction.Transaction;
import com.kobe.aptos.request.transaction.TransactionRequest;
import com.kobe.aptos.service.AptosApiClient;
import com.kobe.aptos.service.AptosApiService;

import java.util.List;

public class AptosApiClientImpl implements AptosApiClient {

    static final Long DEFAULT_CONNECTION_TIMEOUT = 10L;
    static final Long DEFAULT_READ_TIMEOUT = 10L;
    static final Long DEFAULT_WRITE_TIMEOUT = 10L;

    private AptosApiService aptosApiService;

    private AptosApiConfig aptosApiConfig;

    public AptosApiClientImpl() {
        this(DEFAULT_CONNECTION_TIMEOUT, DEFAULT_READ_TIMEOUT, DEFAULT_WRITE_TIMEOUT);
    }

    public AptosApiClientImpl(Long connectionTimeoutSeconds, Long readTimeoutSeconds, Long writeTimeoutSeconds) {
        this.aptosApiConfig = new AptosApiConfig();
        this.aptosApiService = aptosApiConfig.createService(AptosApiService.class, connectionTimeoutSeconds, readTimeoutSeconds, writeTimeoutSeconds);
    }

    @Override
    public LedgerInformation ledgerInformation() {
        return aptosApiConfig.executeSync(aptosApiService.ledgerInformation());
    }

    @Override
    public List<Transaction> getTransactions(Integer start, Integer limit) {
        return aptosApiConfig.executeSync(aptosApiService.getTransactions(start, limit));
    }

    @Override
    public SubmitTransaction submitTransaction(TransactionRequest request) {
        return aptosApiConfig.executeSync(aptosApiService.submitTransaction(request));
    }

    @Override
    public List<Transaction> getTransactionsByAddress(String address, Integer start, Integer limit) {
        return aptosApiConfig.executeSync(aptosApiService.getTransactionsByAddress(address, start, limit));
    }

    @Override
    public Transaction getTransactionsByTxHash(String txHash) {
        return aptosApiConfig.executeSync(aptosApiService.getTransactionsByTxHash(txHash));
    }

    @Override
    public Transaction getTransactionsByVersion(String version) {
        return aptosApiConfig.executeSync(aptosApiService.getTransactionsByVersion(version));
    }

    @Override
    public SigningMessage signingMessage(TransactionRequest request) {
        return aptosApiConfig.executeSync(aptosApiService.signingMessage(request));
    }

    @Override
    public Account account(String address) {
        return aptosApiConfig.executeSync(aptosApiService.account(address));
    }

    @Override
    public List<Resource> getResources(String address,String version) {
        return aptosApiConfig.executeSync(aptosApiService.getResources(address,version));
    }

    @Override
    public Resource getResourcesByType(String address, String resourceType, String version) {
        return aptosApiConfig.executeSync(aptosApiService.getResourcesByType(address, resourceType, version));
    }

    @Override
    public List<Module> getModules(String address, String version) {
        return aptosApiConfig.executeSync(aptosApiService.getModules(address, version));
    }

    @Override
    public Module getModulesByModuleName(String address, String moduleName, String version) {
        return aptosApiConfig.executeSync(aptosApiService.getModulesByModuleName(address, moduleName, version));
    }


}
