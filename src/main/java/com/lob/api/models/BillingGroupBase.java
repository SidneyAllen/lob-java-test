/*
 * LobLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.lob.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for BillingGroupBase type.
 */
public class BillingGroupBase {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String description;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String name;

    /**
     * Default constructor.
     */
    public BillingGroupBase() {
    }

    /**
     * Initialization constructor.
     * @param  description  String value for description.
     * @param  name  String value for name.
     */
    public BillingGroupBase(
            String description,
            String name) {
        this.description = description;
        this.name = name;
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
     * Converts this BillingGroupBase into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BillingGroupBase [" + "description=" + description + ", name=" + name + "]";
    }

    /**
     * Builds a new {@link BillingGroupBase.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BillingGroupBase.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .description(getDescription())
                .name(getName());
        return builder;
    }

    /**
     * Class to build instances of {@link BillingGroupBase}.
     */
    public static class Builder {
        private String description;
        private String name;



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
         * Builds a new {@link BillingGroupBase} object using the set fields.
         * @return {@link BillingGroupBase}
         */
        public BillingGroupBase build() {
            return new BillingGroupBase(description, name);
        }
    }
}
