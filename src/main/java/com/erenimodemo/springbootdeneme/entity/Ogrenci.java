package com.erenimodemo.springbootdeneme.entity;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data  // Lombok, get-set metodları için
@Entity  // JPA Entity belirtisi bir tabloya karşılık gelir (Ogrenci tablosu)
@Table(name = "ogrenci")  
public class Ogrenci {

    private String name; 
    private int age;  
    @Id  // Primay Key belirtisi
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Otomatik ID ++
    private int id;
    @OneToMany(mappedBy = "ogrenci", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<SinavGrade> sinavGrade;
}