package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {
    public static void main(String[] args) {
        // testing class poemBeautifier using lamba
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        // changing input string to upperCase <lamba #1>
        System.out.println(poemBeautifier.beautify("upper case test", string -> string.toUpperCase()));
        // changing input string for different string <lamba #2>
        System.out.println(poemBeautifier.beautify("Polska.", string -> "Nie Polska."));
        // using lamba to call for method and change input string with it <lamba #3>
        System.out.println(poemBeautifier.beautify("Wysokie IQ ", string -> poemBeautifier.beautify(string, null)));
        // using method without lamba <normal method use>
        System.out.println(poemBeautifier.beautify("Niskie IQ ", null));
        // adding my own letters for input string <lamba #4>
        System.out.println(poemBeautifier.beautify("Przykladowy test", string -> string + " lambdy."));

        System.out.println("\nUsing Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}