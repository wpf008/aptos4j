# aptos4j
Java wrapper for the Aptos API.
<a href="https://aptos.dev">
<img width="100%" src="./aptos_banner.png" alt="Aptos Banner" />
</a>

## Usage

This API client covers all Aptos's API endpoints and I'll try to update it when new endpoints are added.

For complete API documentation please refer to https://fullnode.devnet.aptoslabs.com/spec.html#/.

For examples
Goto: <a href="https://github.com/wpf008/aptos4j/blob/master/src/test/java/com/kobe/aptos/examples">examples</a>.

```
AptosApiClient client = new AptosApiClientImpl();
LedgerInformation ledgerInformation = client.ledgerInformation();
```
To get transactions

```
List<Transaction> transactions = client.getTransactions(1, 10);
```

## License

MIT License

Copyright (c) 2022 wpf008

