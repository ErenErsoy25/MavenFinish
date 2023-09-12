package com.erenimodemo.springbootdeneme.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
// Lombok kodu azaltmayı amaçlayan kütüphane getter, setter, equals, hashCode

@Data  // Lombok, get-set metodları için
@Entity  // JPA Entity belirtisi bir tabloya karşılık gelir (Ogretmenler tablosu)
@Table(name = "ogretmen")  
public class Ogretmen {
    private String name;  
    private int age;  
    @Id  // Primay Key belirtisi
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Otomatik ID ++
    private int id;
    //Eğer bir öğretmeni silerseniz ve bu öğrenciye ait sınav notları veritabanında kalırsa, bu durum veritabanı bütünlüğü için sorun oluşturabilir. 
    //Spring Data JPA ile bu durumlar için CascadeType kullanılarak bu tür sorunların önüne geçilebilir.
    @OneToMany(mappedBy = "ogretmen", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Ders> dersler;
}