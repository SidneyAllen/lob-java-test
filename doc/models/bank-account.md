
# Bank Account

## Structure

`BankAccount`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | An internal description that identifies this resource. Must be no longer than 255 characters.<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `RoutingNumber` | `String` | Required | Must be a [valid US routing number](https://www.frbservices.org/index.html).<br>**Constraints**: *Minimum Length*: `9`, *Maximum Length*: `9` | String getRoutingNumber() | setRoutingNumber(String routingNumber) |
| `AccountNumber` | `String` | Required | **Constraints**: *Maximum Length*: `17` | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `AccountType` | [`AccountTypeEnum`](/doc/models/account-type-enum.md) | Required | The type of entity that holds the account. | AccountTypeEnum getAccountType() | setAccountType(AccountTypeEnum accountType) |
| `Signatory` | `String` | Required | The signatory associated with your account. This name will be printed on checks created with this bank account. If you prefer to use a custom signature image on your checks instead, please create your bank account from the [Dashboard](https://dashboard.lob.com/#/login).<br>**Constraints**: *Maximum Length*: `30` | String getSignatory() | setSignatory(String signatory) |
| `Metadata` | [`Metadata`](/doc/models/metadata.md) | Optional | Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `"` and `\`. Nested objects are not supported. See [Metadata](#section/Metadata) for more information. | Metadata getMetadata() | setMetadata(Metadata metadata) |
| `DateCreated` | `LocalDateTime` | Required | A timestamp in ISO 8601 format of the date the resource was created. | LocalDateTime getDateCreated() | setDateCreated(LocalDateTime dateCreated) |
| `DateModified` | `LocalDateTime` | Required | A timestamp in ISO 8601 format of the date the resource was last modified. | LocalDateTime getDateModified() | setDateModified(LocalDateTime dateModified) |
| `Deleted` | `Boolean` | Optional | Only returned if the resource has been successfully deleted. | Boolean getDeleted() | setDeleted(Boolean deleted) |
| `Object` | `String` | Required | Value is type of resource. | String getObject() | setObject(String object) |
| `Id` | `String` | Required | **Constraints**: *Pattern*: `^bank_[a-zA-Z0-9]+$` | String getId() | setId(String id) |
| `SignatureUrl` | `String` | Optional | - | String getSignatureUrl() | setSignatureUrl(String signatureUrl) |
| `BankName` | `String` | Optional | The name of the bank based on the provided routing number, e.g. `JPMORGAN CHASE BANK`. | String getBankName() | setBankName(String bankName) |
| `Verified` | `Boolean` | Optional | A bank account must be verified before a check can be created. More info [here](#operation/verify_bank_account).<br>**Default**: `false`<br>*Default: `false`* | Boolean getVerified() | setVerified(Boolean verified) |

## Example (as JSON)

```json
{
  "id": "bank_a",
  "signature_url": "https://lob-assets.com/bank-accounts/asd_asdfghjkqwertyui.pdf?expires=1234567890&signature=aksdf",
  "bank_name": "JPMORGAN CHASE BANK",
  "verified": true,
  "object": "bank_account",
  "description": "Test Bank Account",
  "routing_number": "322271627",
  "account_number": "123456789",
  "signatory": "Jane Doe",
  "account_type": "individual",
  "metadat": {
    "spiffy": true
  },
  "date_created": "2019-08-08T19:34:47.571Z",
  "date_modified": "2019-08-08T19:34:47.571Z"
}
```

