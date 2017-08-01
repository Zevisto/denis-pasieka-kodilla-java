package com.kodilla.testing.forum.statistics;

public class CountStats {
    int usersCount = 0;
    int postsCount = 0;
    int commentsCount = 0;
    int averagePostsPerUser = 0;
    int averageCommentsPerUser = 0;
    int averageCommentsPerPost = 0;

    public void showStatistics() {
        System.out.println("Number of users : " + usersCount + "." +
                "Number of posts : " + postsCount + "." +
                "Number of comments : " + commentsCount + "." +
                "Average number of posts per user : " + averagePostsPerUser + "." +
                "Average number of comments per user : " + averageCommentsPerUser + "." +
                "Average number of comments per post : " + averageCommentsPerPost + ".");
    }
    public void calculateAdvStatistics(Statistics statistics) {
        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        averagePostsPerUser = postsCount / usersCount;
        averageCommentsPerUser = commentsCount / usersCount;
        averageCommentsPerPost = postsCount / commentsCount;
    }
}
