
# Multiple Components List

## Structure

`MultipleComponentsList`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Addresses` | [`List<MultipleComponents>`](/doc/models/multiple-components.md) | Required | **Constraints**: *Minimum Items*: `1`, *Maximum Items*: `10` | List<MultipleComponents> getAddresses() | setAddresses(List<MultipleComponents> addresses) |

## Example (as JSON)

```json
{
  "addresses": [
    {
      "recipient": null,
      "primary_line": "primary_line6",
      "secondary_line": null,
      "urbanization": null,
      "city": null,
      "state": null,
      "zip_code": null
    },
    {
      "recipient": null,
      "primary_line": "primary_line7",
      "secondary_line": null,
      "urbanization": null,
      "city": null,
      "state": null,
      "zip_code": null
    }
  ]
}
```

