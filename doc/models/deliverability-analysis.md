
# Deliverability Analysis

A nested object containing a breakdown of the deliverability of an address.

## Structure

`DeliverabilityAnalysis`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DpvConfirmation` | [`DpvConfirmationEnum`](/doc/models/dpv-confirmation-enum.md) | Required | Result of Delivery Point Validation (DPV), which determines whether or not the address is deliverable by the USPS. Possible values are:<br><br>* `Y` –– The address is deliverable by the USPS.<br>* `S` –– The address is deliverable by removing the provided secondary unit designator. This information may be incorrect or unnecessary.<br>* `D` –– The address is deliverable to the building's default address but is missing a secondary unit designator and/or number.<br>  There is a chance the mail will not reach the intended recipient.<br>* `N` –– The address is not deliverable according to the USPS, but parts of the address are valid (such as the street and ZIP code).<br>* `''` –– This address is not deliverable. No matching street could be found within the city or ZIP code. | DpvConfirmationEnum getDpvConfirmation() | setDpvConfirmation(DpvConfirmationEnum dpvConfirmation) |
| `DpvCmra` | [`DpvCmraEnum`](/doc/models/dpv-cmra-enum.md) | Required | Indicates whether or not the address is [CMRA-authorized](https://en.wikipedia.org/wiki/Commercial_mail_receiving_agency). Possible values are:<br><br>* `Y` –– Address is CMRA-authorized.<br>* `N` –– Address is not CMRA-authorized.<br>* `''` –– A DPV match is not made (`deliverability_analysis[dpv_confirmation]` is `N` or an empty string). | DpvCmraEnum getDpvCmra() | setDpvCmra(DpvCmraEnum dpvCmra) |
| `DpvVacant` | [`DpvVacantEnum`](/doc/models/dpv-vacant-enum.md) | Required | Indicates that an address was once deliverable, but has become vacant and is no longer receiving deliveries. Possible values are:<br><br>* `Y` –– Address is vacant.<br>* `N` –– Address is not vacant.<br>* `''` –– A DPV match is not made (`deliverability_analysis[dpv_confirmation]` is `N` or an empty string). | DpvVacantEnum getDpvVacant() | setDpvVacant(DpvVacantEnum dpvVacant) |
| `DpvActive` | [`DpvActiveEnum`](/doc/models/dpv-active-enum.md) | Required | Corresponds to the USPS field `dpv_no_stat`. Indicates that an address has been vacated in the recent past, and is no longer receiving deliveries. If it's been unoccupied for 90+ days, or temporarily vacant, this will be flagged. Possible values are:<br><br>* `Y` –– Address is active.<br>* `N` –– Address is not active.<br>* `''` –– A DPV match is not made (`deliverability_analysis[dpv_confirmation]` is `N` or an empty string). | DpvActiveEnum getDpvActive() | setDpvActive(DpvActiveEnum dpvActive) |
| `DpvFootnotes` | [`List<DpvFootnoteEnum>`](/doc/models/dpv-footnote-enum.md) | Required | An array of 2-character strings that gives more insight into how `deliverability_analysis[dpv_confirmation]` was determined. Will always include at least 1 string, and can include up to 3. For details, see [US Verification Details](#tag/US-Verification-Types). | List<DpvFootnoteEnum> getDpvFootnotes() | setDpvFootnotes(List<DpvFootnoteEnum> dpvFootnotes) |
| `EwsMatch` | `boolean` | Required | Indicates whether or not an address has been flagged in the [Early Warning System](https://docs.informatica.com/data-engineering/data-engineering-quality/10-4-0/address-validator-port-reference/postal-carrier-certification-data-ports/early-warning-system-return-code.html), meaning the address is under development and not yet ready to receive mail. However, it should become available in a few months. | boolean getEwsMatch() | setEwsMatch(boolean ewsMatch) |
| `LacsIndicator` | [`LacsIndicatorEnum`](/doc/models/lacs-indicator-enum.md) | Required | Indicates whether this address has been converted by<br>[LACS<sup>Link</sup>](https://postalpro.usps.com/address-quality/lacslink).<br>LACS<sup>Link</sup> corrects outdated addresses into their modern counterparts.<br>Possible values are:<br><br>* `Y` –– New address produced with a matching record in LACS<sup>Link</sup>.<br>* `N` –– New address could not be produced with a matching record in LACS<sup>Link</sup>.<br>* `''` –– A DPV match is not made (`deliverability_analysis[dpv_confirmation]` is `N` or an empty string). | LacsIndicatorEnum getLacsIndicator() | setLacsIndicator(LacsIndicatorEnum lacsIndicator) |
| `LacsReturnCode` | `String` | Required | A code indicating how `deliverability_analysis[lacs_indicator]` was determined.<br>Possible values are:<br><br>* `A` — A new address was produced because a match was found in LACS<sup>Link</sup>.<br>* `92` — A LACS<sup>Link</sup> record was matched after dropping secondary information.<br>* `14` — A match was found in LACS<sup>Link</sup>, but could not be converted to a deliverable address.<br>* `00` — A match was not found in LACS<sup>Link</sup>, and no new address was produced.<br>* `''` — LACS<sup>Link</sup> was not attempted. | String getLacsReturnCode() | setLacsReturnCode(String lacsReturnCode) |
| `SuiteReturnCode` | [`SuiteReturnCodeEnum`](/doc/models/suite-return-code-enum.md) | Required | A return code that indicates whether the address was matched and corrected by<br>[Suite<sup>Link</sup>](https://postalpro.usps.com/address-quality-solutions/suitelink).<br>Suite<sup>Link</sup> attempts to provide secondary information to business addresses.<br>Possible values are:<br><br>* `A` –– A Suite<sup>Link</sup> match was found and secondary information was added.<br>* `00` –– A Suite<sup>Link</sup> match could not be found and no secondary information was added.<br>* `''` –– Suite<sup>Link</sup> lookup was not attempted. | SuiteReturnCodeEnum getSuiteReturnCode() | setSuiteReturnCode(SuiteReturnCodeEnum suiteReturnCode) |

## Example (as JSON)

```json
{
  "dpv_confirmation": "Y",
  "dpv_cmra": "N",
  "dpv_vacant": "N",
  "dpv_active": "Y",
  "dpv_footnotes": [
    "AA",
    "BB"
  ],
  "ews_match": false,
  "lacs_indicator": null,
  "lacs_return_code": null,
  "suite_return_code": null
}
```

