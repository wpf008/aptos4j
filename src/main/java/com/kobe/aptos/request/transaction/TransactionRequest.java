
package com.kobe.aptos.request.transaction;

import lombok.Data;

@Data
public class TransactionRequest {
    private String sender;
    private String sequence_number;
    private String max_gas_amount;
    private String gas_unit_price;
    private String gas_currency_code;
    private String expiration_timestamp_secs;
    private Payload payload;
    private Signature signature;
}