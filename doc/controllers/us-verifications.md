# US Verifications

Validate, automatically correct, and standardize the addresses in your
address book based on USPS's [Coding Accuracy Support System (CASS)](https://postalpro.usps.com/certifications/cass).

## US Verifications Test Env

When verifying US addresses, you'll likely want to test against a wide array of addresses to
ensure you're handling responses correctly. With your test API key, requests that use specific
values for `address` or `primary_line` and (if using `primary_line`) an arbitrary five digit
number for `zip_code` (e.g. "11111") let you explore the responses to many types of addresses:

<table>
  <tr>
    <th style="white-space: nowrap">ADDRESS TYPE FOR SAMPLE RESPONSE</th>
    <th style="white-space: nowrap">DELIVERABILITY</th>
    <th style="white-space: nowrap">SET <code>primary_line</code> OR <code>address</code> TO</th>
  </tr>
  <tr>
    <td style="white-space: nowrap">Commercial highrise</td>
    <td style="white-space: nowrap"><code>deliverable</code></td>
    <td style="white-space: nowrap"><code>commercial highrise</code></td>
  </tr>
  <tr>
    <td style="white-space: nowrap">Residential highrise</td>
    <td style="white-space: nowrap"><code>deliverable</code></td>
    <td style="white-space: nowrap"><code>residential highrise</code></td>
  </tr>
  <tr>
    <td style="white-space: nowrap">Residential house</td>
    <td style="white-space: nowrap"><code>deliverable</code></td>
    <td style="white-space: nowrap"><code>residential house</code></td>
  </tr>
  <tr>
    <td style="white-space: nowrap">PO Box</td>
    <td style="white-space: nowrap"><code>deliverable</code></td>
    <td style="white-space: nowrap"><code>po box</code></td>
  </tr>
  <tr>
    <td style="white-space: nowrap">Rural route</td>
    <td style="white-space: nowrap"><code>deliverable</code></td>
    <td style="white-space: nowrap"><code>rural route</code></td>
  </tr>
  <tr>
    <td style="white-space: nowrap">Puerty Rico address w/ urbanization</td>
    <td style="white-space: nowrap"><code>deliverable</code></td>
    <td style="white-space: nowrap"><code>puerto rico</code></td>
  </tr>
  <tr>
    <td style="white-space: nowrap">Military address</td>
    <td style="white-space: nowrap"><code>deliverable</code></td>
    <td style="white-space: nowrap"><code>military</code></td>
  </tr>
  <tr>
    <td style="white-space: nowrap">Department of state</td>
    <td style="white-space: nowrap"><code>deliverable</code></td>
    <td style="white-space: nowrap"><code>department of state</code></td>
  </tr>
  <tr>
    <td style="white-space: nowrap">Generic deliverable</td>
    <td style="white-space: nowrap"><code>deliverable</code></td>
    <td style="white-space: nowrap"><code>deliverable</code></td>
  </tr>
  <tr>
    <td style="white-space: nowrap">Missing a suite number</td>
    <td style="white-space: nowrap"><code>deliverable_missing_unit</code></td>
    <td style="white-space: nowrap"><code>missing unit</code></td>
  </tr>
  <tr>
    <td style="white-space: nowrap">Suite number doesn't exist</td>
    <td style="white-space: nowrap"><code>deliverable_incorrect_unit</code></td>
    <td style="white-space: nowrap"><code>incorrect unit</code></td>
  </tr>
  <tr>
    <td style="white-space: nowrap">Residential house with unnecessary suite number</td>
    <td style="white-space: nowrap"><code>deliverable_unnecessary_unit</code></td>
    <td style="white-space: nowrap"><code>unnecessary unit</code></td>
  </tr>
  <tr>
    <td style="white-space: nowrap">Undeliverable and block matched</td>
    <td style="white-space: nowrap"><code>undeliverable</code></td>
    <td style="white-space: nowrap"><code>undeliverable block match</code></td>
  </tr>
  <tr>
    <td style="white-space: nowrap">Undeliverable and no block matched</td>
    <td style="white-space: nowrap"><code>undeliverable</code></td>
    <td style="white-space: nowrap"><code>undeliverable no match</code></td>
  </tr>
