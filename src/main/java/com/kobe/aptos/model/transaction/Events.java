package com.kobe.aptos.model.transaction;


import lombok.Data;

@Data
public class Events {
    private String key;
    private String sequence_number;
    private String type;
    private TxData data;
}