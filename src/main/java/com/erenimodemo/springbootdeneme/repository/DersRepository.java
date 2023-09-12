package com.erenimodemo.springbootdeneme.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.erenimodemo.springbootdeneme.entity.Ders;

@Repository
public interface DersRepository extends JpaRepository<Ders, Integer> {
}
