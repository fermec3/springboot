package com.example.springboot.dtos;



import java.math.BigDecimal;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public record ProductRecordsDto(@NotBlank String name, @NotNull BigDecimal price) {
    
}
