
# Card Order

## Structure

`CardOrder`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DateCreated` | `LocalDateTime` | Required | A timestamp in ISO 8601 format of the date the resource was created. | LocalDateTime getDateCreated() | setDateCreated(LocalDateTime dateCreated) |
| `DateModified` | `LocalDateTime` | Required | A timestamp in ISO 8601 format of the date the resource was last modified. | LocalDateTime getDateModified() | setDateModified(LocalDateTime dateModified) |
| `Deleted` | `Boolean` | Optional | Only returned if the resource has been successfully deleted. | Boolean getDeleted() | setDeleted(Boolean deleted) |
| `Object` | `String` | Required | Value is type of resource. | String getObject() | setObject(String object) |
| `Id` | `String` | Optional | Unique identifier prefixed with `co_`.<br>**Constraints**: *Pattern*: `^co_[a-zA-Z0-9]+$` | String getId() | setId(String id) |
| `CardId` | `String` | Optional | Unique identifier prefixed with `card_`.<br>**Constraints**: *Pattern*: `^card_[a-zA-Z0-9]+$` | String getCardId() | setCardId(String cardId) |
| `Status` | [`Status1Enum`](/doc/models/status-1-enum.md) | Optional | The status of the card order. | Status1Enum getStatus() | setStatus(Status1Enum status) |
| `Inventory` | `Double` | Optional | The inventory of the card order.<br>**Default**: `0d`<br>*Default: `0d`* | Double getInventory() | setInventory(Double inventory) |
| `QuantityOrdered` | `Double` | Optional | The quantity of cards ordered<br>**Default**: `0d`<br>*Default: `0d`* | Double getQuantityOrdered() | setQuantityOrdered(Double quantityOrdered) |
| `UnitPrice` | `Double` | Optional | The unit price for the card order.<br>**Default**: `0d`<br>*Default: `0d`* | Double getUnitPrice() | setUnitPrice(Double unitPrice) |
| `CancelledReason` | `String` | Optional | The reason for cancellation. | String getCancelledReason() | setCancelledReason(String cancelledReason) |
| `AvailabilityDate` | `LocalDateTime` | Optional | A timestamp in ISO 8601 format of the date the resource was created. | LocalDateTime getAvailabilityDate() | setAvailabilityDate(LocalDateTime availabilityDate) |
| `ExpectedAvailabilityDate` | `LocalDateTime` | Optional | The fixed deadline for the cards to be printed. | LocalDateTime getExpectedAvailabilityDate() | setExpectedAvailabilityDate(LocalDateTime expectedAvailabilityDate) |

## Example (as JSON)

```json
{
  "date_created": "2016-03-13T12:52:32.123Z",
  "date_modified": "2016-03-13T12:52:32.123Z",
  "deleted": null,
  "object": "object2",
  "id": null,
  "card_id": null,
  "status": null,
  "inventory": null,
  "quantity_ordered": null,
  "unit_price": null,
  "cancelled_reason": null,
  "availability_date": null,
  "expected_availability_date": null
}
```

