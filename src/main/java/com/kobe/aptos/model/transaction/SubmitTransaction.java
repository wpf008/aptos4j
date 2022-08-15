package com.kobe.aptos.model.transaction;


import com.kobe.aptos.request.transaction.Payload;
import com.kobe.aptos.request.transaction.Signature;
import lombok.Data;

@Data
public class SubmitTransaction {
    private String type;
    private String hash;
    private String sender;
    private String sequenceNumber;
    private String maxGasAmount;
    private String gasUnitPrice;
    private String gasCurrencyCode;
    private String expirationTimestampSecs;
    private Payload payload;
    private Signature signature;
}
