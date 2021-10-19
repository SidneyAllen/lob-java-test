/*
 * LobLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.lob.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.lob.api.DateTimeHelper;
import java.time.LocalDateTime;

/**
 * This is a model class for CardOrder type.
 */
public class CardOrder {
    private LocalDateTime dateCreated;
    private LocalDateTime dateModified;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean deleted;
    private String object;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String id;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String cardId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Status1Enum status;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double inventory;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double quantityOrdered;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double unitPrice;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String cancelledReason;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private LocalDateTime availabilityDate;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private LocalDateTime expectedAvailabilityDate;

    /**
     * Default constructor.
     */
    public CardOrder() {
        inventory = 0d;
        quantityOrdered = 0d;
        unitPrice = 0d;
    }

    /**
     * Initialization constructor.
     * @param  dateCreated  LocalDateTime value for dateCreated.
     * @param  dateModified  LocalDateTime value for dateModified.
     * @param  object  String value for object.
     * @param  deleted  Boolean value for deleted.
     * @param  id  String value for id.
     * @param  cardId  String value for cardId.
     * @param  status  Status1Enum value for status.
     * @param  inventory  Double value for inventory.
     * @param  quantityOrdered  Double value for quantityOrdered.
     * @param  unitPrice  Double value for unitPrice.
     * @param  cancelledReason  String value for cancelledReason.
     * @param  availabilityDate  LocalDateTime value for availabilityDate.
     * @param  expectedAvailabilityDate  LocalDateTime value for expectedAvailabilityDate.
     */
    public CardOrder(
            LocalDateTime dateCreated,
            LocalDateTime dateModified,
            String object,
            Boolean deleted,
            String id,
            String cardId,
            Status1Enum status,
            Double inventory,
            Double quantityOrdered,
            Double unitPrice,
            String cancelledReason,
            LocalDateTime availabilityDate,
            LocalDateTime expectedAvailabilityDate) {
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
        this.deleted = deleted;
        this.object = object;
        this.id = id;
        this.cardId = cardId;
        this.status = status;
        this.inventory = inventory;
        this.quantityOrdered = quantityOrdered;
        this.unitPrice = unitPrice;
        this.cancelledReason = cancelledReason;
        this.availabilityDate = availabilityDate;
        this.expectedAvailabilityDate = expectedAvailabilityDate;
    }

    /**
     * Getter for DateCreated.
     * A timestamp in ISO 8601 format of the date the resource was created.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("date_created")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    /**
     * Setter for DateCreated.
     * A timestamp in ISO 8601 format of the date the resource was created.
     * @param dateCreated Value for LocalDateTime
     */
    @JsonSetter("date_created")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * Getter for DateModified.
     * A timestamp in ISO 8601 format of the date the resource was last modified.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("date_modified")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getDateModified() {
        return dateModified;
    }

    /**
     * Setter for DateModified.
     * A timestamp in ISO 8601 format of the date the resource was last modified.
     * @param dateModified Value for LocalDateTime
     */
    @JsonSetter("date_modified")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setDateModified(LocalDateTime dateModified) {
        this.dateModified = dateModified;
    }

    /**
     * Getter for Deleted.
     * Only returned if the resource has been successfully deleted.
     * @return Returns the Boolean
     */
    @JsonGetter("deleted")
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * Setter for Deleted.
     * Only returned if the resource has been successfully deleted.
     * @param deleted Value for Boolean
     */
    @JsonSetter("deleted")
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * Getter for Object.
     * Value is type of resource.
     * @return Returns the String
     */
    @JsonGetter("object")
    public String getObject() {
        return object;
    }

    /**
     * Setter for Object.
     * Value is type of resource.
     * @param object Value for String
     */
    @JsonSetter("object")
    public void setObject(String object) {
        this.object = object;
    }

    /**
     * Getter for Id.
     * Unique identifier prefixed with `co_`.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * Unique identifier prefixed with `co_`.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for CardId.
     * Unique identifier prefixed with `card_`.
     * @return Returns the String
     */
    @JsonGetter("card_id")
    public String getCardId() {
        return cardId;
    }

