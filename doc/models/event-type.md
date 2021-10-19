
# Event Type

## Structure

`EventType`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Object` | Required | - | Object getId() | setId(Object id) |
| `EnabledForTest` | `boolean` | Required | Value is `true` if the event type is enabled in both the test and live environments and `false` if it is only enabled in the live environment. | boolean getEnabledForTest() | setEnabledForTest(boolean enabledForTest) |
| `Resource` | [`ResourceEnum`](/doc/models/resource-enum.md) | Required | - | ResourceEnum getResource() | setResource(ResourceEnum resource) |
| `Object` | `String` | Required | - | String getObject() | setObject(String object) |

## Example (as JSON)

```json
{
  "id": {
    "key1": "val1",
    "key2": "val2"
  },
  "enabled_for_test": false,
  "resource": "letters",
  "object": "object2"
}
```

