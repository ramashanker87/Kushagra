package com.kushagra.app.custom;

public class TestAgeValidation {
    public static void main(String[] args) {
        TestAgeValidation test=new TestAgeValidation();
        try{
            test.validateAge(14);
        }catch(AgeValidationException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Age Validation Exception Executed");
        }
    }

    public void validateAge(int age) throws AgeValidationException {
        if (age < 18) {
            throw new AgeValidationException("Age must be 18 or older.");
        }
    }
}
