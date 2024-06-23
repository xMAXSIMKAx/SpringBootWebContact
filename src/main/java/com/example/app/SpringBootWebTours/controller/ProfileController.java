package com.example.app.SpringBootWebTours.controller;

import com.example.app.SpringBootWebTours.entity.User;
import com.example.app.SpringBootWebTours.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController {

    @Autowired
    private UserService userService;

    @GetMapping("/profile")
    public String userProfile(Model model) {
        // Отримуємо поточного користувача з UserService (припустимо, що це із вашої системи авторизації)
        User currentUser = userService.getUser("exampleUser");

        // Передаємо користувача в модель для відображення на сторінці
        model.addAttribute("profile", currentUser);

        return "profile";
    }
}