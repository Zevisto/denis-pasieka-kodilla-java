package com.kodilla.testing.collection;

import org.junit.*;
import java.lang.*;
import java.util.*;

public class CollectionTestSuite {
    ArrayList<Integer> numbers = new ArrayList<Integer>();

    @Test
    public void testOddNumbersExterminatorListCheck() {
        System.out.println("List check: ");
        numbers.add(12);
        numbers.add(10);
        numbers.add(2);
        numbers.add(50);
        numbers.add(22);
        for(int n = 0; n < numbers.size(); n++) {
            Assert.assertTrue(numbers.get(n) % 2 == 0);
        }
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        System.out.println("Empty List check: ");
        Assert.assertTrue(numbers.size() == 0);
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println("Normal List check : ");
        for(int n = 0; n < numbers.size(); n++) {
            Assert.assertFalse(numbers.get(n) % 2 == 0);
        }
    }
    @Before
    public void start() {
        System.out.println("\n Starting test.");
    }
    @After
    public void finish() {
        System.out.println("\n Test finished.");
    }
}
