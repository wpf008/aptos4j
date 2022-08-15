package com.kobe.aptos.service.impl;

import com.kobe.aptos.config.AptosApiConfig;
import com.kobe.aptos.model.LedgerInformation;
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
        this.aptosApiService = aptosApiConfig.createService(
                AptosApiService.class,
                connectionTimeoutSeconds,
                readTimeoutSeconds,
                writeTimeoutSeconds
        );
    }

    @Override
    public LedgerInformation ledgerInformation() {
        return aptosApiConfig.executeSync(aptosApiService.ledgerInformation());
    }

    @Override
    public List<Transaction> getTransactions(Integer limit, Integer start) {
        return aptosApiConfig.executeSync(aptosApiService.getTransactions(limit, start));
    }

    @Override
    public SubmitTransaction submitTransaction(TransactionRequest request) {
        return aptosApiConfig.executeSync(aptosApiService.submitTransaction(request));
    }


}
