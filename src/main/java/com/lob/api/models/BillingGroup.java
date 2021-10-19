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
 * This is a model class for BillingGroup type.
 */
public class BillingGroup {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String description;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String name;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String id;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private LocalDateTime dateCreated;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private LocalDateTime dateModified;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String object;

    /**
     * Default constructor.
     */
    public BillingGroup() {
    }

    /**
     * Initialization constructor.
     * @param  description  String value for description.
     * @param  name  String value for name.
     * @param  id  String value for id.
     * @param  dateCreated  LocalDateTime value for dateCreated.
     * @param  dateModified  LocalDateTime value for dateModified.
     * @param  object  String value for object.
     */
    public BillingGroup(
            String description,
            String name,
            String id,
            LocalDateTime dateCreated,
            LocalDateTime dateModified,
            String object) {
        this.description = description;
        this.name = name;
        this.id = id;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
        this.object = object;
    }

    /**
     * Getter for Description.
     * Description of the billing group.
     * @return Returns the String
     */
    @JsonGetter("description")
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * Description of the billing group.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for Name.
     * Name of the billing group.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Name of the billing group.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Id.
     * Unique identifier prefixed with `bg_`.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * Unique identifier prefixed with `bg_`.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
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
     * Getter for Object.
     * @return Returns the String
     */
    @JsonGetter("object")
    public String getObject() {
        return object;
    }

    /**
     * Setter for Object.
     * @param object Value for String
     */
    @JsonSetter("object")
    public void setObject(String object) {
        this.object = object;
    }

    /**
     * Converts this BillingGroup into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BillingGroup [" + "description=" + description + ", name=" + name + ", id=" + id
                + ", dateCreated=" + dateCreated + ", dateModified=" + dateModified + ", object="
                + object + "]";
    }

    /**
     * Builds a new {@link BillingGroup.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BillingGroup.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .description(getDescription())
                .name(getName())
                .id(getId())
                .dateCreated(getDateCreated())
                .dateModified(getDateModified())
                .object(getObject());
        return builder;
    }

    /**
     * Class to build instances of {@link BillingGroup}.
     */
    public static class Builder {
        private String description;
        private String name;
        private String id;
        private LocalDateTime dateCreated;
        private LocalDateTime dateModified;
        private String object;



        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
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
         * Builds a new {@link BillingGroup} object using the set fields.
         * @return {@link BillingGroup}
         */
        public BillingGroup build() {
            return new BillingGroup(description, name, id, dateCreated, dateModified, object);
        }
    }
}
