package com.example.app.SpringBootWebTours.service;

import com.example.app.SpringBootWebTours.entity.User;
import com.example.app.SpringBootWebTours.entity.UserProfile;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private Map<String, User> users = new HashMap<>();

    public void addUser(User user) {
        users.put(user.getUsername(), user);
    }

    public User getUser(String username) {
        return users.get(username);
    }

    public UserProfile getUserProfile(String username) {
        // Це приклад. Ви повинні замінити на логіку отримання профілю користувача з бази даних чи іншого джерела
        User user = getUser(username);
        if (user != null) {
            return new UserProfile(user.getUsername(), "John Doe", "john.doe@example.com", "johndoe");
        }
        return null;
    }
}