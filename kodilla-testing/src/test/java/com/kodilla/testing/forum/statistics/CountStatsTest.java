package com.kodilla.testing.forum.statistics;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

public class CountStatsTest {
    Statistics statisticsMock = Mockito.mock(Statistics.class);
    CountStats testObject = new CountStats();
    @Test
    public void calculateAdvStatistics() {
        ArrayList<String> myMockList = new ArrayList<>();
        for(int x = 0; x < 100; x++) {
            myMockList.add(x, "User.");
        }
        Mockito.when(statisticsMock.usersNames()).thenReturn(myMockList);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(100);
        Mockito.when(statisticsMock.postsCount()).thenReturn(1000);
        testObject.calculateAdvStatistics(statisticsMock);
        testObject.showStatistics();
        Assert.assertTrue(statisticsMock.usersNames().size() == 100 && testObject.getAverageCommentsPerUser() == 1);
    }
    @Before
    public void before() {
        System.out.println("Starting test.\n");
    }
    @After
    public void after() {
        System.out.println("Test finished.");
    }
}
