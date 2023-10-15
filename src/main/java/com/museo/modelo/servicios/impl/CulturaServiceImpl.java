package com.museo.modelo.servicios.impl;

import com.museo.modelo.entidades.Cultura;
import com.museo.modelo.repositorios.CulturaRepository;
import com.museo.modelo.servicios.CulturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CulturaServiceImpl implements CulturaService {

    @Autowired
    private CulturaRepository culturaRepository;

    @Override
    public List<Cultura> listarCulturasDescendente() {
        return culturaRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }
}
