package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1, "michalski", 'M', LocalDate.of(1990, 12,12), 100));
        userList.add(new ForumUser(2, "kowalski", 'M', LocalDate.of(1940, 2, 12), 0));
        userList.add(new ForumUser(3, "miszka", 'K', LocalDate.of(2000, 1, 3), 41));
        userList.add(new ForumUser(4, "chloroform", 'M', LocalDate.of(1993, 4, 2), 4));
        userList.add(new ForumUser(5, "sarkandom", 'K', LocalDate.of(1978, 4, 1), 12));
        userList.add(new ForumUser(6, "osa", 'K', LocalDate.of(1984, 9, 4), 951));
        userList.add(new ForumUser(7, "polskipatiota", 'M', LocalDate.of(1999, 3, 7), 94));
        userList.add(new ForumUser(8, "sarkastyczny", 'M', LocalDate.of(1989, 2, 1), 10));
        userList.add(new ForumUser(9, "bozenazlodzi", 'K', LocalDate.of(1920, 10, 17), 2));
        userList.add(new ForumUser(10, "achmin", 'M', LocalDate.of(1972, 4, 14), 50));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
