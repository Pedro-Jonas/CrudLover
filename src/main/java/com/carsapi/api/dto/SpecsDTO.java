package com.carsapi.api.dto;

import java.util.Date;

import io.micrometer.common.lang.NonNull;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;

public record SpecsDTO(
    @NotBlank String modelo,
    @NotBlank String fabricante, 
    @Past Date dataFabricacao, 
    @NonNull double valor,
    @NonNull int anoModelo
    ) {
    
}
