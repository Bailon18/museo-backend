package com.museo.modelo.repositorios;

import com.museo.modelo.entidades.Equipos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EquiposRepository extends JpaRepository<Equipos, Long> {

}

