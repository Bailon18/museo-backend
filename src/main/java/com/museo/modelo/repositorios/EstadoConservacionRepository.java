package com.museo.modelo.repositorios;

import com.museo.modelo.entidades.EstadoConservacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoConservacionRepository extends JpaRepository<EstadoConservacion, Long> {
}
