package com.example.apptrainig;

import com.example.apptrainig.model.*;
import com.example.apptrainig.model.Enum.TipoCliente;
import com.example.apptrainig.resource.*;
import com.example.apptrainig.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class AppTrainingApplication implements CommandLineRunner{

    @Autowired
    CategoryRepository catRep;

    @Autowired
    ProdutoRepository prodRep;

    @Autowired
    CidadeRepository cidRep;

    @Autowired
    EstadoRepository estRep;

    @Autowired
    ClienteRepository cliRep;

    @Autowired
    EnderecoRepository endRep;

    public static void main(String[] args) {
        SpringApplication.run(AppTrainingApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Categoria cat1 = new Categoria(0, "Informatica");
        Categoria cat2 = new Categoria(0, "Escritorio");

        Produto p1 = new Produto(0, "Computador", 2000.00);
        Produto p2 = new Produto(0, "Impressora", 800.00);
        Produto p3 = new Produto(0, "Mouse", 80.00);

        cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
        cat2.getProdutos().addAll(Arrays.asList(p2));

        p1.getCategorias().addAll(Arrays.asList(cat1));
        p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
        p3.getCategorias().addAll(Arrays.asList(cat1));

        catRep.saveAll(Arrays.asList(cat1, cat2));
        prodRep.saveAll(Arrays.asList(p1, p2, p3));

        Estado est1 = new Estado(0, "Minas Gerais");
        Estado est2 = new Estado(0, "Sao Paulo");

        Cidade c1 = new Cidade(0, "Uberlandia", est1);
        Cidade c2 = new Cidade(0, "Sao Paulo", est2);
        Cidade c3 = new Cidade (0, "Campinas", est2);

        est1.getCidades().addAll(Arrays.asList(c1));
        est2.getCidades().addAll(Arrays.asList(c2, c3));

        estRep.saveAll(Arrays.asList(est1, est2));
        cidRep.saveAll(Arrays.asList(c1, c2, c3));

        Cliente cli1 = new Cliente(0, "Maria", "maria@gmail.com", "11132421312", TipoCliente.PESSOAFISICA);
        cli1.getTelefones().addAll(Arrays.asList("23243431", "43213453"));

        Endereco e1 = new Endereco(0, "Rua Flores", "300", "303", "Botafogo", "334523445", cli1, c1);
        Endereco e2 = new Endereco(0, "Avenida Brasil", "456", "564", "Flamengo", "234545346", cli1, c2);

        cli1.getEnderecos().addAll(Arrays.asList(e1, e2));

        cliRep.saveAll(Arrays.asList(cli1));
        endRep.saveAll(Arrays.asList(e1, e2));

        //TESTANDO

    }
}
