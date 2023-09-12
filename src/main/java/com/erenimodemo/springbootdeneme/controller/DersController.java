package com.erenimodemo.springbootdeneme.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.erenimodemo.springbootdeneme.entity.Ders;
import com.erenimodemo.springbootdeneme.service.DersService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DersController {

    private final DersService dersService;

    public DersController(DersService dersService) {
        this.dersService = dersService;
    }

    @GetMapping("/ders")
    public ResponseEntity<List<Ders>> getAllDers() {
        return new ResponseEntity<>(dersService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/ders")
    public ResponseEntity<Ders> addDers(@RequestBody Ders ders) {
        return new ResponseEntity<>(dersService.addDers(ders), HttpStatus.CREATED);
    }
}
