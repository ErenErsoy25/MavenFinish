package com.erenimodemo.springbootdeneme.service;

import org.springframework.stereotype.Service;
import com.erenimodemo.springbootdeneme.entity.Ogretmen;
import com.erenimodemo.springbootdeneme.repository.OgretmenRepository;

import java.util.List;

@Service  // Spring Service belirtisi
public class OgretmenService {

 private final OgretmenRepository ogretmenRepository;

 //Repository'yi enjekte eder
 public OgretmenService(OgretmenRepository ogretmenRepository) {
     this.ogretmenRepository = ogretmenRepository;
 }

 // Öğretmenleri getir
 public List<Ogretmen> getAll() {
     return ogretmenRepository.findAll();
 }

 // Öğretmen ekle
 public Ogretmen addOgretmen(Ogretmen ogretmen) {
     return ogretmenRepository.save(ogretmen);
 }
}