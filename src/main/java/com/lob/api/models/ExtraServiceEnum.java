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
 * ExtraServiceEnum to be used.
 */
public enum ExtraServiceEnum {
    CERTIFIED,

    CERTIFIED_RETURN_RECEIPT;


    private static TreeMap<String, ExtraServiceEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        CERTIFIED.value = "certified";
        CERTIFIED_RETURN_RECEIPT.value = "certified_return_receipt";

        valueMap.put("certified", CERTIFIED);
        valueMap.put("certified_return_receipt", CERTIFIED_RETURN_RECEIPT);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static ExtraServiceEnum fromString(String toConvert) {
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
     * Convert list of ExtraServiceEnum values to list of string values.
     * @param toConvert The list of ExtraServiceEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ExtraServiceEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ExtraServiceEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 