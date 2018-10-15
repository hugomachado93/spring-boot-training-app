package com.example.apptrainig.service;

import com.example.apptrainig.model.Cliente;
import com.example.apptrainig.resource.CategoryRepository;
import com.example.apptrainig.resource.ClienteRepository;
import com.example.apptrainig.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository cliRep;

    public Cliente buscar(int id){
        Optional<Cliente> cli = cliRep.findById(id);
        return cli.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id, "Tipo: " + Cliente.class.getName()));
    }

}
