package com.museo.modelo.repositorios;

import com.museo.modelo.entidades.EquipoTipo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface EquipoTipoRepository extends JpaRepository<EquipoTipo, Long> {
	
    // Consulta para buscar EquipoTipo por el ID de un equipo
    List<EquipoTipo> findByEquiposId(Long equiposId);
}
