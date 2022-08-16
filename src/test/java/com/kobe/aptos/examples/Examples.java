package com.kobe.aptos.examples;

import com.kobe.aptos.model.LedgerInformation;
import com.kobe.aptos.model.account.Account;
import com.kobe.aptos.model.account.module.Module;
import com.kobe.aptos.model.account.resource.Resource;
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
//        ledgerInformation();
        getModules();
    }


    private static void ledgerInformation() {
        LedgerInformation ledgerInformation = client.ledgerInformation();
        System.out.println(ledgerInformation);
    }

    private static void getTransactions() {
        List<Transaction> transactions = client.getTransactions(1, 10);
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
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


    private static void account() {
        Account account = client.account("0x5c96ae24729caa96958df32f0c8ca715494d738e943b14961541e477b133ea9c");
        System.out.println(account);
    }


    private static void getResources() {
        //List<Resource> resources = client.getResources("0x5c96ae24729caa96958df32f0c8ca715494d738e943b14961541e477b133ea9c", null);
        List<Resource> resources = client.getResources("0x5c96ae24729caa96958df32f0c8ca715494d738e943b14961541e477b133ea9c", "16439623");
        for (Resource resource : resources) {
            System.out.println(resource);
        }
    }


    private static void getResourcesByType() {
        Resource resource = client.getResourcesByType("0x5c96ae24729caa96958df32f0c8ca715494d738e943b14961541e477b133ea9c", "0x1::account::Account", null);
        System.out.println(resource);
    }


    private static void getModules() {
        List<Module> modules = client.getModules("0x1", null);
        for (Module module : modules) {
            System.out.println(module);
        }
    }

    private static void getModulesByModuleName() {
        Module module = client.getModulesByModuleName("0x1", "bcs",null);
        System.out.println(module);
    }


}
