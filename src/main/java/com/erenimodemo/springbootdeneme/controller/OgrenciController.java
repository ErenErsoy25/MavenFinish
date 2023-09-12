package com.erenimodemo.springbootdeneme.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.erenimodemo.springbootdeneme.entity.Ogrenci;
import com.erenimodemo.springbootdeneme.service.OgrenciService;

import java.util.List;

@RestController  // HTTP istekleri işlenecek ve işlenen yanıtlarını JSON ya da XML formatına dönüşecek
@RequestMapping("/api")  // Temel URL yolunu belirtiyor.
public class OgrenciController {

    private final OgrenciService ogrenciService;  

    // OgrenciService'i enjekte eder
    public OgrenciController(OgrenciService ogrenciService) {
        this.ogrenciService = ogrenciService;
    }

    @GetMapping("/ogrenci")  // Öğrencileri getirir
    public ResponseEntity<List<Ogrenci>> getAllOgrenci() {
        return new ResponseEntity<>(ogrenciService.getAll(), HttpStatus.OK);  
    }

    @PostMapping("/ogrenci")  // Öğrencileri ekler
    public ResponseEntity<Ogrenci> addOgrenci(@RequestBody Ogrenci ogrenci) { 
        return new ResponseEntity<>(ogrenciService.addOgrenci(ogrenci), HttpStatus.CREATED);  
    }
}