package com.kobe.aptos.model;

import lombok.Data;

@Data
public class LedgerInformation {
//    private int chain_id;
//    private String epoch;
//    private String ledger_version;
//    private String oldest_ledger_version;
//    private String block_height;
//    private String oldest_block_height;
//    private String ledger_timestamp;
//    private String node_role;

    private int chainId;
    private String ledgerVersion;
    private String oldestLedgerVersion;
    private String blockHeight;
    private String oldestBlockHeight;
    private String ledgerTimestamp;
    private String nodeRole;
}
