package com.kobe.aptos.model.account.module;

import lombok.Data;

import java.util.List;

@Data
public class GenericTypeParam {
    private List<String> constraints;
    private boolean isPhantom;
}