package com.kobe.aptos.model.transaction;

import lombok.Data;

@Data
public class Code {
    private String bytecode;
    private Abi abi;
}