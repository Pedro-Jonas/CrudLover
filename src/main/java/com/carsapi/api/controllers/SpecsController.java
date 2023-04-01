package com.carsapi.api.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carsapi.api.dto.SpecsDTO;
import com.carsapi.api.repository.SpecsRepository;

import jakarta.validation.Valid;

import com.carsapi.api.models.Specs;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/specs")
public class SpecsController {

    @Autowired
    private SpecsRepository repository;

    @PostMapping
    public void createSpec(@RequestBody @Valid SpecsDTO req) {
        repository.save(new Specs(req));
    }

    @GetMapping
    public List<Specs> listAll () {
        return repository.findAll();
    }

    @PutMapping("/{id}")
    public void updateSpecById(@PathVariable Long id, @RequestBody @Valid SpecsDTO req) {
        Optional<Specs> findById = repository.findById(id);
        if (findById.isPresent()) {
            repository.deleteById(id);
            repository.save(new Specs(req));
        }
    }

    @DeleteMapping("/{id}")
    public void deleteSpecById(@PathVariable Long id) {
        Optional<Specs> findById = repository.findById(id);
        if (findById.isPresent()) {
            repository.deleteById(id);
        }
    }
}
