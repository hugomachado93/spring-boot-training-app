package com.example.apptrainig.controller;

import com.example.apptrainig.model.Categoria;
import com.example.apptrainig.model.Cliente;
import com.example.apptrainig.service.CategoryService;
import com.example.apptrainig.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    @Autowired
    ClienteService serv;

    @GetMapping("/cliente/{id}")
    public ResponseEntity<Cliente> busca(@PathVariable int id){

        Cliente cli = serv.buscar(id);
        return ResponseEntity.ok().body(cli);
    }

    //TESTE

}
