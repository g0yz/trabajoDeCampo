package com.grupo7.TrabajoDeCampo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.grupo7.TrabajoDeCampo.model.Persona;

public interface PersonaRepository extends JpaRepository <Persona, Long> {
}
