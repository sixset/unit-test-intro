package com.example.user;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class UserDao {

    private Set<User> users = new HashSet<>();

    public UserDao() {
        users.add(new User("John", LocalDate.now()));
        users.add(new User("Max", LocalDate.of(2017, 7, 6)));
    }

    public Set<User> getAllUsers() {
        return users;
    }

    public void save(User user) {
        users.add(user);
    }
}
