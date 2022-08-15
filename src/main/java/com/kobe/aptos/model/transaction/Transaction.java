/**
  * Copyright 2022 bejson.com 
  */
package com.kobe.aptos.model.transaction;
import java.util.List;

/**
 * Auto-generated: 2022-08-15 22:22:8
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Transaction {

    private String type;
    private String version;
    private String hash;
    private String state_root_hash;
    private String event_root_hash;
    private String gas_used;
    private boolean success;
    private String vm_status;
    private String accumulator_root_hash;
    private List<Changes> changes;
    private String id;
    private String epoch;
    private String round;
    private List<Events> events;
    private List<boolean> previous_block_votes;
    private String proposer;
    private List<Integer> failed_proposer_indices;
    private String timestamp;
    public void setType(String type) {
         this.type = type;
     }
     public String getType() {
         return type;
     }

    public void setVersion(String version) {
         this.version = version;
     }
     public String getVersion() {
         return version;
     }

    public void setHash(String hash) {
         this.hash = hash;
     }
     public String getHash() {
         return hash;
     }

    public void setState_root_hash(String state_root_hash) {
         this.state_root_hash = state_root_hash;
     }
     public String getState_root_hash() {
         return state_root_hash;
     }

    public void setEvent_root_hash(String event_root_hash) {
         this.event_root_hash = event_root_hash;
     }
     public String getEvent_root_hash() {
         return event_root_hash;
     }

    public void setGas_used(String gas_used) {
         this.gas_used = gas_used;
     }
     public String getGas_used() {
         return gas_used;
     }

    public void setSuccess(boolean success) {
         this.success = success;
     }
     public boolean getSuccess() {
         return success;
     }

    public void setVm_status(String vm_status) {
         this.vm_status = vm_status;
     }
     public String getVm_status() {
         return vm_status;
     }

    public void setAccumulator_root_hash(String accumulator_root_hash) {
         this.accumulator_root_hash = accumulator_root_hash;
     }
     public String getAccumulator_root_hash() {
         return accumulator_root_hash;
     }

    public void setChanges(List<Changes> changes) {
         this.changes = changes;
     }
     public List<Changes> getChanges() {
         return changes;
     }

    public void setId(String id) {
         this.id = id;
     }
     public String getId() {
         return id;
     }

    public void setEpoch(String epoch) {
         this.epoch = epoch;
     }
     public String getEpoch() {
         return epoch;
     }

    public void setRound(String round) {
         this.round = round;
     }
     public String getRound() {
         return round;
     }

    public void setEvents(List<Events> events) {
         this.events = events;
     }
     public List<Events> getEvents() {
         return events;
     }

    public void setPrevious_block_votes(List<boolean> previous_block_votes) {
         this.previous_block_votes = previous_block_votes;
     }
     public List<boolean> getPrevious_block_votes() {
         return previous_block_votes;
     }

    public void setProposer(String proposer) {
         this.proposer = proposer;
     }
     public String getProposer() {
         return proposer;
     }

    public void setFailed_proposer_indices(List<Integer> failed_proposer_indices) {
         this.failed_proposer_indices = failed_proposer_indices;
     }
     public List<Integer> getFailed_proposer_indices() {
         return failed_proposer_indices;
     }

    public void setTimestamp(String timestamp) {
         this.timestamp = timestamp;
     }
     public String getTimestamp() {
         return timestamp;
     }

}