package com.bridgelabz.measurement.service;

import com.bridgelabz.measurement.access.InputValue;
import com.bridgelabz.measurement.model.Factors;
import org.springframework.stereotype.Service;
import org.w3c.dom.ls.LSInput;

import java.util.List;

@Service
public class MeasurementServiceImplementation implements MeasurementService {

    @Override
    public Boolean converting(List<Factors> factorsList) {
        InputValue inputValue=new InputValue(factorsList.get(0));
        InputValue inputValue1=new InputValue(factorsList.get(1));
        boolean check=inputValue.compareCheck(inputValue1);
        System.out.println(check);
        return check;
    }
}
