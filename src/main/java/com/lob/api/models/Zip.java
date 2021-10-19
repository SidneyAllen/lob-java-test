/*
 * LobLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.lob.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for Zip type.
 */
public class Zip {
    private String zipCode;
    private String id;
    private List<ZipLookupCity> cities;
    private ZipCodeTypeEnum zipCodeType;
    private String object;

    /**
     * Default constructor.
     */
    public Zip() {
    }

    /**
     * Initialization constructor.
     * @param  zipCode  String value for zipCode.
     * @param  id  String value for id.
     * @param  cities  List of ZipLookupCity value for cities.
     * @param  zipCodeType  ZipCodeTypeEnum value for zipCodeType.
     * @param  object  String value for object.
     */
    public Zip(
            String zipCode,
            String id,
            List<ZipLookupCity> cities,
            ZipCodeTypeEnum zipCodeType,
            String object) {
        this.zipCode = zipCode;
        this.id = id;
        this.cities = cities;
        this.zipCodeType = zipCodeType;
        this.object = object;
    }

    /**
     * Getter for ZipCode.
     * A 5-digit ZIP code.
     * @return Returns the String
     */
    @JsonGetter("zip_code")
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Setter for ZipCode.
     * A 5-digit ZIP code.
     * @param zipCode Value for String
     */
    @JsonSetter("zip_code")
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * Getter for Id.
     * Unique identifier prefixed with `us_zip_`.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * Unique identifier prefixed with `us_zip_`.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Cities.
     * An array of city objects containing valid cities for the `zip_code`. Multiple cities will be
     * returned if more than one city is associated with the input ZIP code.
     * @return Returns the List of ZipLookupCity
     */
    @JsonGetter("cities")
    public List<ZipLookupCity> getCities() {
        return cities;
    }

    /**
     * Setter for Cities.
     * An array of city objects containing valid cities for the `zip_code`. Multiple cities will be
     * returned if more than one city is associated with the input ZIP code.
     * @param cities Value for List of ZipLookupCity
     */
    @JsonSetter("cities")
    public void setCities(List<ZipLookupCity> cities) {
        this.cities = cities;
    }

    /**
     * Getter for ZipCodeType.
     * A description of the ZIP code type. For more detailed information about each ZIP code type,
     * see [US Verification Details](#tag/US-Verification-Types).
     * @return Returns the ZipCodeTypeEnum
     */
    @JsonGetter("zip_code_type")
    public ZipCodeTypeEnum getZipCodeType() {
        return zipCodeType;
    }

    /**
     * Setter for ZipCodeType.
     * A description of the ZIP code type. For more detailed information about each ZIP code type,
     * see [US Verification Details](#tag/US-Verification-Types).
     * @param zipCodeType Value for ZipCodeTypeEnum
     */
    @JsonSetter("zip_code_type")
    public void setZipCodeType(ZipCodeTypeEnum zipCodeType) {
        this.zipCodeType = zipCodeType;
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
     * Converts this Zip into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Zip [" + "zipCode=" + zipCode + ", id=" + id + ", cities=" + cities
                + ", zipCodeType=" + zipCodeType + ", object=" + object + "]";
    }

    /**
     * Builds a new {@link Zip.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Zip.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(zipCode, id, cities, zipCodeType, object);
        return builder;
    }

    /**
     * Class to build instances of {@link Zip}.
     */
    public static class Builder {
        private String zipCode;
        private String id;
        private List<ZipLookupCity> cities;
        private ZipCodeTypeEnum zipCodeType;
        private String object;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  zipCode  String value for zipCode.
         * @param  id  String value for id.
         * @param  cities  List of ZipLookupCity value for cities.
         * @param  zipCodeType  ZipCodeTypeEnum value for zipCodeType.
         * @param  object  String value for object.
         */
        public Builder(String zipCode, String id, List<ZipLookupCity> cities,
                ZipCodeTypeEnum zipCodeType, String object) {
            this.zipCode = zipCode;
            this.id = id;
            this.cities = cities;
            this.zipCodeType = zipCodeType;
            this.object = object;
        }

        /**
         * Setter for zipCode.
         * @param  zipCode  String value for zipCode.
         * @return Builder
         */
        public Builder zipCode(String zipCode) {
            this.zipCode = zipCode;
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
         * Setter for cities.
         * @param  cities  List of ZipLookupCity value for cities.
         * @return Builder
         */
        public Builder cities(List<ZipLookupCity> cities) {
            this.cities = cities;
            return this;
        }

        /**
         * Setter for zipCodeType.
         * @param  zipCodeType  ZipCodeTypeEnum value for zipCodeType.
         * @return Builder
         */
        public Builder zipCodeType(ZipCodeTypeEnum zipCodeType) {
            this.zipCodeType = zipCodeType;
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
         * Builds a new {@link Zip} object using the set fields.
         * @return {@link Zip}
         */
        public Zip build() {
            return new Zip(zipCode, id, cities, zipCodeType, object);
        }
    }
}
