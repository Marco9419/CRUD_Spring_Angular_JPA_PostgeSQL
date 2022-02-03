package com.bytecode.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bytecode.core.model.Persona;

public interface personaRepository extends JpaRepository<Persona, Long> {

}
