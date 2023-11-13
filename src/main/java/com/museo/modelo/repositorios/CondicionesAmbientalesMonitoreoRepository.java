package com.museo.modelo.repositorios;

import com.museo.modelo.entidades.CondicionesAmbientalesMonitoreo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CondicionesAmbientalesMonitoreoRepository extends JpaRepository<CondicionesAmbientalesMonitoreo, Long> {
}
