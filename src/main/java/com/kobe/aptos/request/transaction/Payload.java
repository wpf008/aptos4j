package com.kobe.aptos.request.transaction;

import lombok.Data;

import java.util.List;


@Data
public class Payload {
    private String type;
    private String function;
    private List<String> typeArguments;
    private List<String> arguments;
    private List<String> secondarySigners;
}