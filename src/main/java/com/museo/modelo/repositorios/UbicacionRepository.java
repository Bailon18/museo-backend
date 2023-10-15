package com.museo.modelo.repositorios;

import com.museo.modelo.entidades.Ubicacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UbicacionRepository extends JpaRepository<Ubicacion, Long> {
}
