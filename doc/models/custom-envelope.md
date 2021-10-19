
# Custom Envelope

A nested custom envelope object containing more information about the custom envelope used or `null` if a custom envelope was not used.

Accepts an envelope ID for any customized envelope with available inventory. If no inventory is available for the specified ID, the letter will not be sent, and an error will be returned. If the letter has more than 6 sheets, it will be sent in a blank flat envelope. Custom envelopes may be created and ordered from the dashboard. This feature is exclusive to certain customers. Upgrade to the appropriate [Print & Mail Edition](https://dashboard.lob.com/#/settings/editions) to gain access.

## Structure

`CustomEnvelope`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | The unique identifier of the custom envelope used.<br>**Constraints**: *Maximum Length*: `40` | String getId() | setId(String id) |
| `Url` | `String` | Required | The url of the envelope asset used. | String getUrl() | setUrl(String url) |
| `Object` | `String` | Required | - | String getObject() | setObject(String object) |

## Example (as JSON)

```json
{
  "id": "id0",
  "url": "url4",
  "object": "object2"
}
```

