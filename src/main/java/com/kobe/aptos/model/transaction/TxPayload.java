package com.kobe.aptos.model.transaction;

import lombok.Data;

@Data
public class TxPayload {

    private String type;
    private WriteSet writeSet;
}
