/*
 * LobLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.lob.api.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * EngineEnum to be used.
 */
public enum EngineEnum {
    LEGACY,

    HANDLEBARS;


    private static TreeMap<String, EngineEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        LEGACY.value = "legacy";
        HANDLEBARS.value = "handlebars";

        valueMap.put("legacy", LEGACY);
        valueMap.put("handlebars", HANDLEBARS);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static EngineEnum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member.
     * @return The string value against enum member.
     */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of EngineEnum values to list of string values.
     * @param toConvert The list of EngineEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<EngineEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (EngineEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 