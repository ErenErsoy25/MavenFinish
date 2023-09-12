package com.erenimodemo.springbootdeneme.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.erenimodemo.springbootdeneme.entity.Ogretmen;
import com.erenimodemo.springbootdeneme.service.OgretmenService;

import java.util.List;

@RestController  // RESTful web servisleri için Controller belirtisi
@RequestMapping("/api")  // Temel URL yolu
public class OgretmenController {

    private final OgretmenService ogretmenService;  

    //  OgretmenService'i enjekte eder
    public OgretmenController(OgretmenService ogretmenService) {
        this.ogretmenService = ogretmenService;
    }

    @GetMapping("/ogretmen")  //Öğretmen getir
    public ResponseEntity<List<Ogretmen>> getAllOgretmen() {
        return new ResponseEntity<>(ogretmenService.getAll(), HttpStatus.OK);  
    }

    @PostMapping(value = "/ogretmen", consumes = "application/json")  // Öğretmen Ekle 
    public ResponseEntity<Ogretmen> addOgretmen(@RequestBody Ogretmen ogretmen) { 
        return new ResponseEntity<>(ogretmenService.addOgretmen(ogretmen), HttpStatus.CREATED);  
    }
}