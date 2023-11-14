package com.museo.modelo.servicios.impl;

import com.museo.modelo.entidades.Ambiente;
import com.museo.modelo.repositorios.AmbienteRepository;
import com.museo.modelo.servicios.AmbienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AmbienteServiceImpl implements AmbienteService {

	@Autowired
    private AmbienteRepository ambienteRepository;

    
    @Override
    public List<Ambiente> listarAmbientes() {
        return ambienteRepository.findAll();
    }
}
