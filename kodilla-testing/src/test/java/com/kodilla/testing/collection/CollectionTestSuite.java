package com.kodilla.testing.collection;

import org.junit.*;
import java.lang.*;
import java.util.*;

public class CollectionTestSuite {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    OddNumbersExterminator numbersExterminator = new OddNumbersExterminator();

    @Test
    public void testOddNumbersExterminatorListSizeCheck() {
        System.out.println("Checking if the array size is right: ");
        ArrayList<Integer> bobList = numbersExterminator.exterminate(numbers);
        Assert.assertTrue(bobList.size() == 2);
    }
    @Test
    public void testOddNumbersExterminatorListCheck() {
        System.out.println("Checking if the numbers in array are divided by 2: ");
        ArrayList<Integer> bobList = numbersExterminator.exterminate(numbers);
        for (int n = 0; n < bobList.size(); n++) {
            Assert.assertTrue(bobList.get(n) % 2 == 0);
        }
    }
    @Before
    public void start() {
        numbers.add(12);
        numbers.add(10);
        numbers.add(11);
        numbers.add(3);
        numbers.add(5);
        numbers.add(19);
        System.out.println("\n Starting test.");
    }
    @After
    public void finish() {
        numbers.clear();
        System.out.println("\n Test finished.");
    }
}
