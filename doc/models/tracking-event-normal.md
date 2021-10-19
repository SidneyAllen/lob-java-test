
# Tracking Event Normal

## Structure

`TrackingEventNormal`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | Unique identifier prefixed with `evnt_`.<br>**Constraints**: *Pattern*: `^evnt_[a-zA-Z0-9]+$` | String getId() | setId(String id) |
| `Time` | `LocalDateTime` | Optional | A timestamp in ISO 8601 format of the date USPS registered the event. | LocalDateTime getTime() | setTime(LocalDateTime time) |
| `DateCreated` | `LocalDateTime` | Required | A timestamp in ISO 8601 format of the date the resource was created. | LocalDateTime getDateCreated() | setDateCreated(LocalDateTime dateCreated) |
| `DateModified` | `LocalDateTime` | Required | A timestamp in ISO 8601 format of the date the resource was last modified. | LocalDateTime getDateModified() | setDateModified(LocalDateTime dateModified) |
| `Object` | `String` | Required | - | String getObject() | setObject(String object) |
| `Type` | `String` | Required, Constant | non-Certified postcards, self mailers, letters, and checks<br>**Default**: `"normal"`<br>*Default: `"normal"`* | String getType() | setType(String type) |
| `Name` | [`NameEnum`](/doc/models/name-enum.md) | Required | Name of tracking event (for normal postcards, self mailers, letters, and checks):<br><br>* `In Transit` - The mailpiece is being processed at the entry/origin facility.<br><br>* `In Local Area` - The mailpiece is being processed at the destination facility.<br><br>* `Processed for Delivery` - The mailpiece has been greenlit for<br>  delivery at the recipient's nearest postal facility. The mailpiece<br>  should reach the mailbox within 1 business day of this tracking<br>  event.<br><br>* `Re-Routed` - The mailpiece is re-routed due to recipient change of<br>  address, address errors, or USPS relabeling of barcode/ID tag<br>  area.<br><br>* `Returned to Sender` - The mailpiece is being returned to sender due<br>  to barcode, ID tag area, or address errors.<br><br>* `Mailed` - The mailpiece has been handed off to and accepted by USPS<br>  and is en route. [More about<br>  Mailed.](https://support.lob.com/hc/en-us/articles/360001724400-What-does-a-Mailed-tracking-event-mean-)<br>  Note this data is only available in Enterprise editions of<br>  Lob. [Contact Sales](https://lob.com/support/contact#contact) if<br>  you want access to this feature.<br><br>[More about tracking](https://support.lob.com/hc/en-us/articles/115000097404-Can-I-track-my-mail-) | NameEnum getName() | setName(NameEnum name) |
| `Details` | `Object` | Optional | Will be `null` for `type=normal` events | Object getDetails() | setDetails(Object details) |
| `Location` | `String` | Optional | The zip code in which the scan event occurred. Null for `Mailed` events. | String getLocation() | setLocation(String location) |

## Example (as JSON)

```json
{
  "id": null,
  "date_created": null,
  "date_modified": null,
  "object": null,
  "type": "normal",
  "name": null
}
```

