package com.example.app.SpringBootWebTours.controller;

import com.example.app.SpringBootWebTours.entity.User;
import com.example.app.SpringBootWebTours.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String getLogin() {
        return "login"; // Повертаємо ім'я шаблону для сторінки входу (login.html)
    }

    @PostMapping("/login")
    public String postLogin(@RequestParam String username, @RequestParam String password, Model model) {
        // Ваша логіка перевірки користувача тут (просто виводимо дані в консоль для демонстрації)
        System.out.println("Login attempt - Username: " + username + ", Password: " + password);

        // Повертаємо користувача на головну сторінку після входу
        return "redirect:/";
    }

    @GetMapping("/register")
    public String getRegister(Model model) {
        model.addAttribute("user", new User());
        return "register"; // Повертаємо ім'я шаблону для сторінки реєстрації (register.html)
    }

    @PostMapping("/register")
    public String postRegister(@ModelAttribute User user, Model model) {
        // Ось де має бути ваша логіка створення нового користувача
        userService.addUser(user);

        System.out.println("Registration successful - Username: " + user.getUsername() + ", Password: " + user.getPassword());

        // Повертаємо користувача на сторінку профілю
        return "redirect:/profile";
    }
}
