package logic.bmi;

import java.text.DecimalFormat;


public class Calculator implements BMICalculator{

    //logic for bmi
    //formula = w/h2
    
    private DecimalFormat format;
    
    public Calculator(){
        format = new DecimalFormat("#.##");
    }
    
    @Override
    public double calculate(double height, double weight) {
        double result =  weight/Math.pow(height,2);
        return Double.parseDouble(format.format(result));
    }

}
