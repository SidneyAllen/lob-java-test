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
 * SelfMailerSizeEnum to be used.
 */
public enum SelfMailerSizeEnum {
    ENUM_6X18_BIFOLD,

    ENUM_11X9_BIFOLD,

    ENUM_12X9_BIFOLD;


    private static TreeMap<String, SelfMailerSizeEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_6X18_BIFOLD.value = "6x18_bifold";
        ENUM_11X9_BIFOLD.value = "11x9_bifold";
        ENUM_12X9_BIFOLD.value = "12x9_bifold";

        valueMap.put("6x18_bifold", ENUM_6X18_BIFOLD);
        valueMap.put("11x9_bifold", ENUM_11X9_BIFOLD);
        valueMap.put("12x9_bifold", ENUM_12X9_BIFOLD);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static SelfMailerSizeEnum fromString(String toConvert) {
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
     * Convert list of SelfMailerSizeEnum values to list of string values.
     * @param toConvert The list of SelfMailerSizeEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<SelfMailerSizeEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (SelfMailerSizeEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 