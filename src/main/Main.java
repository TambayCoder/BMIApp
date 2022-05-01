package main;

import logic.bmi.BMICalculator;
import logic.bmi.BMIResult;
import logic.bmi.Calculator;
import logic.bmi.Result;
import logic.bmi.ResultType;
import logic.person.Person;


public class Main {

    public static void main(String[] args) {
        
        BMICalculator calcu = new Calculator();
        BMIResult result = new Result();
        
        Person person = new Person();
        person.setName("sample");
        person.setHeightM(1.57);
        person.setWeightKg(60);
        

        //height,weight
        double bmi = calcu.calculate(person.getHeightM(), person.getWeightKg());
        ResultType status = result.interpret(bmi);
        
        System.out.println("Person: "+person.getName());
        System.out.println("BMI: "+bmi);
        System.out.println("Status: "+status.toString());
        
    }
}
