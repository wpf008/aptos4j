package com.kobe.aptos.examples;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.kobe.aptos.model.LedgerInformation;
import com.kobe.aptos.model.transaction.SubmitTransaction;
import com.kobe.aptos.model.transaction.Transaction;
import com.kobe.aptos.request.transaction.Payload;
import com.kobe.aptos.request.transaction.TransactionRequest;
import com.kobe.aptos.service.AptosApiClient;
import com.kobe.aptos.service.impl.AptosApiClientImpl;

import java.util.Arrays;
import java.util.List;

public class Examples {

    private static AptosApiClient client = new AptosApiClientImpl();

    public static void main(String[] args) {
        ledgerInformation();
    }


    private static void ledgerInformation() {
        LedgerInformation ledgerInformation = client.ledgerInformation();
        System.out.println(ledgerInformation);
    }

    private static void getTransactions() {
        List<Transaction> transactions = client.getTransactions(1, 10);

    }


    private static void getTransactionsByAddress() {
        List<Transaction> transactionsByAddress
                = client.getTransactionsByAddress("0x5c96ae24729caa96958df32f0c8ca715494d738e943b14961541e477b133ea9c", 1, 10);
        for (Transaction transaction : transactionsByAddress) {
            System.out.println(transaction);
        }
    }


    private static void getTransactionsByXXX() {
        Transaction transactionsByTxHash = client.getTransactionsByTxHash("0x2574f01636296e2def20fb090eaf54af9304c8356e785317fb4e10ed29088043");
        System.out.println(transactionsByTxHash);
        Transaction transactionsByVersion = client.getTransactionsByVersion("14912");
        System.out.println(transactionsByVersion);
    }

    private static void testSubmitTransaction() {
        TransactionRequest transactionRequest = new TransactionRequest();
        transactionRequest.setSender("0xdd");
        transactionRequest.setSequenceNumber("32425224034");
        transactionRequest.setGasUnitPrice("32425224034");
        transactionRequest.setMaxGasAmount("32425224034");
        transactionRequest.setGasCurrencyCode("XDX");
        transactionRequest.setExpirationTimestampSecs("1635447454");
        Payload payload = new Payload();
        payload.setFunction("0x1::payment_scripts::peer_to_peer_with_metadata");
        payload.setType("script_function_payload");
        payload.setArguments(Arrays.asList("0x1668f6be25668c1a17cd8caf6b8d2f25", "2021000000", "0x", "0x"));
        payload.setTypeArguments(Arrays.asList("0x1::xdx::XDX"));
        payload.setSecondarySigners(Arrays.asList("0xdd"));
        transactionRequest.setPayload(payload);
        SubmitTransaction submitTransaction = client.submitTransaction(transactionRequest);
        System.out.println(submitTransaction);
    }
}
