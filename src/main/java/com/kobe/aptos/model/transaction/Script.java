package com.kobe.aptos.model.transaction;
import lombok.Data;

import java.util.List;

@Data
public class Script {

    private Code code;
    private List<String> typeArguments;
    private List<String> arguments;

}