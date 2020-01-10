package com.bridgelabz.measurement.model;

public class Factors {

    private double value;
    private String valueType;

    public double getValue() {
        return value;
    }

    public String getValueType() {
        return valueType;
    }

    @Override
    public String toString() {
        return "Factors{" +
                "value=" + value +
                ", valueType='" + valueType + '\'' +
                '}';
    }
}