package com.kobe.aptos.request.transaction;

import lombok.Data;


@Data
public class Signature {
    private String type;
    private String publicKey;
    private String signature;
}