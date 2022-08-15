package com.kobe.aptos;

import com.kobe.aptos.model.LedgerInformation;
import com.kobe.aptos.model.transaction.Transaction;
import com.kobe.aptos.service.AptosApiClient;
import com.kobe.aptos.service.impl.AptosApiClientImpl;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        AptosApiClient client = new AptosApiClientImpl();
//        LedgerInformation s = client.ledgerInformation();
//        System.out.println(s);

        List<Transaction> transactions = client.transactions(1, 1);
        for (Transaction transaction : transactions) {
            System.out.println(transactions);
        }


    }
}
