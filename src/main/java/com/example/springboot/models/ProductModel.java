package com.example.springboot.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name= "tb_products")
@Data    
public class ProductModel implements Serializable{

    private static final long serialVersionUID = 1L; 

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
 
 

    @Column (unique = true)
    private String name;
    private BigDecimal price;
  
   


    @CreationTimestamp
    private LocalDateTime createdAt;


}
