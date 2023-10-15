package com.museo.modelo.servicios.impl;


import com.museo.modelo.entidades.Categoria;
import com.museo.modelo.repositorios.CategoriaRepository;
import com.museo.modelo.servicios.CategoriaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService {

	@Autowired
    private CategoriaRepository categoriaRepository;


	@Override
	public List<Categoria> listarCategoriasDescendente() {
	    return categoriaRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
	}

}
