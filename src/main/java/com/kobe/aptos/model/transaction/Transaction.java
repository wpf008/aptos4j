
package com.kobe.aptos.model.transaction;

import lombok.Data;

import java.util.List;


@Data
public class Transaction {
    private String type;
    private String version;
    private String hash;
    private String stateRootHash;
    private String eventRootHash;
    private String gasUsed;
    private boolean success;
    private String vmStatus;
    private String accumulatorRootHash;
    private List<Changes> changes;
    private String id;
    private String epoch;
    private String round;
    private List<Events> events;
    private List<Boolean> previousBlockVotes;
    private String proposer;
    private List<Integer> failedProposerIndices;
    private String timestamp;
}