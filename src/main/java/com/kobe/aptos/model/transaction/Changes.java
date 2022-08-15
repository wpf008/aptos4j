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
public class Changes {

    private String type;
    private String address;
    private String state_key_hash;
    private Data data;
    public void setType(String type) {
         this.type = type;
     }
     public String getType() {
         return type;
     }

    public void setAddress(String address) {
         this.address = address;
     }
     public String getAddress() {
         return address;
     }

    public void setState_key_hash(String state_key_hash) {
         this.state_key_hash = state_key_hash;
     }
     public String getState_key_hash() {
         return state_key_hash;
     }

    public void setData(Data data) {
         this.data = data;
     }
     public Data getData() {
         return data;
     }

}