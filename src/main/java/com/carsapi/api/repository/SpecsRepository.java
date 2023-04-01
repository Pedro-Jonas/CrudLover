package com.carsapi.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carsapi.api.models.Specs;

public interface SpecsRepository extends JpaRepository<Specs, Long> {
    
}
