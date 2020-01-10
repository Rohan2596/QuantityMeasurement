package com.bridgelabz.measurement.controller;

import com.bridgelabz.measurement.model.Factors;
import com.bridgelabz.measurement.service.MeasurementServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MeasurementController {

    @Autowired
    MeasurementServiceImplementation measurementServiceImplementation;

    @GetMapping("/welcome")
    public String welcomeMessage(){
        return "Welcome to Quantity Measurement";
    }

    @PostMapping("/add")
    public Boolean addUnit(@RequestBody List <Factors> factor){
        return measurementServiceImplementation.converting(factor);
    }

}
