
# Suggestions

## Structure

`Suggestions`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PrimaryLine` | `String` | Required | The primary delivery line (usually the street address) of the address.<br>Combination of the following applicable `components` (primary number &<br>secondary information may be missing or inaccurate):<br><br>* `primary_number`<br>* `street_predirection`<br>* `street_name`<br>* `street_suffix`<br>* `street_postdirection`<br>* `secondary_designator`<br>* `secondary_number`<br>* `pmb_designator`<br>* `pmb_number` | String getPrimaryLine() | setPrimaryLine(String primaryLine) |
| `City` | `String` | Required | **Constraints**: *Maximum Length*: `200` | String getCity() | setCity(String city) |
| `State` | `String` | Required | The [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) two letter code for the state.<br>**Constraints**: *Maximum Length*: `2` | String getState() | setState(String state) |
| `ZipCode` | `Object` | Required | - | Object getZipCode() | setZipCode(Object zipCode) |
| `Object` | `String` | Optional | - | String getObject() | setObject(String object) |

## Example (as JSON)

```json
{
  "primary_line": "primary_line0",
  "city": "city0",
  "state": "state4",
  "zip_code": {
    "key1": "val1",
    "key2": "val2"
  },
  "object": null
}
```

