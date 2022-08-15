package com.kobe.aptos.model.transaction;

import lombok.Data;

@Data
public class NewBlockEvents {
    private String counter;
    private Guid guid;
}