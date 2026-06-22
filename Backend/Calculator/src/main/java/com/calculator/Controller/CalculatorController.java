package com.calculator.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.calculator.entity.Calculation;
import com.calculator.service.CalculatorService;

@RestController
@RequestMapping("/api/calculator")
@CrossOrigin(origins = "http://localhost:3000")
public class CalculatorController {

    @Autowired
    private CalculatorService service;

    @PostMapping("/calculate")
    public double calculate(@RequestBody Calculation calculation) {

        return service.calculate(
                calculation.getFirstNumber(),
                calculation.getSecondNumber(),
                calculation.getOperation());
    }
}