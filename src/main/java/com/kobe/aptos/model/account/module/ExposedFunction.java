package com.kobe.aptos.model.account.module;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ExposedFunction {
    private String name;
    private String visibility;
    private List<GenericTypeParam> genericTypeParams;
    private List<String> params;
    @JsonProperty("return")
    private List<String> returns;

}