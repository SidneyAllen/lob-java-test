
# Name Enum

Name of tracking event (for normal postcards, self mailers, letters, and checks):

* `In Transit` - The mailpiece is being processed at the entry/origin facility.

* `In Local Area` - The mailpiece is being processed at the destination facility.

* `Processed for Delivery` - The mailpiece has been greenlit for
  delivery at the recipient's nearest postal facility. The mailpiece
  should reach the mailbox within 1 business day of this tracking
  event.

* `Re-Routed` - The mailpiece is re-routed due to recipient change of
  address, address errors, or USPS relabeling of barcode/ID tag
  area.

* `Returned to Sender` - The mailpiece is being returned to sender due
  to barcode, ID tag area, or address errors.

* `Mailed` - The mailpiece has been handed off to and accepted by USPS
  and is en route. [More about
  Mailed.](https://support.lob.com/hc/en-us/articles/360001724400-What-does-a-Mailed-tracking-event-mean-)
  Note this data is only available in Enterprise editions of
  Lob. [Contact Sales](https://lob.com/support/contact#contact) if
  you want access to this feature.

[More about tracking](https://support.lob.com/hc/en-us/articles/115000097404-Can-I-track-my-mail-)

## Enumeration

`NameEnum`

## Fields

| Name |
|  --- |
| `EnumInTransit` |
| `EnumInLocalArea` |
| `EnumProcessedForDelivery` |
| `ReRouted` |
| `EnumReturnedToSender` |
| `Mailed` |

