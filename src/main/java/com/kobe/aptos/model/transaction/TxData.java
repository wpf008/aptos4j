package com.kobe.aptos.model.transaction;
import lombok.Data;

import java.util.List;


@Data
public class TxData {
    private String epoch;
    private List<String> failedProposerIndices;
    private String height;
    private List<Boolean> previousBlockVotes;
    private String proposer;
    private String round;
    private String timeMicroseconds;
}