package com.bridgelabz.measurement.access;

public class UnitCovert {
    public Converting.UnitConversed unitConversed;
    private String valueType;
    public UnitCovert(String valueType) {
        this.valueType=valueType;

    }
    public Converting.UnitConversed getType() {

        if(this.valueType.contains("feet")) {
            return Converting.UnitConversed.FEET;
        }
        if(this.valueType.contains("inch")) {
            return Converting.UnitConversed.INCH;
        }
        if(this.valueType.contains("yard")) {
            return Converting.UnitConversed.YARD;
        }
        return unitConversed;
    }
}