</table>
See the `test` request & response examples under [US Verification Examples](#operation/us_verification) within the
"Verify a US or US territory address" section in US Verifications.

You can rely on the response from these examples generally matching the response you'd see in the live environment with an
address of that type (excluding the `recipient` field).

The test API key does not perform any verification, automatic correction, or standardization for addresses. If you wish to
try these features out, use our [live demo](https://lob.com/address-verification) or the free plan (see [our pricing](https://lob.com/pricing/address-verification) for details).

```java
USVerificationsController uSVerificationsController = client.getUSVerificationsController();
```

## Class Name

`USVerificationsController`

## Methods

* [Bulk Us Verifications](/doc/controllers/us-verifications.md#bulk-us-verifications)
* [Us Verification](/doc/controllers/us-verifications.md#us-verification)


# Bulk Us Verifications

Verify a list of US or US territory addresses _with a live API key_. Requests to this endpoint with a test API key will return a dummy response based on the primary line you input.

```java
CompletableFuture<UsVerifications> bulkUsVerificationsAsync(
    final List<MultipleComponents> addresses,
    final CaseEnum mCase)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `addresses` | [`List<MultipleComponents>`](/doc/models/multiple-components.md) | Form, Required | **Constraints**: *Minimum Items*: `1`, *Maximum Items*: `10` |
| `mCase` | [`CaseEnum`](/doc/models/case-enum.md) | Query, Optional | Casing of the verified address. Possible values are `upper` and `proper` for uppercased (e.g. "PO BOX") and proper-cased (e.g. "PO Box"), respectively. Only affects `recipient`, `primary_line`, `secondary_line`, `urbanization`, and `last_line`. Default casing is `upper`.<br>**Default**: `CaseEnum.UPPER` |

## Response Type

[`UsVerifications`](/doc/models/us-verifications.md)

## Example Usage

```java
List<MultipleComponents> addresses = new LinkedList<>();

MultipleComponents addresses0 = new MultipleComponents();
addresses0.setPrimaryLine("primary_line6");
addresses.add(addresses0);

MultipleComponents addresses1 = new MultipleComponents();
addresses1.setPrimaryLine("primary_line7");
addresses.add(addresses1);

CaseEnum mCase = CaseEnum.UPPER;

uSVerificationsController.bulkUsVerificationsAsync(addresses, mCase).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](/doc/models/error-error-exception.md) |


# Us Verification

Verify a US or US territory address _with a live API key_. The address can be in components (e.g. `primary_line` is "210 King Street", `zip_code` is "94107") or as a single string (e.g. "210 King Street 94107"), but not as both. Requests using a test API key validate required fields but return empty values unless specific `primary_line` values are provided. See the [US Verifications Test Environment](#section/US-Verifications-Test-Env) for details.

```java
CompletableFuture<UsVerification> usVerificationAsync(
    final Object body,
    final CaseEnum mCase)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | `Object` | Body, Required | - |
| `mCase` | [`CaseEnum`](/doc/models/case-enum.md) | Query, Optional | Casing of the verified address. Possible values are `upper` and `proper` for uppercased (e.g. "PO BOX") and proper-cased (e.g. "PO Box"), respectively. Only affects `recipient`, `primary_line`, `secondary_line`, `urbanization`, and `last_line`. Default casing is `upper`.<br>**Default**: `CaseEnum.UPPER` |

## Response Type

[`UsVerification`](/doc/models/us-verification.md)

## Example Usage

```java
Object body = com.lob.api.ApiHelper.deserialize("{\"primary_line\":\"210 King Street\",\"city\":\"San Francisco\",\"state\":\"CA\",\"zip_code\":\"94107\"}");
CaseEnum mCase = CaseEnum.UPPER;

uSVerificationsController.usVerificationAsync(body, mCase).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](/doc/models/error-error-exception.md) |

