
# Intl Verifications Payload

## Structure

`IntlVerificationsPayload`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Addresses` | [`List<MultipleComponentsIntl>`](/doc/models/multiple-components-intl.md) | Required | **Constraints**: *Minimum Items*: `1`, *Maximum Items*: `10` | List<MultipleComponentsIntl> getAddresses() | setAddresses(List<MultipleComponentsIntl> addresses) |

## Example (as JSON)

```json
{
  "addresses": [
    {
      "recipient": null,
      "primary_line": "primary_line6",
      "secondary_line": null,
      "city": null,
      "state": null,
      "postal_code": null,
      "country": "TK"
    },
    {
      "recipient": null,
      "primary_line": "primary_line7",
      "secondary_line": null,
      "city": null,
      "state": null,
      "postal_code": null,
      "country": "TL"
    }
  ]
}
```

