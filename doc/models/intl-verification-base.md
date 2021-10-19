
# Intl Verification Base

## Structure

`IntlVerificationBase`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Recipient` | `String` | Optional | The intended recipient, typically a person's or firm's name.<br>**Constraints**: *Maximum Length*: `500` | String getRecipient() | setRecipient(String recipient) |
| `PrimaryLine` | `String` | Optional | The primary delivery line (usually the street address) of the address.<br>**Constraints**: *Maximum Length*: `200` | String getPrimaryLine() | setPrimaryLine(String primaryLine) |
| `SecondaryLine` | `String` | Optional | The secondary delivery line of the address. This field is typically empty but may contain information if `primary_line` is too long.<br>**Constraints**: *Maximum Length*: `500` | String getSecondaryLine() | setSecondaryLine(String secondaryLine) |

## Example (as JSON)

```json
{
  "recipient": null,
  "primary_line": null,
  "secondary_line": null
}
```

