
# Bank Account Verify

## Structure

`BankAccountVerify`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amounts` | `List<Integer>` | Required | In live mode, an array containing the two micro deposits (in cents) placed in the bank account. In test mode, no micro deposits will be placed, so any two integers between `1` and `100` will work.<br>**Constraints**: *Minimum Items*: `2`, *Maximum Items*: `2`, `>= 1`, `<= 100` | List<Integer> getAmounts() | setAmounts(List<Integer> amounts) |

## Example (as JSON)

```json
{
  "amounts": [
    80,
    81
  ]
}
```

