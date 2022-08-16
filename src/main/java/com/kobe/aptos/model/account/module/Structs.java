package com.kobe.aptos.model.account.module;

import lombok.Data;

import java.util.List;


@Data
public class Structs {
    private String name;
    private boolean isNative;
    private List<String> abilities;
    private List<GenericTypeParam> genericTypeParams;
    private List<Fields> fields;
}