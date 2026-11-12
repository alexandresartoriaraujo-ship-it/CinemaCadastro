
package com.dest1.cinema.controller;

import com.dest1.cinema.register.CadastroCinema;
import com.dest1.cinema.repositories.CinemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/filmes")
public class CinemaCadastro {

    @Autowired
    CinemaRepository repository;

    @PostMapping
    public CadastroCinema cadastrar(@RequestBody CadastroCinema c) {
        return repository.save(c);
    }

    @GetMapping
    public List<CadastroCinema> mostrar() {
        return repository.findAll();
    }

}
