
# Intl Verification

## Structure

`IntlVerification`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Recipient` | `String` | Optional | The intended recipient, typically a person's or firm's name.<br>**Constraints**: *Maximum Length*: `500` | String getRecipient() | setRecipient(String recipient) |
| `PrimaryLine` | `String` | Optional | The primary delivery line (usually the street address) of the address.<br>**Constraints**: *Maximum Length*: `200` | String getPrimaryLine() | setPrimaryLine(String primaryLine) |
| `SecondaryLine` | `String` | Optional | The secondary delivery line of the address. This field is typically empty but may contain information if `primary_line` is too long.<br>**Constraints**: *Maximum Length*: `500` | String getSecondaryLine() | setSecondaryLine(String secondaryLine) |
| `Id` | `String` | Optional | Unique identifier prefixed with `intl_ver_`.<br>**Constraints**: *Pattern*: `^intl_ver_[a-zA-Z0-9]+$` | String getId() | setId(String id) |
| `LastLine` | `String` | Optional | Combination of the following applicable `components`:<br><br>* `city`<br>* `state`<br>* `zip_code`<br>* `zip_code_plus_4` | String getLastLine() | setLastLine(String lastLine) |
| `Country` | `String` | Optional | The country of the address. Will be returned as a 2 letter country short-name code (ISO 3166). | String getCountry() | setCountry(String country) |
| `Coverage` | [`CoverageEnum`](/doc/models/coverage-enum.md) | Optional | The coverage level for the country. This represents the maximum level of<br>accuracy an input address can be verified to.<br><br>* `SUBBUILDING` - Coverage down to unit numbers. For example, in an apartment or a large building<br>* `HOUSENUMBER/BUILDING` - Coverage down to house number. For example, the address where a house or building may be located<br>* `STREET` - Coverage down to street. This means that we can verify that an street exists in a city, state, country<br>* `LOCALITY` - Coverage down to city, state, or village or province. This means that we can verify that a city, village, province, or state exists in a country. Countries differ in how they define what is a province, state, city, village, etc. This attempts to group eveyrthing together.<br>* `SPARSE` - Some addresses for this country exist in our databases | CoverageEnum getCoverage() | setCoverage(CoverageEnum coverage) |
| `Deliverability` | [`Deliverability1Enum`](/doc/models/deliverability-1-enum.md) | Optional | Summarizes the deliverability of the `intl_verification` object. Possible values are:<br><br>* `deliverable` — The address is deliverable.<br>* `deliverable_missing_info` — The address is missing some information, but is most likely deliverable.<br>* `undeliverable` — The address is most likely not deliverable. Some components of the address (such as city or postal code) may have been found.<br>* `no_match` — This address is not deliverable. No matching street could be found within the city or postal code. | Deliverability1Enum getDeliverability() | setDeliverability(Deliverability1Enum deliverability) |
| `Status` | [`StatusEnum`](/doc/models/status-enum.md) | Optional | The status level for the country. This represents the maximum level of<br>accuracy an input address can be verified to.<br><br>* `LV4` - Verified. The input data is correct. All input data was able to match in databases.<br>* `LV3` - Verified. The input data is correct. All input data was able to match in databases <em>after</em> some or all elements were standarized. The input data may also be using outdated city, state, or country names.<br>* `LV2` - Verified. The input data is correct although some input data is unverifiable due to incomplete data.<br>* `LV1` - Verified. The input data is acceptable but in an attempt to standarize user input, errors were introduced.<br>* `LF4` - Fixed. The input data is matched and fixed. (Example: Brighon, UK -> Brighton, UK)<br>* `LF3` - Fixed. The input data is matched and fixed but some elements such as Subbuilding number and house number cannot be checked.<br>* `LF2` - Fixed. The input data is matched but some elements such as Street cannot be checked.<br>* `LF1` - Fixed. The input data is acceptable but in an attempt to standarize user input, errors were introduced.<br>* `LM4` - Missing Info. The input data cannot be corrected completely.<br>* `LM3` - Missing Info. The input data cannot be corrected completely and there were multiple matches found in databases.<br>* `LM2` - Missing Info. The input data cannot be corrected completely and only some elements were found.<br>* `LU1` - Unverified. The input data cannot be corrected or matched. | StatusEnum getStatus() | setStatus(StatusEnum status) |
| `Components` | [`IntlComponents`](/doc/models/intl-components.md) | Optional | A nested object containing a breakdown of each component of an address. | IntlComponents getComponents() | setComponents(IntlComponents components) |
| `Object` | `String` | Optional | - | String getObject() | setObject(String object) |

## Example (as JSON)

```json
{
  "recipient": null,
  "primary_line": null,
  "secondary_line": null,
  "id": null,
  "last_line": null,
  "country": null,
  "coverage": null,
  "deliverability": null,
  "status": null,
  "components": null,
  "object": null
}
```

