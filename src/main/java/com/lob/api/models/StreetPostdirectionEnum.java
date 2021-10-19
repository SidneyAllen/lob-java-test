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
 * StreetPostdirectionEnum to be used.
 */
public enum StreetPostdirectionEnum {
    ENUM_0,

    ENUM_1,

    ENUM_2,

    ENUM_3,

    ENUM_4,

    ENUM_5,

    ENUM_6,

    ENUM_7;


    private static TreeMap<String, StreetPostdirectionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_0.value = "N";
        ENUM_1.value = "S";
        ENUM_2.value = "E";
        ENUM_3.value = "W";
        ENUM_4.value = "NE";
        ENUM_5.value = "SW";
        ENUM_6.value = "SE";
        ENUM_7.value = "NW";

        valueMap.put("N", ENUM_0);
        valueMap.put("S", ENUM_1);
        valueMap.put("E", ENUM_2);
        valueMap.put("W", ENUM_3);
        valueMap.put("NE", ENUM_4);
        valueMap.put("SW", ENUM_5);
        valueMap.put("SE", ENUM_6);
        valueMap.put("NW", ENUM_7);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static StreetPostdirectionEnum fromString(String toConvert) {
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
     * Convert list of StreetPostdirectionEnum values to list of string values.
     * @param toConvert The list of StreetPostdirectionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<StreetPostdirectionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (StreetPostdirectionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 