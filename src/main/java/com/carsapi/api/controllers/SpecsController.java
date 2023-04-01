package com.carsapi.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carsapi.api.dto.SpecsDTO;
import com.carsapi.api.repository.SpecsRepository;
import com.carsapi.api.models.Specs;

@RestController
@RequestMapping("/specs")
public class SpecsController {

    @Autowired
    private SpecsRepository repository;

    @GetMapping
    public List<Specs> listAll () {
        return repository.findAll();
    }

    @PostMapping
    public void createSpec(@RequestBody SpecsDTO req) {
        repository.save(new Specs(req));
    }
}
