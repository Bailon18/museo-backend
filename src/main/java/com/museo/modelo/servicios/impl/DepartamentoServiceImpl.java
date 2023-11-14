package com.museo.modelo.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.museo.modelo.entidades.Departamento;
import com.museo.modelo.repositorios.DepartamentoRepository;
import com.museo.modelo.servicios.DepartamentoService;

import java.util.List;

@Service
public class DepartamentoServiceImpl implements DepartamentoService {

	@Autowired
    private DepartamentoRepository departamentoRepository;

    @Override
    public List<Departamento> obtenerDepartamentosPorPais(Long paisId) {
        return departamentoRepository.findByPaisId(paisId);
    }
}