    /**
     * Setter for CardId.
     * Unique identifier prefixed with `card_`.
     * @param cardId Value for String
     */
    @JsonSetter("card_id")
    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    /**
     * Getter for Status.
     * The status of the card order.
     * @return Returns the Status1Enum
     */
    @JsonGetter("status")
    public Status1Enum getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * The status of the card order.
     * @param status Value for Status1Enum
     */
    @JsonSetter("status")
    public void setStatus(Status1Enum status) {
        this.status = status;
    }

    /**
     * Getter for Inventory.
     * The inventory of the card order.
     * @return Returns the Double
     */
    @JsonGetter("inventory")
    public Double getInventory() {
        return inventory;
    }

    /**
     * Setter for Inventory.
     * The inventory of the card order.
     * @param inventory Value for Double
     */
    @JsonSetter("inventory")
    public void setInventory(Double inventory) {
        this.inventory = inventory;
    }

    /**
     * Getter for QuantityOrdered.
     * The quantity of cards ordered
     * @return Returns the Double
     */
    @JsonGetter("quantity_ordered")
    public Double getQuantityOrdered() {
        return quantityOrdered;
    }

    /**
     * Setter for QuantityOrdered.
     * The quantity of cards ordered
     * @param quantityOrdered Value for Double
     */
    @JsonSetter("quantity_ordered")
    public void setQuantityOrdered(Double quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }

    /**
     * Getter for UnitPrice.
     * The unit price for the card order.
     * @return Returns the Double
     */
    @JsonGetter("unit_price")
    public Double getUnitPrice() {
        return unitPrice;
    }

    /**
     * Setter for UnitPrice.
     * The unit price for the card order.
     * @param unitPrice Value for Double
     */
    @JsonSetter("unit_price")
    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * Getter for CancelledReason.
     * The reason for cancellation.
     * @return Returns the String
     */
    @JsonGetter("cancelled_reason")
    public String getCancelledReason() {
        return cancelledReason;
    }

    /**
     * Setter for CancelledReason.
     * The reason for cancellation.
     * @param cancelledReason Value for String
     */
    @JsonSetter("cancelled_reason")
    public void setCancelledReason(String cancelledReason) {
        this.cancelledReason = cancelledReason;
    }

    /**
     * Getter for AvailabilityDate.
     * A timestamp in ISO 8601 format of the date the resource was created.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("availability_date")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getAvailabilityDate() {
        return availabilityDate;
    }

    /**
     * Setter for AvailabilityDate.
     * A timestamp in ISO 8601 format of the date the resource was created.
     * @param availabilityDate Value for LocalDateTime
     */
    @JsonSetter("availability_date")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setAvailabilityDate(LocalDateTime availabilityDate) {
        this.availabilityDate = availabilityDate;
    }

    /**
     * Getter for ExpectedAvailabilityDate.
     * The fixed deadline for the cards to be printed.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("expected_availability_date")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getExpectedAvailabilityDate() {
        return expectedAvailabilityDate;
    }

    /**
     * Setter for ExpectedAvailabilityDate.
     * The fixed deadline for the cards to be printed.
     * @param expectedAvailabilityDate Value for LocalDateTime
     */
    @JsonSetter("expected_availability_date")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setExpectedAvailabilityDate(LocalDateTime expectedAvailabilityDate) {
        this.expectedAvailabilityDate = expectedAvailabilityDate;
    }

