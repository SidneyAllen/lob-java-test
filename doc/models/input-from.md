
# Input From

## Structure

`InputFrom`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `From` | `Object` | Optional | Must either be an address ID or an inline object with correct address parameters. Must be a US address unless using a `custom_envelope`. All addresses will be standardized into uppercase without being modified by verification. | Object getFrom() | setFrom(Object from) |

## Example (as JSON)

```json
{
  "from": null
}
```

