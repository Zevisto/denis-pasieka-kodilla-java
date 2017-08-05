package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        int[] testArray2 = {20, 49, 42, 81, 44, 91, 29, 22, 90, 23};
        double averageNumber = ArrayOperations.getAverage(testArray2);
        Assert.assertTrue(averageNumber == 49.1);
    }
}
