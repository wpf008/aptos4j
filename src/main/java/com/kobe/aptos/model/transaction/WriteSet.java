package com.kobe.aptos.model.transaction;

import lombok.Data;


@Data
public class WriteSet {

    private String type;
    private String executeAs;
    private Script script;

}