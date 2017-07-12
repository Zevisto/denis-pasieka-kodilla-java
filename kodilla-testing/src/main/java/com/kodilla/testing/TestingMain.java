package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calc = new Calculator(12, 10);

        int addResult = calc.add();
        int substractResult = calc.substract();

        if(addResult == 22) {
            System.out.println("Add test success.");
        } else {
            System.out.println("Add test failed !");
        }

        if(substractResult == 2) {
            System.out.println("Substract test success.");
        } else {
            System.out.println("Substract test failed !");
        }
    }
}