package com.museo.modelo.repositorios;


import com.museo.modelo.entidades.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
