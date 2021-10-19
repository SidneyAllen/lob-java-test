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
 * This is a model class for Addresses type.
 */
public class Addresses {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Components components;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private LocationAnalysis locationAnalysis;

    /**
     * Default constructor.
     */
    public Addresses() {
    }

    /**
     * Initialization constructor.
     * @param  components  Components value for components.
     * @param  locationAnalysis  LocationAnalysis value for locationAnalysis.
     */
    public Addresses(
            Components components,
            LocationAnalysis locationAnalysis) {
        this.components = components;
        this.locationAnalysis = locationAnalysis;
    }

    /**
     * Getter for Components.
     * A nested object containing a breakdown of each component of a reverse geocoded response.
     * @return Returns the Components
     */
    @JsonGetter("components")
    public Components getComponents() {
        return components;
    }

    /**
     * Setter for Components.
     * A nested object containing a breakdown of each component of a reverse geocoded response.
     * @param components Value for Components
     */
    @JsonSetter("components")
    public void setComponents(Components components) {
        this.components = components;
    }

    /**
     * Getter for LocationAnalysis.
     * A nested object containing a breakdown of the analysis of a reverse geocoded location.
     * @return Returns the LocationAnalysis
     */
    @JsonGetter("location_analysis")
    public LocationAnalysis getLocationAnalysis() {
        return locationAnalysis;
    }

    /**
     * Setter for LocationAnalysis.
     * A nested object containing a breakdown of the analysis of a reverse geocoded location.
     * @param locationAnalysis Value for LocationAnalysis
     */
    @JsonSetter("location_analysis")
    public void setLocationAnalysis(LocationAnalysis locationAnalysis) {
        this.locationAnalysis = locationAnalysis;
    }

    /**
     * Converts this Addresses into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Addresses [" + "components=" + components + ", locationAnalysis=" + locationAnalysis
                + "]";
    }

    /**
     * Builds a new {@link Addresses.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Addresses.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .components(getComponents())
                .locationAnalysis(getLocationAnalysis());
        return builder;
    }

    /**
     * Class to build instances of {@link Addresses}.
     */
    public static class Builder {
        private Components components;
        private LocationAnalysis locationAnalysis;



        /**
         * Setter for components.
         * @param  components  Components value for components.
         * @return Builder
         */
        public Builder components(Components components) {
            this.components = components;
            return this;
        }

        /**
         * Setter for locationAnalysis.
         * @param  locationAnalysis  LocationAnalysis value for locationAnalysis.
         * @return Builder
         */
        public Builder locationAnalysis(LocationAnalysis locationAnalysis) {
            this.locationAnalysis = locationAnalysis;
            return this;
        }

        /**
         * Builds a new {@link Addresses} object using the set fields.
         * @return {@link Addresses}
         */
        public Addresses build() {
            return new Addresses(components, locationAnalysis);
        }
    }
}
