package com.example.app.SpringBootWebTours.controller;

import com.example.app.SpringBootWebTours.service.ContactService;
import com.example.app.SpringBootWebTours.service.DjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.net.URISyntaxException;

@Controller
public class HomeController {

    @Autowired
    private ContactService contactService;

    @Autowired
    private DjService djService;

    @GetMapping("/")
    public String getHome(Model model) throws URISyntaxException, IOException {
        model.addAttribute("party", contactService.getContact());
        model.addAttribute("dj", djService.getDj());
        return "home";
    }
}