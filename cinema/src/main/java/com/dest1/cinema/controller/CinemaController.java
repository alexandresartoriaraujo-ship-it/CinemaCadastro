
package com.dest1.cinema.controller;

import com.dest1.cinema.entities.Cinema;
import com.dest1.cinema.repositories.CinemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/filmes")
public class CinemaController {

    @Autowired
    CinemaRepository repository;

    @PostMapping
    public Cinema cadastrar(@RequestBody Cinema c) {
        return repository.save(c);
    }

    @GetMapping
    public List<Cinema> mostrar() {
        return repository.findAll();
    }

}
