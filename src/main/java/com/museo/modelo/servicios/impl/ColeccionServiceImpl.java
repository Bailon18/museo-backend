package com.museo.modelo.servicios.impl;

import com.museo.modelo.entidades.Coleccion;
import com.museo.modelo.repositorios.ColeccionRepository;
import com.museo.modelo.servicios.ColeccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColeccionServiceImpl implements ColeccionService {

    @Autowired
    private ColeccionRepository coleccionRepository;

    @Override
    public List<Coleccion> listarColeccionesDescendente() {
        return coleccionRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }
}
