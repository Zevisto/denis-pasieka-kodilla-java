package com.kodilla.testing.forum.statistics;

public class CountStats {
    int usersCount = 0;
    int postsCount = 0;
    int commentsCount = 0;
    int averagePostsPerUser = 0;
    int averageCommentsPerUser = 0;
    int averageCommentsPerPost = 0;

    public void showStatistics() {
        System.out.println("Number of users : " + usersCount + ".\n" +
                "Number of posts : " + postsCount + ".\n" +
                "Number of comments : " + commentsCount + ".\n" +
                "Average number of posts per user : " + averagePostsPerUser + ".\n" +
                "Average number of comments per user : " + averageCommentsPerUser + ".\n" +
                "Average number of comments per post : " + averageCommentsPerPost + ".\n");
    }
    public void calculateAdvStatistics(Statistics statistics) {
        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        averagePostsPerUser = postsCount / usersCount;
        averageCommentsPerUser = commentsCount / usersCount;
        averageCommentsPerPost = postsCount / commentsCount;

    }
    public int getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }
}
