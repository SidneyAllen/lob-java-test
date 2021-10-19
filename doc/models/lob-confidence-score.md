
# Lob Confidence Score

Lob Confidence Score is a nested object that provides a numerical value between 0-100 of the likelihood that an address is deliverable based on Lob’s mail delivery data to over half of US households.

## Structure

`LobConfidenceScore`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Score` | `double` | Required | A numerical score between 0 and 100 that represents the percentage of mailpieces Lob has sent to this addresses that have been delivered successfully over the past 2 years. Will be `null` if no tracking data exists for this address.<br>**Constraints**: `>= 0`, `<= 100` | double getScore() | setScore(double score) |
| `Level` | [`LevelEnum`](/doc/models/level-enum.md) | Required | Indicates the likelihood that the address is a valid, mail-receiving address. Possible values are:<br><br>- `high` — Over 70% of mailpieces Lob has sent to this address were delivered successfully and recent mailings were also successful.<br>- `medium` — Between 40% and 70% of mailpieces Lob has sent to this address were delivered successfully.<br>- `low` — Less than 40% of mailpieces Lob has sent to this address were delivered successfully and recent mailings weren't successful.<br>- `""` — No tracking data exists for this address or lob deliverability was unable to find a corresponding level of mail success. | LevelEnum getLevel() | setLevel(LevelEnum level) |

## Example (as JSON)

```json
{
  "score": 147.4,
  "level": "medium"
}
```

