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
 * SuiteReturnCodeEnum to be used.
 */
public enum SuiteReturnCodeEnum {
    ENUM_0,

    ENUM_1;


    private static TreeMap<String, SuiteReturnCodeEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_0.value = "A";
        ENUM_1.value = "00";

        valueMap.put("A", ENUM_0);
        valueMap.put("00", ENUM_1);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static SuiteReturnCodeEnum fromString(String toConvert) {
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
     * Convert list of SuiteReturnCodeEnum values to list of string values.
     * @param toConvert The list of SuiteReturnCodeEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<SuiteReturnCodeEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (SuiteReturnCodeEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 