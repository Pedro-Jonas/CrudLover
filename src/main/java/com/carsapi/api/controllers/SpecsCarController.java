package com.carsapi.api.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carsapi.api.dto.SpecsDTO;

@RestController
@RequestMapping("/specs")
public class SpecsCarController {
    @PostMapping
    public void createSpec(@RequestBody SpecsDTO req) {
        System.out.println(req);
    }
}
