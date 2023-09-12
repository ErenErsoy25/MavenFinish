package com.erenimodemo.springbootdeneme.repository;

// Spring Data JPA'nın sağladığı bir interface.
//Bu interface, CRUD (Create, Read, Update, Delete) operasyonlarını kolaylaştırır.

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erenimodemo.springbootdeneme.entity.Ogretmen;

@Repository  // Spring Repository belirtisi  Primary Key = Integer 
public interface OgretmenRepository extends JpaRepository<Ogretmen, Integer> {
}