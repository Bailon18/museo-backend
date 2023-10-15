package com.museo.modelo.servicios.impl;

import com.museo.modelo.entidades.NivelPiso;
import com.museo.modelo.repositorios.NivelPisoRepository;
import com.museo.modelo.servicios.NivelPisoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NivelPisoServiceImpl implements NivelPisoService {

    @Autowired
    private NivelPisoRepository nivelPisoRepository;

    @Override
    public List<NivelPiso> listarNivelesPisoDescendente() {
        return nivelPisoRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }
}
