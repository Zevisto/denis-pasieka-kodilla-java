package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(20, 12);
        } catch (Exception e){
            System.out.println("Sorry. Something went wrong. " + e);
        }
    }
}
