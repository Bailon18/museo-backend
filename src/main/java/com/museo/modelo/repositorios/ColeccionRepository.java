package com.museo.modelo.repositorios;

import com.museo.modelo.entidades.Coleccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColeccionRepository extends JpaRepository<Coleccion, Long> {
}
