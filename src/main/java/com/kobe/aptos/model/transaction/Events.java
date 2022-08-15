/**
  * Copyright 2022 bejson.com 
  */
package com.kobe.aptos.model.transaction;

/**
 * Auto-generated: 2022-08-15 22:22:8
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Events {

    private String key;
    private String sequence_number;
    private String type;
    private Data data;
    public void setKey(String key) {
         this.key = key;
     }
     public String getKey() {
         return key;
     }

    public void setSequence_number(String sequence_number) {
         this.sequence_number = sequence_number;
     }
     public String getSequence_number() {
         return sequence_number;
     }

    public void setType(String type) {
         this.type = type;
     }
     public String getType() {
         return type;
     }

    public void setData(Data data) {
         this.data = data;
     }
     public Data getData() {
         return data;
     }

}