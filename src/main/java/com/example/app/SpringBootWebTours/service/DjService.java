package com.example.app.SpringBootWebTours.service;

import com.example.app.SpringBootWebTours.entity.dj;
import com.example.app.SpringBootWebTours.repository.DjRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

@Service
public class DjService {

    @Autowired
    DjRepository repository;

    public List<dj> getDj() throws URISyntaxException, IOException {
        return repository.getDj();
    }
}
