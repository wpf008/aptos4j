/**
  * Copyright 2022 bejson.com 
  */
package com.kobe.aptos.request.transaction;
import java.util.List;

/**
 * Auto-generated: 2022-08-15 22:40:24
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Payload {

    private String type;
    private String function;
    private List<String> type_arguments;
    private List<String> arguments;
    public void setType(String type) {
         this.type = type;
     }
     public String getType() {
         return type;
     }

    public void setFunction(String function) {
         this.function = function;
     }
     public String getFunction() {
         return function;
     }

    public void setType_arguments(List<String> type_arguments) {
         this.type_arguments = type_arguments;
     }
     public List<String> getType_arguments() {
         return type_arguments;
     }

    public void setArguments(List<String> arguments) {
         this.arguments = arguments;
     }
     public List<String> getArguments() {
         return arguments;
     }

}