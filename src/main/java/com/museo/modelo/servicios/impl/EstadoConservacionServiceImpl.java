package com.museo.modelo.servicios.impl;

import com.museo.modelo.entidades.EstadoConservacion;
import com.museo.modelo.repositorios.EstadoConservacionRepository;
import com.museo.modelo.servicios.EstadoConservacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EstadoConservacionServiceImpl implements EstadoConservacionService {

    @Autowired
    private EstadoConservacionRepository estadoConservacionRepository;

    @Override
    public List<EstadoConservacion> listarEstadosConservacionDescendente() {
        return estadoConservacionRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }
}
