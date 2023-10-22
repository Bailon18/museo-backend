package com.museo.modelo.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.museo.modelo.entidades.Vitrinas;
import com.museo.modelo.repositorios.VitrinasRepository;
import com.museo.modelo.servicios.VitrinasService;

import java.util.List;
import java.util.Optional;

@Service
public class VitrinasServiceImpl implements VitrinasService {

	@Autowired
    private  VitrinasRepository vitrinasRepository;

    
    @Override
    public List<Vitrinas> obtenerTodasLasVitrinas() {
        return vitrinasRepository.findAll();
    }

    @Override
    public Vitrinas obtenerVitrinaPorId(Long id) {
        Optional<Vitrinas> optionalVitrina = vitrinasRepository.findById(id);
        return optionalVitrina.orElse(null);
    }

    @Override
    public Vitrinas guardarVitrina(Vitrinas vitrina) {
        vitrina = vitrinasRepository.save(vitrina);
        Long vitrinaId = vitrina.getId();
        String nuevoCodigo = "V-EXP" + String.format("%04d", vitrinaId);
        vitrina.setCodigoVitrina(nuevoCodigo);
        return vitrinasRepository.save(vitrina);
    }

    @Override
    public void eliminarVitrina(Long id) {
        vitrinasRepository.deleteById(id);
    }
}
