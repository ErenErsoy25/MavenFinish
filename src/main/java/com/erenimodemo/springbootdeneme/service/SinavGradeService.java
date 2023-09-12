package com.erenimodemo.springbootdeneme.service;

import org.springframework.stereotype.Service;
import com.erenimodemo.springbootdeneme.entity.SinavGrade;
import com.erenimodemo.springbootdeneme.repository.SinavGradeRepository;


import java.util.List;

@Service
public class SinavGradeService {

 private final SinavGradeRepository sinavGradeRepository;

 public SinavGradeService(SinavGradeRepository sinavGradeRepository) {
     this.sinavGradeRepository = sinavGradeRepository;
 }

 public List<SinavGrade> getAll() {
     return sinavGradeRepository.findAll();
 }

 public SinavGrade addSinavGrade(SinavGrade sinavGrade) {
     return sinavGradeRepository.save(sinavGrade);
 }
}
