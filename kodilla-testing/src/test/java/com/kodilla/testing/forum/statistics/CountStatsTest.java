package com.kodilla.testing.forum.statistics;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class CountStatsTest {
    CountStats testObject = new CountStats();
    Statistics statisticsMock = Mockito.mock(Statistics.class);
    @Test
    public void calculateAdvStatistics() {
        for(int x = 0; x < 100; x++) {
            statisticsMock.usersNames().add(x, "User.");
        }
        int userListSize = statisticsMock.usersNames().size();
        Mockito.when(statisticsMock.usersNames().size()).thenReturn(userListSize);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(100);
        Mockito.when(statisticsMock.postsCount()).thenReturn(1000);
        testObject.calculateAdvStatistics(statisticsMock);
        testObject.showStatistics();
    }
    @Before
    public void before() {
        System.out.println("Starting test.");
    }
    @After
    public void after() {
        System.out.println("Test finished.");
    }
}
