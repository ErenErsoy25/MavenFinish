package com.erenimodemo.springbootdeneme.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.erenimodemo.springbootdeneme.entity.SinavGrade;
import com.erenimodemo.springbootdeneme.service.SinavGradeService;


import java.util.List;

@RestController
@RequestMapping("/api")
public class SinavGradeController {

    private final SinavGradeService sinavGradeService;

    public SinavGradeController(SinavGradeService sinavGradeService) {
        this.sinavGradeService = sinavGradeService;
    }

    @GetMapping("/sinavgrade")
    public ResponseEntity<List<SinavGrade>> getAllSinavNotu() {
        return new ResponseEntity<>(sinavGradeService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/sinavgrade")
    public ResponseEntity<SinavGrade> addSinavGrade(@RequestBody SinavGrade sinavGrade) {
        return new ResponseEntity<>(sinavGradeService.addSinavGrade(sinavGrade), HttpStatus.CREATED);
    }
}
