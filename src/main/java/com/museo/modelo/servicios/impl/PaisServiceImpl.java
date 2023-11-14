package com.museo.modelo.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.museo.modelo.entidades.Pais;
import com.museo.modelo.repositorios.PaisRepository;
import com.museo.modelo.servicios.PaisService;

import java.util.List;

@Service
public class PaisServiceImpl implements PaisService {
	

	@Autowired
    private PaisRepository paisRepository;

    @Override
    public List<Pais> listarPaises() {
        return paisRepository.findAll();
    }
}
