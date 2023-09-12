package com.erenimodemo.springbootdeneme.service;

import org.springframework.stereotype.Service;

import com.erenimodemo.springbootdeneme.entity.Ogrenci;
import com.erenimodemo.springbootdeneme.repository.OgrenciRepository;

import java.util.List;

@Service  // Spring Service belirtisi
public class OgrenciService {

	// final bir kere değer alıcak daha sonra değişmeyecek
 private final OgrenciRepository ogrenciRepository;

 //Repository'yi enjekte eder
 public OgrenciService(OgrenciRepository ogrenciRepository) {
     this.ogrenciRepository = ogrenciRepository;
 }

 // Öğrencileri getir 
 public List<Ogrenci> getAll() {
     return ogrenciRepository.findAll();
 }

 // Öğrenci Ekle 
 public Ogrenci addOgrenci(Ogrenci ogrenci) {
     return ogrenciRepository.save(ogrenci);
 }
}