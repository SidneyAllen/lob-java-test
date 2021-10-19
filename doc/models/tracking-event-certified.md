
# Tracking Event Certified

## Structure

`TrackingEventCertified`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | Unique identifier prefixed with `evnt_`.<br>**Constraints**: *Pattern*: `^evnt_[a-zA-Z0-9]+$` | String getId() | setId(String id) |
| `Time` | `LocalDateTime` | Optional | A timestamp in ISO 8601 format of the date USPS registered the event. | LocalDateTime getTime() | setTime(LocalDateTime time) |
| `DateCreated` | `LocalDateTime` | Required | A timestamp in ISO 8601 format of the date the resource was created. | LocalDateTime getDateCreated() | setDateCreated(LocalDateTime dateCreated) |
| `DateModified` | `LocalDateTime` | Required | A timestamp in ISO 8601 format of the date the resource was last modified. | LocalDateTime getDateModified() | setDateModified(LocalDateTime dateModified) |
| `Object` | `String` | Required | - | String getObject() | setObject(String object) |
| `Type` | `String` | Required, Constant | a Certified letter tracking event<br>**Default**: `"certified"`<br>*Default: `"certified"`* | String getType() | setType(String type) |
| `Name` | [`Name1Enum`](/doc/models/name-1-enum.md) | Required | Name of tracking event for Certified letters. Letters sent with USPS Certified Mail are fully tracked by USPS, therefore their tracking events have an additional details object with more detailed information about the tracking event. Some certified tracking event names have multiple meanings, noted in the list here. See the description of the details object for the full set of combined certified tracking event name meanings.<br><br>* `Mailed` - Package has been accepted into the carrier network for delivery.<br><br>* `In Transit` - Maps to four distinct stages of transit.<br><br>* `In Local Area` - Package is at a location near the end destination.<br><br>* `Processed for Delivery` - Maps to two distinct stages of delivery.<br><br>* `Pickup Available` - Package is available for pickup at carrier location.<br><br>* `Delivered` - Package has been delivered.<br><br>* `Re-Routed` - Package has been forwarded.<br><br>* `Returned to Sender` - Package is to be returned to sender.<br><br>* `Issue` - Maps to (at least) 15 possible issues, some of which are actionable. | Name1Enum getName() | setName(Name1Enum name) |
| `Details` | [`TrackingEventDetails`](/doc/models/tracking-event-details.md) | Optional | - | TrackingEventDetails getDetails() | setDetails(TrackingEventDetails details) |
| `Location` | `String` | Optional | The zip code in which the event occurred if it exists, otherwise will be the name of a Regional Distribution Center if it exists, otherwise will be null. | String getLocation() | setLocation(String location) |

## Example (as JSON)

```json
{
  "id": null,
  "date_created": null,
  "date_modified": null,
  "object": null,
  "type": "certified",
  "name": null
}
```

