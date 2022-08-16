
package com.kobe.aptos.request.transaction;

import lombok.Data;

@Data
public class TransactionRequest {
    private String sender;
    private String sequenceNumber;
    private String maxGasAmount;
    private String gasUnitPrice;
    private String gasCurrencyCode;
    private String expirationTimestampSecs;
    private Payload payload;
    private Signature signature;
}