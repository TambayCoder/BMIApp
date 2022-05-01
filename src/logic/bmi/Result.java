package logic.bmi;


public class Result implements BMIResult{

//    BMI	Weight Status
//Below 18.5	Underweight
//18.5—24.9	Healthy
//25.0—29.9	Overweight
//30.0 and Above	Obese

    @Override
    public ResultType interpret(double bmi) {
        //under
        if(bmi < 18.5) return ResultType.UNDERWEIGHT;
        
        //normal
        if(bmi < 24.9) return ResultType.HEALTHY;
        
        if(bmi < 29.9) return ResultType.OVERWEIGHT;
        
        return ResultType.OBESE;
    }

}
