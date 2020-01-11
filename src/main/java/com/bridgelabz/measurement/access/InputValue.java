package com.bridgelabz.measurement.access;

import com.bridgelabz.measurement.model.Factors;

public class InputValue {
    private  double value;
    public Converting.UnitConversed unitConversed;

    public InputValue(Factors factors) {
        UnitCovert unitCovert=new UnitCovert(factors.getValueType());
        this.value=factors.getValue();
        this.unitConversed=unitCovert.getType();
         }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InputValue inputValue = (InputValue) o;
        return Double.compare(inputValue.value, value) == 0 &&
                unitConversed == inputValue.unitConversed;
    }

    public InputValue( Converting.UnitConversed unitConversed,double value) {
        this.value = value;
        this.unitConversed = unitConversed;
    }


    public  Double addingValue(InputValue value1,InputValue value2) {

        Double firstValue = value1.unitConversed.convertToInches(value1.value);
        Double secondValue = value2.unitConversed.convertToInches(value2.value);
        return Double.sum(firstValue,secondValue);
    }

    public boolean compareCheck(InputValue that) {
        Double firstValue = this.unitConversed.convertToInches(this.value);
        Double secondValue = that.unitConversed.convertToInches(that.value);
        return firstValue.equals(secondValue);
    }
}
