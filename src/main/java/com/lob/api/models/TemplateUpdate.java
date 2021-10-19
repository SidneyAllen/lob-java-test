/*
 * LobLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.lob.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.lob.api.internal.OptionalNullable;

/**
 * This is a model class for TemplateUpdate type.
 */
public class TemplateUpdate {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private OptionalNullable<String> description;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String publishedVersion;

    /**
     * Default constructor.
     */
    public TemplateUpdate() {
    }

    /**
     * Initialization constructor.
     * @param  description  String value for description.
     * @param  publishedVersion  String value for publishedVersion.
     */
    public TemplateUpdate(
            String description,
            String publishedVersion) {
        this.description = OptionalNullable.of(description);
        this.publishedVersion = publishedVersion;
    }

    /**
     * Internal initialization constructor.
     */
    protected TemplateUpdate(OptionalNullable<String> description, String publishedVersion) {
        this.description = description;
        this.publishedVersion = publishedVersion;
    }

    /**
     * Internal Getter for Description.
     * An internal description that identifies this resource. Must be no longer than 255 characters.
     * @return Returns the Internal String
     */
    @JsonGetter("description")
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDescription() {
        return this.description;
    }

    /**
     * Getter for Description.
     * An internal description that identifies this resource. Must be no longer than 255 characters.
     * @return Returns the String
     */
    public String getDescription() {
        return OptionalNullable.getFrom(description);
    }

    /**
     * Setter for Description.
     * An internal description that identifies this resource. Must be no longer than 255 characters.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = OptionalNullable.of(description);
    }

    /**
     * UnSetter for Description.
     * An internal description that identifies this resource. Must be no longer than 255 characters.
     */
    public void unsetDescription() {
        description = null;
    }

    /**
     * Getter for PublishedVersion.
     * @return Returns the String
     */
    @JsonGetter("published_version")
    public String getPublishedVersion() {
        return publishedVersion;
    }

    /**
     * Setter for PublishedVersion.
     * @param publishedVersion Value for String
     */
    @JsonSetter("published_version")
    public void setPublishedVersion(String publishedVersion) {
        this.publishedVersion = publishedVersion;
    }

    /**
     * Converts this TemplateUpdate into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TemplateUpdate [" + "description=" + description + ", publishedVersion="
                + publishedVersion + "]";
    }

    /**
     * Builds a new {@link TemplateUpdate.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TemplateUpdate.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .publishedVersion(getPublishedVersion());
        builder.description = internalGetDescription();
        return builder;
    }

    /**
     * Class to build instances of {@link TemplateUpdate}.
     */
    public static class Builder {
        private OptionalNullable<String> description;
        private String publishedVersion;



        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = OptionalNullable.of(description);
            return this;
        }

        /**
         * UnSetter for description.
         * @return Builder
         */
        public Builder unsetDescription() {
            description = null;
            return this;
        }

        /**
         * Setter for publishedVersion.
         * @param  publishedVersion  String value for publishedVersion.
         * @return Builder
         */
        public Builder publishedVersion(String publishedVersion) {
            this.publishedVersion = publishedVersion;
            return this;
        }

        /**
         * Builds a new {@link TemplateUpdate} object using the set fields.
         * @return {@link TemplateUpdate}
         */
        public TemplateUpdate build() {
            return new TemplateUpdate(description, publishedVersion);
        }
    }
}
