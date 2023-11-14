package com.museo.modelo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.museo.modelo.entidades.TipoEvento;

public interface TipoEventoRepository extends JpaRepository<TipoEvento, Long> {
 
}
