package com.erenimodemo.springbootdeneme.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "sinav_grade")
public class SinavGrade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double puan; // not kelimesini puan olarak değiştirdim.
    
    @ManyToOne
    @JoinColumn(name="ogrenci_id")
    private Ogrenci ogrenci;
    
    @ManyToOne
    @JoinColumn(name="ders_id")
    private Ders ders;
}