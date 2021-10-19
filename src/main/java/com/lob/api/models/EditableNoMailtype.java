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
 * This is a model class for EditableNoMailtype type.
 */
public class EditableNoMailtype {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private OptionalNullable<String> description;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Metadata metadata;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private OptionalNullable<Object> mergeVariables;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object sendDate;

    /**
     * Default constructor.
     */
    public EditableNoMailtype() {
    }

    /**
     * Initialization constructor.
     * @param  description  String value for description.
     * @param  metadata  Metadata value for metadata.
     * @param  mergeVariables  Object value for mergeVariables.
     * @param  sendDate  Object value for sendDate.
     */
    public EditableNoMailtype(
            String description,
            Metadata metadata,
            Object mergeVariables,
            Object sendDate) {
        this.description = OptionalNullable.of(description);
        this.metadata = metadata;
        this.mergeVariables = OptionalNullable.of(mergeVariables);
        this.sendDate = sendDate;
    }

    /**
     * Internal initialization constructor.
     */
    protected EditableNoMailtype(OptionalNullable<String> description, Metadata metadata,
            OptionalNullable<Object> mergeVariables, Object sendDate) {
        this.description = description;
        this.metadata = metadata;
        this.mergeVariables = mergeVariables;
        this.sendDate = sendDate;
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
     * Getter for Metadata.
     * Use metadata to store custom information for tagging and labeling back to your internal
     * systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters
     * and values must be at most 500 characters. Neither can contain the characters `"` and `\`.
     * Nested objects are not supported. See [Metadata](#section/Metadata) for more information.
     * @return Returns the Metadata
     */
    @JsonGetter("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * Setter for Metadata.
     * Use metadata to store custom information for tagging and labeling back to your internal
     * systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters
     * and values must be at most 500 characters. Neither can contain the characters `"` and `\`.
     * Nested objects are not supported. See [Metadata](#section/Metadata) for more information.
     * @param metadata Value for Metadata
     */
    @JsonSetter("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    /**
     * Internal Getter for MergeVariables.
     * You can input a merge variable payload object to your template to render dynamic content. For
     * example, if you have a template like: `{{variable_name}}`, pass in `{"variable_name":
     * "Harry"}` to render `Harry`. `merge_variables` must be an object. Any type of value is
     * accepted as long as the object is valid JSON; you can use `strings`, `numbers`, `booleans`,
     * `arrays`, `objects`, or `null`. The max length of the object is 25,000 characters. If you
     * call `JSON.stringify` on your object, it can be no longer than 25,000 characters. Your
     * variable names cannot contain any whitespace or any of the following special characters: `!`,
     * `"`, `#`, `%`, `&`, `'`, `(`, `)`, `*`, `+`, `,`, `/`, `;`, `&lt;`, `=`, `&gt;`, `@`, `[`, `\`,
     * `]`, `^`, `` ` ``, `{`, `|`, `}`, `~`. More instructions can be found in [our guide to using
     * html and merge
     * variables](https://lob.com/resources/guides/general/using-html-and-merge-variables).
     * Depending on your [Merge Variable strictness](https://dashboard.lob.com/#/settings/account)
     * setting, if you define variables in your HTML but do not pass them here, you will either
     * receive an error or the variable will render as an empty string.
     * @return Returns the Internal Object
     */
    @JsonGetter("merge_variables")
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Object> internalGetMergeVariables() {
        return this.mergeVariables;
    }

    /**
     * Getter for MergeVariables.
     * You can input a merge variable payload object to your template to render dynamic content. For
     * example, if you have a template like: `{{variable_name}}`, pass in `{"variable_name":
     * "Harry"}` to render `Harry`. `merge_variables` must be an object. Any type of value is
     * accepted as long as the object is valid JSON; you can use `strings`, `numbers`, `booleans`,
     * `arrays`, `objects`, or `null`. The max length of the object is 25,000 characters. If you
     * call `JSON.stringify` on your object, it can be no longer than 25,000 characters. Your
     * variable names cannot contain any whitespace or any of the following special characters: `!`,
     * `"`, `#`, `%`, `&`, `'`, `(`, `)`, `*`, `+`, `,`, `/`, `;`, `&lt;`, `=`, `&gt;`, `@`, `[`, `\`,
     * `]`, `^`, `` ` ``, `{`, `|`, `}`, `~`. More instructions can be found in [our guide to using
     * html and merge
     * variables](https://lob.com/resources/guides/general/using-html-and-merge-variables).
     * Depending on your [Merge Variable strictness](https://dashboard.lob.com/#/settings/account)
     * setting, if you define variables in your HTML but do not pass them here, you will either
     * receive an error or the variable will render as an empty string.
     * @return Returns the Object
     */
    public Object getMergeVariables() {
        return OptionalNullable.getFrom(mergeVariables);
    }

    /**
     * Setter for MergeVariables.
     * You can input a merge variable payload object to your template to render dynamic content. For
     * example, if you have a template like: `{{variable_name}}`, pass in `{"variable_name":
     * "Harry"}` to render `Harry`. `merge_variables` must be an object. Any type of value is
     * accepted as long as the object is valid JSON; you can use `strings`, `numbers`, `booleans`,
     * `arrays`, `objects`, or `null`. The max length of the object is 25,000 characters. If you
     * call `JSON.stringify` on your object, it can be no longer than 25,000 characters. Your
     * variable names cannot contain any whitespace or any of the following special characters: `!`,
     * `"`, `#`, `%`, `&`, `'`, `(`, `)`, `*`, `+`, `,`, `/`, `;`, `&lt;`, `=`, `&gt;`, `@`, `[`, `\`,
     * `]`, `^`, `` ` ``, `{`, `|`, `}`, `~`. More instructions can be found in [our guide to using
     * html and merge
     * variables](https://lob.com/resources/guides/general/using-html-and-merge-variables).
     * Depending on your [Merge Variable strictness](https://dashboard.lob.com/#/settings/account)
     * setting, if you define variables in your HTML but do not pass them here, you will either
     * receive an error or the variable will render as an empty string.
     * @param mergeVariables Value for Object
     */
    @JsonSetter("merge_variables")
    public void setMergeVariables(Object mergeVariables) {
        this.mergeVariables = OptionalNullable.of(mergeVariables);
    }

    /**
     * UnSetter for MergeVariables.
     * You can input a merge variable payload object to your template to render dynamic content. For
     * example, if you have a template like: `{{variable_name}}`, pass in `{"variable_name":
     * "Harry"}` to render `Harry`. `merge_variables` must be an object. Any type of value is
     * accepted as long as the object is valid JSON; you can use `strings`, `numbers`, `booleans`,
     * `arrays`, `objects`, or `null`. The max length of the object is 25,000 characters. If you
     * call `JSON.stringify` on your object, it can be no longer than 25,000 characters. Your
     * variable names cannot contain any whitespace or any of the following special characters: `!`,
     * `"`, `#`, `%`, `&`, `'`, `(`, `)`, `*`, `+`, `,`, `/`, `;`, `&lt;`, `=`, `&gt;`, `@`, `[`, `\`,
     * `]`, `^`, `` ` ``, `{`, `|`, `}`, `~`. More instructions can be found in [our guide to using
     * html and merge
     * variables](https://lob.com/resources/guides/general/using-html-and-merge-variables).
     * Depending on your [Merge Variable strictness](https://dashboard.lob.com/#/settings/account)
     * setting, if you define variables in your HTML but do not pass them here, you will either
     * receive an error or the variable will render as an empty string.
     */
    public void unsetMergeVariables() {
        mergeVariables = null;
    }

    /**
     * Getter for SendDate.
     * A timestamp in ISO 8601 format which specifies a date after the current time and up to 180
     * days in the future to send the letter off for production. Setting a send date overrides the
     * default [cancellation window](#section/Cancellation-Windows) applied to the mailpiece. Until
     * the `send_date` has passed, the mailpiece can be canceled. If a date in the format
     * `2017-11-01` is passed, it will evaluate to midnight UTC of that date
     * (`2017-11-01T00:00:00.000Z`). If a datetime is passed, that exact time will be used. A
     * `send_date` passed with no time zone will default to UTC, while a `send_date` passed with a
     * time zone will be converted to UTC.
     * @return Returns the Object
     */
    @JsonGetter("send_date")
    public Object getSendDate() {
        return sendDate;
    }

    /**
     * Setter for SendDate.
     * A timestamp in ISO 8601 format which specifies a date after the current time and up to 180
     * days in the future to send the letter off for production. Setting a send date overrides the
     * default [cancellation window](#section/Cancellation-Windows) applied to the mailpiece. Until
     * the `send_date` has passed, the mailpiece can be canceled. If a date in the format
     * `2017-11-01` is passed, it will evaluate to midnight UTC of that date
     * (`2017-11-01T00:00:00.000Z`). If a datetime is passed, that exact time will be used. A
     * `send_date` passed with no time zone will default to UTC, while a `send_date` passed with a
     * time zone will be converted to UTC.
     * @param sendDate Value for Object
     */
    @JsonSetter("send_date")
    public void setSendDate(Object sendDate) {
        this.sendDate = sendDate;
    }

    /**
     * Converts this EditableNoMailtype into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "EditableNoMailtype [" + "description=" + description + ", metadata=" + metadata
                + ", mergeVariables=" + mergeVariables + ", sendDate=" + sendDate + "]";
    }

    /**
     * Builds a new {@link EditableNoMailtype.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link EditableNoMailtype.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .metadata(getMetadata())
                .sendDate(getSendDate());
        builder.description = internalGetDescription();
        builder.mergeVariables = internalGetMergeVariables();
        return builder;
    }

    /**
     * Class to build instances of {@link EditableNoMailtype}.
     */
    public static class Builder {
        private OptionalNullable<String> description;
        private Metadata metadata;
        private OptionalNullable<Object> mergeVariables;
        private Object sendDate;



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
         * Setter for metadata.
         * @param  metadata  Metadata value for metadata.
         * @return Builder
         */
        public Builder metadata(Metadata metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Setter for mergeVariables.
         * @param  mergeVariables  Object value for mergeVariables.
         * @return Builder
         */
        public Builder mergeVariables(Object mergeVariables) {
            this.mergeVariables = OptionalNullable.of(mergeVariables);
            return this;
        }

        /**
         * UnSetter for mergeVariables.
         * @return Builder
         */
        public Builder unsetMergeVariables() {
            mergeVariables = null;
            return this;
        }

        /**
         * Setter for sendDate.
         * @param  sendDate  Object value for sendDate.
         * @return Builder
         */
        public Builder sendDate(Object sendDate) {
            this.sendDate = sendDate;
            return this;
        }

        /**
         * Builds a new {@link EditableNoMailtype} object using the set fields.
         * @return {@link EditableNoMailtype}
         */
        public EditableNoMailtype build() {
            return new EditableNoMailtype(description, metadata, mergeVariables, sendDate);
        }
    }
}
