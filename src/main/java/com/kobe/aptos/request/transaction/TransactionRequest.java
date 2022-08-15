
package com.kobe.aptos.request.transaction;

public class TransactionRquest {

    private String sender;
    private String sequence_number;
    private String max_gas_amount;
    private String gas_unit_price;
    private String gas_currency_code;
    private String expiration_timestamp_secs;
    private Payload payload;
    private Signature signature;
    public void setSender(String sender) {
         this.sender = sender;
     }
     public String getSender() {
         return sender;
     }

    public void setSequence_number(String sequence_number) {
         this.sequence_number = sequence_number;
     }
     public String getSequence_number() {
         return sequence_number;
     }

    public void setMax_gas_amount(String max_gas_amount) {
         this.max_gas_amount = max_gas_amount;
     }
     public String getMax_gas_amount() {
         return max_gas_amount;
     }

    public void setGas_unit_price(String gas_unit_price) {
         this.gas_unit_price = gas_unit_price;
     }
     public String getGas_unit_price() {
         return gas_unit_price;
     }

    public void setGas_currency_code(String gas_currency_code) {
         this.gas_currency_code = gas_currency_code;
     }
     public String getGas_currency_code() {
         return gas_currency_code;
     }

    public void setExpiration_timestamp_secs(String expiration_timestamp_secs) {
         this.expiration_timestamp_secs = expiration_timestamp_secs;
     }
     public String getExpiration_timestamp_secs() {
         return expiration_timestamp_secs;
     }

    public void setPayload(Payload payload) {
         this.payload = payload;
     }
     public Payload getPayload() {
         return payload;
     }

    public void setSignature(Signature signature) {
         this.signature = signature;
     }
     public Signature getSignature() {
         return signature;
     }

}