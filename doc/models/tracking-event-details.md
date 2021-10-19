
# Tracking Event Details

## Structure

`TrackingEventDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Event` | [`EventEnum`](/doc/models/event-enum.md) | Required | Find the full table [here](#tag/Tracking-Events). A detailed substatus about the event:<br><br>* `package_accepted` - Package has been accepted into the carrier network for delivery.<br>* `package_arrived` - Package has arrived at an intermediate location in the carrier network.<br>* `package_departed` - Package has departed from an intermediate location in the carrier network.<br>* `package_processing` - Package is processing at an intermediate location in the carrier network.<br>* `package_processed` - Package has been processed at an intermediate location.<br>* `package_in_local_area` - Package is at a location near the end destination.<br>* `delivery_scheduled` - Package is scheduled for delivery.<br>* `out_for_delivery` - Package is out for delivery.<br>* `pickup_available` - Package is available for pickup at carrier location.<br>* `delivered` - Package has been delivered.<br>* `package_forwarded` - Package has been forwarded.<br>* `returned_to_sender` - Package is to be returned to sender.<br>* `address_issue` - Address information is incorrect. Contact carrier to ensure delivery.<br>* `contact_carrier` - Contact the carrier for more information.<br>* `delayed` - Delivery of package is delayed.<br>* `delivery_attempted` - Delivery of package has been attempted. Contact carrier to ensure delivery.<br>* `delivery_rescheduled` - Delivery of package has been rescheduled.<br>* `location_inaccessible` - Delivery location inaccessible to carrier. Contact carrier to ensure delivery.<br>* `notice_left` - Carrier left notice during attempted delivery. Follow carrier instructions on notice.<br>* `package_damaged` - Package has been damaged. Contact carrier for more details.<br>* `package_disposed` - Package has been disposed.<br>* `package_held` - Package held at carrier location. Contact carrier for more details.<br>* `package_lost` - Package has been lost. Contact carrier for more details.<br>* `package_unclaimed` - Package is unclaimed.<br>* `package_undeliverable` - Package is not able to be delivered.<br>* `reschedule_delivery` - Contact carrier to reschedule delivery.<br>* `other` - Unrecognized carrier status. | EventEnum getEvent() | setEvent(EventEnum event) |
| `Description` | `String` | Required | The description as listed in the description for event. | String getDescription() | setDescription(String description) |
| `Notes` | `String` | Optional | Event-specific notes from USPS about the tracking event. | String getNotes() | setNotes(String notes) |
| `ActionRequired` | `boolean` | Required | `true` if action is required by the end recipient, `false` otherwise. | boolean getActionRequired() | setActionRequired(boolean actionRequired) |

## Example (as JSON)

```json
{
  "event": "package_undeliverable",
  "description": "description0",
  "notes": null,
  "action_required": false
}
```

