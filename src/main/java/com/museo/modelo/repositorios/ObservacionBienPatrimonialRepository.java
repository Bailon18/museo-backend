package com.museo.modelo.repositorios;

import com.museo.modelo.entidades.ObservacionBienPatrimonial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObservacionBienPatrimonialRepository extends JpaRepository<ObservacionBienPatrimonial, Long> {
    
}
