package com.erenimodemo.springbootdeneme.repository;

//Spring Data JPA'nın sağladığı bir interface.
//Bu interface, CRUD (Create, Read, Update, Delete) operasyonlarını kolaylaştırır.
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erenimodemo.springbootdeneme.entity.Ogrenci;

@Repository  // Spring Repository belirtisi   Primary Key ID = Integer 
public interface OgrenciRepository extends JpaRepository<Ogrenci, Integer> {
}