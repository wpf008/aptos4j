package com.kobe.aptos.model.transaction;
import java.util.List;


@lombok.Data
public class Data {
    private String epoch;
    private List<String> failedProposerIndices;
    private String height;
    private List<Boolean> previousBlockVotes;
    private String proposer;
    private String round;
    private String timeMicroseconds;
}