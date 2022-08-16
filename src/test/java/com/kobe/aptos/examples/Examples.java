package com.kobe.aptos.examples;

import com.kobe.aptos.model.LedgerInformation;
import com.kobe.aptos.model.transaction.Transaction;
import com.kobe.aptos.service.AptosApiClient;
import com.kobe.aptos.service.impl.AptosApiClientImpl;

import java.util.List;

public class Examples {

    public static void main(String[] args) {
        AptosApiClient client = new AptosApiClientImpl();
//        LedgerInformation ledgerInformation = client.ledgerInformation();
//        List<Transaction> transactions = client.getTransactions(1, 10);

        List<Transaction> transactionsByAddress
                = client.getTransactionsByAddress("0x5c96ae24729caa96958df32f0c8ca715494d738e943b14961541e477b133ea9c", 1, 10);

//        for (Transaction transaction : transactionsByAddress) {
//            System.out.println(transaction);
//        }


        Transaction transactionsByTxHash = client.getTransactionsByTxHash("0x2574f01636296e2def20fb090eaf54af9304c8356e785317fb4e10ed29088043");
        System.out.println(transactionsByTxHash);


        System.out.println();

        Transaction transactionsByVersion = client.getTransactionsByVersion("14912");
        System.out.println(transactionsByVersion);
    }
}
