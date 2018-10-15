package com.example.apptrainig.controller;

import com.example.apptrainig.model.Categoria;
import com.example.apptrainig.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CetegoriaController {

    @Autowired
    CategoryService serv;

    @GetMapping("/categoria/{id}")
    public ResponseEntity<Categoria> busca(@PathVariable int id){

        Categoria cat = serv.buscar(id);
        return ResponseEntity.ok().body(cat);
    }

}
