/**
  * Copyright 2022 bejson.com 
  */
package com.kobe.aptos.request.transaction;

/**
 * Auto-generated: 2022-08-15 22:40:24
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Signature {

    private String type;
    private String public_key;
    private String signature;
    public void setType(String type) {
         this.type = type;
     }
     public String getType() {
         return type;
     }

    public void setPublic_key(String public_key) {
         this.public_key = public_key;
     }
     public String getPublic_key() {
         return public_key;
     }

    public void setSignature(String signature) {
         this.signature = signature;
     }
     public String getSignature() {
         return signature;
     }

}