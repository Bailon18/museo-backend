package com.museo.modelo.servicios.impl;

import com.museo.modelo.entidades.Ubicacion;
import com.museo.modelo.repositorios.UbicacionRepository;
import com.museo.modelo.servicios.UbicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UbicacionServiceImpl implements UbicacionService {

    @Autowired
    private UbicacionRepository ubicacionRepository;

    @Override
    public List<Ubicacion> listarUbicacionesDescendente() {
        return ubicacionRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }
}
