package com.museo.modelo.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.museo.modelo.entidades.TipoEvento;
import com.museo.modelo.repositorios.TipoEventoRepository;
import com.museo.modelo.servicios.TipoEventoService;

import java.util.List;

@Service
public class TipoEventoServiceImpl implements TipoEventoService {

	@Autowired
    private TipoEventoRepository tipoEventoRepository;

    
    @Override
    public List<TipoEvento> listarTiposEventos() {
        return tipoEventoRepository.findAll();
    }
}

