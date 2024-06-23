package com.example.app.SpringBootWebTours.controller;


import com.example.app.SpringBootWebTours.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AuthController {

    private List<User> users = new ArrayList<>();

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
    public String getRegister() {
        return "register"; // Повертаємо ім'я шаблону для сторінки реєстрації (register.html)
    }

    @PostMapping("/register")
    public String postRegister(@RequestParam String username, @RequestParam String password, Model model) {
        // Ось де має бути ваша логіка створення нового користувача
        User newUser = new User(username, password);
        users.add(newUser); // Додати нового користувача до списку (у реальному застосунку це буде збереження в базу даних)

        System.out.println("Registration successful - Username: " + username + ", Password: " + password);

        // Повертаємо користувача на сторінку входу після реєстрації
        return "redirect:/login";
    }
}