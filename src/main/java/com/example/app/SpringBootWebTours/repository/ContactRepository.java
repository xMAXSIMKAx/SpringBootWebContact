package com.example.app.SpringBootWebTours.repository;

import com.example.app.SpringBootWebTours.entity.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Integer> {
}