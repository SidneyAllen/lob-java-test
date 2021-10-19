
# Multiple Components

## Structure

`MultipleComponents`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Recipient` | `String` | Optional | The intended recipient, typically a person's or firm's name.<br>**Constraints**: *Maximum Length*: `500` | String getRecipient() | setRecipient(String recipient) |
| `PrimaryLine` | `String` | Required | The primary delivery line (usually the street address) of the address.<br>Combination of the following applicable `components`:<br><br>* `primary_number`<br>* `street_predirection`<br>* `street_name`<br>* `street_suffix`<br>* `street_postdirection`<br>* `secondary_designator`<br>* `secondary_number`<br>* `pmb_designator`<br>* `pmb_number`<br>**Constraints**: *Maximum Length*: `500` | String getPrimaryLine() | setPrimaryLine(String primaryLine) |
| `SecondaryLine` | `String` | Optional | The secondary delivery line of the address. This field is typically empty but may contain information if `primary_line` is too long.<br>**Constraints**: *Maximum Length*: `500` | String getSecondaryLine() | setSecondaryLine(String secondaryLine) |
| `Urbanization` | `String` | Optional | Only present for addresses in Puerto Rico. An urbanization refers to an area, sector, or development within a city. See [USPS documentation](https://pe.usps.com/text/pub28/28api_008.htm#:~:text=I51.,-4%20Urbanizations&text=In%20Puerto%20Rico%2C%20identical%20street,placed%20before%20the%20urbanization%20name.) for clarification.<br>**Constraints**: *Maximum Length*: `500` | String getUrbanization() | setUrbanization(String urbanization) |
| `City` | `String` | Optional | **Constraints**: *Maximum Length*: `200` | String getCity() | setCity(String city) |
| `State` | `String` | Optional | The [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2:US) two letter code or subdivision name for the state. `city` and `state` are required if no `zip_code` is passed.<br>**Constraints**: *Maximum Length*: `50` | String getState() | setState(String state) |
| `ZipCode` | `Object` | Optional | - | Object getZipCode() | setZipCode(Object zipCode) |

## Example (as JSON)

```json
{
  "recipient": null,
  "primary_line": "primary_line0",
  "secondary_line": null,
  "urbanization": null,
  "city": null,
  "state": null,
  "zip_code": null
}
```

