package com.museo.modelo.repositorios;

import com.museo.modelo.entidades.ObservacionVitrina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObservacionVitrinaRepository extends JpaRepository<ObservacionVitrina, Long> {
  
}
