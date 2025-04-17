package com.senai.prova.repositories;

import com.senai.prova.models.Movimento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MovimentoRepository extends JpaRepository<Movimento, Long> {
    Optional<Movimento>findById(Long id);
}

