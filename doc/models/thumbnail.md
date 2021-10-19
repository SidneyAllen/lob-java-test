
# Thumbnail

## Structure

`Thumbnail`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Small` | `String` | Optional | A [signed link](#section/Asset-URLs) served over HTTPS. The link returned will expire in 30 days to prevent mis-sharing. Each time a GET request is initiated, a new signed URL will be generated.<br>**Constraints**: *Pattern*: `^https://lob-assets\.com/(letters\|postcards\|bank-accounts\|checks\|self-mailers\|cards)/[a-z]{3,4}_[a-z0-9]{15,16}(\.pdf\|_thumb_[a-z]+_[0-9]+\.png)\?(version=[a-z0-9-]*&)?expires=[0-9]{10}&signature=[a-zA-Z0-9-_]+$` | String getSmall() | setSmall(String small) |
| `Medium` | `String` | Optional | A [signed link](#section/Asset-URLs) served over HTTPS. The link returned will expire in 30 days to prevent mis-sharing. Each time a GET request is initiated, a new signed URL will be generated.<br>**Constraints**: *Pattern*: `^https://lob-assets\.com/(letters\|postcards\|bank-accounts\|checks\|self-mailers\|cards)/[a-z]{3,4}_[a-z0-9]{15,16}(\.pdf\|_thumb_[a-z]+_[0-9]+\.png)\?(version=[a-z0-9-]*&)?expires=[0-9]{10}&signature=[a-zA-Z0-9-_]+$` | String getMedium() | setMedium(String medium) |
| `Large` | `String` | Optional | A [signed link](#section/Asset-URLs) served over HTTPS. The link returned will expire in 30 days to prevent mis-sharing. Each time a GET request is initiated, a new signed URL will be generated.<br>**Constraints**: *Pattern*: `^https://lob-assets\.com/(letters\|postcards\|bank-accounts\|checks\|self-mailers\|cards)/[a-z]{3,4}_[a-z0-9]{15,16}(\.pdf\|_thumb_[a-z]+_[0-9]+\.png)\?(version=[a-z0-9-]*&)?expires=[0-9]{10}&signature=[a-zA-Z0-9-_]+$` | String getLarge() | setLarge(String large) |

## Example (as JSON)

```json
{
  "small": null,
  "medium": null,
  "large": null
}
```

