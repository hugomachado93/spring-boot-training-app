package com.example.apptrainig.service;

import com.example.apptrainig.model.Categoria;
import com.example.apptrainig.resource.CategoryRepository;
import com.example.apptrainig.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService{

    @Autowired
    CategoryRepository catRep;

    public Categoria buscar(int id){
        Optional<Categoria> cat = catRep.findById(id);
        return cat.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id, "Tipo: " + Categoria.class.getName()));
    }

}