    /**
     * Converts this CardOrder into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CardOrder [" + "dateCreated=" + dateCreated + ", dateModified=" + dateModified
                + ", object=" + object + ", deleted=" + deleted + ", id=" + id + ", cardId="
                + cardId + ", status=" + status + ", inventory=" + inventory + ", quantityOrdered="
                + quantityOrdered + ", unitPrice=" + unitPrice + ", cancelledReason="
                + cancelledReason + ", availabilityDate=" + availabilityDate
                + ", expectedAvailabilityDate=" + expectedAvailabilityDate + "]";
    }

    /**
     * Builds a new {@link CardOrder.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CardOrder.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(dateCreated, dateModified, object)
                .deleted(getDeleted())
                .id(getId())
                .cardId(getCardId())
                .status(getStatus())
                .inventory(getInventory())
                .quantityOrdered(getQuantityOrdered())
                .unitPrice(getUnitPrice())
                .cancelledReason(getCancelledReason())
                .availabilityDate(getAvailabilityDate())
                .expectedAvailabilityDate(getExpectedAvailabilityDate());
        return builder;
    }

    /**
     * Class to build instances of {@link CardOrder}.
     */
    public static class Builder {
        private LocalDateTime dateCreated;
        private LocalDateTime dateModified;
        private String object;
        private Boolean deleted;
        private String id;
        private String cardId;
        private Status1Enum status;
        private Double inventory = 0d;
        private Double quantityOrdered = 0d;
        private Double unitPrice = 0d;
        private String cancelledReason;
        private LocalDateTime availabilityDate;
        private LocalDateTime expectedAvailabilityDate;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  dateCreated  LocalDateTime value for dateCreated.
         * @param  dateModified  LocalDateTime value for dateModified.
         * @param  object  String value for object.
         */
        public Builder(LocalDateTime dateCreated, LocalDateTime dateModified, String object) {
            this.dateCreated = dateCreated;
            this.dateModified = dateModified;
            this.object = object;
        }

        /**
         * Setter for dateCreated.
         * @param  dateCreated  LocalDateTime value for dateCreated.
         * @return Builder
         */
        public Builder dateCreated(LocalDateTime dateCreated) {
            this.dateCreated = dateCreated;
            return this;
        }

        /**
         * Setter for dateModified.
         * @param  dateModified  LocalDateTime value for dateModified.
         * @return Builder
         */
        public Builder dateModified(LocalDateTime dateModified) {
            this.dateModified = dateModified;
            return this;
        }

        /**
         * Setter for object.
         * @param  object  String value for object.
         * @return Builder
         */
        public Builder object(String object) {
            this.object = object;
            return this;
        }

        /**
         * Setter for deleted.
         * @param  deleted  Boolean value for deleted.
         * @return Builder
         */
        public Builder deleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for cardId.
         * @param  cardId  String value for cardId.
         * @return Builder
         */
        public Builder cardId(String cardId) {
            this.cardId = cardId;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  Status1Enum value for status.
         * @return Builder
         */
        public Builder status(Status1Enum status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for inventory.
         * @param  inventory  Double value for inventory.
         * @return Builder
         */
        public Builder inventory(Double inventory) {
            this.inventory = inventory;
            return this;
        }

        /**
         * Setter for quantityOrdered.
         * @param  quantityOrdered  Double value for quantityOrdered.
         * @return Builder
         */
        public Builder quantityOrdered(Double quantityOrdered) {
            this.quantityOrdered = quantityOrdered;
            return this;
        }

        /**
         * Setter for unitPrice.
         * @param  unitPrice  Double value for unitPrice.
         * @return Builder
         */
        public Builder unitPrice(Double unitPrice) {
            this.unitPrice = unitPrice;
            return this;
        }

        /**
         * Setter for cancelledReason.
         * @param  cancelledReason  String value for cancelledReason.
         * @return Builder
         */
        public Builder cancelledReason(String cancelledReason) {
            this.cancelledReason = cancelledReason;
            return this;
        }

        /**
         * Setter for availabilityDate.
         * @param  availabilityDate  LocalDateTime value for availabilityDate.
         * @return Builder
         */
        public Builder availabilityDate(LocalDateTime availabilityDate) {
            this.availabilityDate = availabilityDate;
            return this;
        }

        /**
         * Setter for expectedAvailabilityDate.
         * @param  expectedAvailabilityDate  LocalDateTime value for expectedAvailabilityDate.
         * @return Builder
         */
        public Builder expectedAvailabilityDate(LocalDateTime expectedAvailabilityDate) {
            this.expectedAvailabilityDate = expectedAvailabilityDate;
            return this;
        }

        /**
         * Builds a new {@link CardOrder} object using the set fields.
         * @return {@link CardOrder}
         */
        public CardOrder build() {
            return new CardOrder(dateCreated, dateModified, object, deleted, id, cardId, status,
                    inventory, quantityOrdered, unitPrice, cancelledReason, availabilityDate,
                    expectedAvailabilityDate);
        }
    }
}
