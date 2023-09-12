package com.erenimodemo.springbootdeneme.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.erenimodemo.springbootdeneme.entity.SinavGrade;

@Repository
public interface SinavGradeRepository extends JpaRepository<SinavGrade, Integer> {
}
