package com.kobe.aptos.model.account.module;

import lombok.Data;

@Data
public class Module {
    private String bytecode;
    private Abi abi;
}