package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int userID;
    private final String username;
    private final char sex;
    private final LocalDate userBirthDay;
    private final int postsAmount;

    public ForumUser(final int userID, final String username, final char sex, LocalDate userBirthDay, final int postsAmount) {
        this.userID = userID;
        this.username = username;
        this.sex = sex;
        this.userBirthDay = userBirthDay;
        this.postsAmount = postsAmount;
    }

    public int getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getUserBirthDay() {
        return userBirthDay;
    }

    public int getPostsAmount() {
        return postsAmount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", userBirthDay=" + userBirthDay +
                ", postsAmount=" + postsAmount + "\n";
    }
}
