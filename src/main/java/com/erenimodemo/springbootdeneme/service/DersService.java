package com.erenimodemo.springbootdeneme.service;

import org.springframework.stereotype.Service;
import com.erenimodemo.springbootdeneme.entity.Ders;
import com.erenimodemo.springbootdeneme.repository.DersRepository;

import java.util.List;

@Service
public class DersService {

 private final DersRepository dersRepository;

 public DersService(DersRepository dersRepository) {
     this.dersRepository = dersRepository;
 }

 public List<Ders> getAll() {
     return dersRepository.findAll();
 }

 public Ders addDers(Ders ders) {
     return dersRepository.save(ders);
 }
}
