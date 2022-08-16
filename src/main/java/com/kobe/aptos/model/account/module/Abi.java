package com.kobe.aptos.model.account.module;

import lombok.Data;

import java.util.List;

@Data
public class Abi {
    private String address;
    private String name;
    private List<String> friends;
    private List<ExposedFunction> exposedFunctions;
    private List<Structs> structs;
}