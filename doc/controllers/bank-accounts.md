# Bank Accounts

Bank Accounts allow you to store your bank account securely in our system. The API provides
endpoints for creating bank accounts, deleting bank accounts, verifying bank accounts,
retrieving individual bank accounts, and retrieving a list of bank accounts.

```java
BankAccountsController bankAccountsController = client.getBankAccountsController();
```

## Class Name

`BankAccountsController`

## Methods

* [Verify Bank Account](/doc/controllers/bank-accounts.md#verify-bank-account)
* [Get Bank Account](/doc/controllers/bank-accounts.md#get-bank-account)
* [Delete Bank Account](/doc/controllers/bank-accounts.md#delete-bank-account)
* [List Bank Accounts](/doc/controllers/bank-accounts.md#list-bank-accounts)
* [Create Bank Account](/doc/controllers/bank-accounts.md#create-bank-account)


# Verify Bank Account

Verify a bank account in order to create a check.

```java
CompletableFuture<BankAccount> verifyBankAccountAsync(
    final String bankId,
    final List<Integer> amounts)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `bankId` | `String` | Template, Required | id of the bank account to be verified<br>**Constraints**: *Pattern*: `^bank_[a-zA-Z0-9]+$` |
| `amounts` | `List<Integer>` | Form, Required | In live mode, an array containing the two micro deposits (in cents) placed in the bank account. In test mode, no micro deposits will be placed, so any two integers between `1` and `100` will work.<br>**Constraints**: *Minimum Items*: `2`, *Maximum Items*: `2`, `>= 1`, `<= 100` |

## Response Type

[`BankAccount`](/doc/models/bank-account.md)

## Example Usage

```java
String bankId = "bank_id2";
List<Integer> amounts = new LinkedList<>();
amounts.add(80);
amounts.add(81);

bankAccountsController.verifyBankAccountAsync(bankId, amounts).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": "bank_8cad8df5354d33f",
  "signature_url": "https://lob-assets.com/letters/asd_asdfghjklqwertyu.pdf?version=45&expires=1234567890&signature=a",
  "description": "Test Bank Account",
  "metadata": {},
  "routing_number": "322271627",
  "account_number": "123456789",
  "account_type": "company",
  "signatory": "John Doe",
  "bank_name": "J.P. MORGAN CHASE BANK, N.A.",
  "verified": false,
  "date_created": "2015-11-06T19:24:24.440Z",
  "date_modified": "2015-11-06T19:24:24.440Z",
  "object": "bank_account"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](/doc/models/error-error-exception.md) |


# Get Bank Account

Retrieves the details of an existing bank account. You need only supply the unique bank account identifier that was returned upon bank account creation.

```java
CompletableFuture<BankAccount> getBankAccountAsync(
    final String bankId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `bankId` | `String` | Template, Required | id of the bank account<br>**Constraints**: *Pattern*: `^bank_[a-zA-Z0-9]+$` |

## Response Type

[`BankAccount`](/doc/models/bank-account.md)

## Example Usage

```java
String bankId = "bank_id2";

bankAccountsController.getBankAccountAsync(bankId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": "bank_8cad8df5354d33f",
  "signature_url": "https://lob-assets.com/letters/asd_asdfghjklqwertyu.pdf?version=45&expires=1234567890&signature=a",
  "description": "Test Bank Account",
  "metadata": {},
  "routing_number": "322271627",
  "account_number": "123456789",
  "account_type": "company",
  "signatory": "John Doe",
  "bank_name": "J.P. MORGAN CHASE BANK, N.A.",
  "verified": false,
  "date_created": "2015-11-06T19:24:24.440Z",
  "date_modified": "2015-11-06T19:24:24.440Z",
  "object": "bank_account"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](/doc/models/error-error-exception.md) |


# Delete Bank Account

Permanently deletes a bank account. It cannot be undone.

```java
CompletableFuture<BankDeletion> deleteBankAccountAsync(
    final String bankId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `bankId` | `String` | Template, Required | id of the bank account<br>**Constraints**: *Pattern*: `^bank_[a-zA-Z0-9]+$` |

## Response Type

[`BankDeletion`](/doc/models/bank-deletion.md)

## Example Usage

```java
String bankId = "bank_id2";

bankAccountsController.deleteBankAccountAsync(bankId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": "bank_123456789",
  "deleted": true
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](/doc/models/error-error-exception.md) |


# List Bank Accounts

Returns a list of your bank accounts. The bank accounts are returned sorted by creation date, with the most recently created bank accounts appearing first.

```java
CompletableFuture<AllBankAccounts> listBankAccountsAsync(
    final Integer limit,
    final Object beforeAfter,
    final Object include,
    final LocalDateTime dateCreated)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `limit` | `Integer` | Query, Optional | How many results to return.<br>**Default**: `10`<br>**Constraints**: `>= 1`, `<= 100` |
| `beforeAfter` | `Object` | Query, Optional | `before` and `after` are both optional but only one of them can be in the query at a time. |
| `include` | `Object` | Query, Optional | Request that the response include the total count by specifying `include[]=total_count`. |
| `dateCreated` | `LocalDateTime` | Query, Optional | Filter by ISO-8601 date or datetime, e.g. `{ gt: '2012-01-01', lt: '2012-01-31T12:34:56Z' }` where `gt` is >, `lt` is <, `gte` is ≥, and `lte` is ≤. |

## Response Type

[`AllBankAccounts`](/doc/models/all-bank-accounts.md)

## Example Usage

```java
Integer limit = 10;

bankAccountsController.listBankAccountsAsync(limit, null, null, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "data": [
    {
      "id": "bank_0e3fb07eba0b35b",
      "signature_url": "https://lob-assets.com/letters/asd_asdfghjklqwertyu.pdf?version=45&expires=1234567890&signature=a",
      "description": "Example bank account",
      "metadata": {},
      "routing_number": "122100024",
      "account_number": "1234564789",
      "account_type": "company",
      "signatory": "John Doe",
      "bank_name": "JPMORGAN CHASE BANK, NA",
      "verified": true,
      "date_created": "2019-03-30T13:13:22.200Z",
      "date_modified": "2019-03-30T13:13:23.385Z",
      "object": "bank_account"
    },
    {
      "id": "bank_eba93f7de3c02d9",
      "description": "Example bank account",
      "metadata": {},
      "routing_number": "122100024",
      "account_number": "1234564789",
      "account_type": "company",
      "signatory": "John Doe",
      "bank_name": "JPMORGAN CHASE BANK, NA",
      "verified": true,
      "date_created": "2019-03-30T13:11:06.809Z",
      "date_modified": "2019-03-30T13:11:07.872Z",
      "object": "bank_account"
    }
  ],
  "object": "list",
  "next_url": "https://api.lob.com/v1/bank_accounts?limit=2&after=eyJkYXRlT2Zmc2V0IjoiMjAxOS0wMy0zMFQxMzoxMTowNi44MDlaIiwiaWRPZmZzZXQiOiJiYW5rX2ViYTkzZjdkZTNjMDJkOSJ9",
  "previous_url": null,
  "count": 2
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](/doc/models/error-error-exception.md) |


# Create Bank Account

Creates a new bank account with the provided properties. Bank accounts created in live mode will need to be verified via micro deposits before being able to send live checks. The deposits will appear in the bank account in 2-3 business days and have the description "VERIFICATION".

```java
CompletableFuture<BankAccount> createBankAccountAsync(
    final String routingNumber,
    final String accountNumber,
    final AccountTypeEnum accountType,
    final String signatory,
    final String description,
    final Metadata metadata)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `routingNumber` | `String` | Form, Required | Must be a [valid US routing number](https://www.frbservices.org/index.html).<br>**Constraints**: *Minimum Length*: `9`, *Maximum Length*: `9` |
| `accountNumber` | `String` | Form, Required | **Constraints**: *Maximum Length*: `17` |
| `accountType` | [`AccountTypeEnum`](/doc/models/account-type-enum.md) | Form, Required | The type of entity that holds the account. |
| `signatory` | `String` | Form, Required | The signatory associated with your account. This name will be printed on checks created with this bank account. If you prefer to use a custom signature image on your checks instead, please create your bank account from the [Dashboard](https://dashboard.lob.com/#/login).<br>**Constraints**: *Maximum Length*: `30` |
| `description` | `String` | Form, Optional | An internal description that identifies this resource. Must be no longer than 255 characters.<br>**Constraints**: *Maximum Length*: `255` |
| `metadata` | [`Metadata`](/doc/models/metadata.md) | Form, Optional | Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `"` and `\`. Nested objects are not supported. See [Metadata](#section/Metadata) for more information. |

## Response Type

[`BankAccount`](/doc/models/bank-account.md)

## Example Usage

```java
String routingNumber = "routing_number4";
String accountNumber = "account_number0";
AccountTypeEnum accountType = AccountTypeEnum.COMPANY;
String signatory = "signatory4";
Metadata metadata = new Metadata();

bankAccountsController.createBankAccountAsync(routingNumber, accountNumber, accountType, signatory, null, metadata).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": "bank_8cad8df5354d33f",
  "signature_url": "https://lob-assets.com/letters/asd_asdfghjklqwertyu.pdf?version=45&expires=1234567890&signature=a",
  "description": "Test Bank Account",
  "metadata": {},
  "routing_number": "322271627",
  "account_number": "123456789",
  "account_type": "company",
  "signatory": "John Doe",
  "bank_name": "J.P. MORGAN CHASE BANK, N.A.",
  "verified": false,
  "date_created": "2015-11-06T19:24:24.440Z",
  "date_modified": "2015-11-06T19:24:24.440Z",
  "object": "bank_account"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](/doc/models/error-error-exception.md) |

