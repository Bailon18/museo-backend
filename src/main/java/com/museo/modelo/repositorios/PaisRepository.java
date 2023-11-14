package com.museo.modelo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.museo.modelo.entidades.Pais;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Long> {
    
}
