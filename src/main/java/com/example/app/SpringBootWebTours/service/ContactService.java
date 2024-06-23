package com.example.app.SpringBootWebTours.service;

import com.example.app.SpringBootWebTours.entity.Contact;
import com.example.app.SpringBootWebTours.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public List<Contact> getContact() {
        Iterable<Contact> iterable = contactRepository.findAll();
        List<Contact> list = new ArrayList<>();
        iterable.forEach(list::add);
        return list;
    }
}