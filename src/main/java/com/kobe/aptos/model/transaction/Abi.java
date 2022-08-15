package com.kobe.aptos.model.transaction;
import lombok.Data;

import java.util.List;

@Data
public class Abi {
    private String name;
    private String visibility;
    private List<GenericTypeParams> genericTypeParams;
    private List<String> params;
}