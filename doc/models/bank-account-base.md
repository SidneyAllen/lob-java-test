
# Bank Account Base

## Structure

`BankAccountBase`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | An internal description that identifies this resource. Must be no longer than 255 characters.<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `RoutingNumber` | `String` | Required | Must be a [valid US routing number](https://www.frbservices.org/index.html).<br>**Constraints**: *Minimum Length*: `9`, *Maximum Length*: `9` | String getRoutingNumber() | setRoutingNumber(String routingNumber) |
| `AccountNumber` | `String` | Required | **Constraints**: *Maximum Length*: `17` | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `AccountType` | [`AccountTypeEnum`](/doc/models/account-type-enum.md) | Required | The type of entity that holds the account. | AccountTypeEnum getAccountType() | setAccountType(AccountTypeEnum accountType) |
| `Signatory` | `String` | Required | The signatory associated with your account. This name will be printed on checks created with this bank account. If you prefer to use a custom signature image on your checks instead, please create your bank account from the [Dashboard](https://dashboard.lob.com/#/login).<br>**Constraints**: *Maximum Length*: `30` | String getSignatory() | setSignatory(String signatory) |
| `Metadata` | [`Metadata`](/doc/models/metadata.md) | Optional | Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `"` and `\`. Nested objects are not supported. See [Metadata](#section/Metadata) for more information. | Metadata getMetadata() | setMetadata(Metadata metadata) |

## Example (as JSON)

```json
{
  "description": null,
  "routing_number": "routing_number4",
  "account_number": "account_number0",
  "account_type": "company",
  "signatory": "signatory4",
  "metadata": null
}
```

