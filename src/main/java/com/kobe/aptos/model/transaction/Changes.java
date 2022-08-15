package com.kobe.aptos.model.transaction;

import lombok.Data;

@Data
public class Changes {
    private String type;
    private String address;
    private String stateKeyHash;
    private TxData data;
}