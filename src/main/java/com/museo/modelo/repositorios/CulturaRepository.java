package com.museo.modelo.repositorios;

import com.museo.modelo.entidades.Cultura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CulturaRepository extends JpaRepository<Cultura, Long> {
}
