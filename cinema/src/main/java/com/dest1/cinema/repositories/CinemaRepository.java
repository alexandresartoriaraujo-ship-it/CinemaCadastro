

package com.dest1.cinema.repositories;

import com.dest1.cinema.entities.CadastroCinema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CinemaRepository extends JpaRepository<CadastroCinema, Integer> {

}
