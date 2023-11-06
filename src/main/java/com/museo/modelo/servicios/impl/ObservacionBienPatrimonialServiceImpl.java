package com.museo.modelo.servicios.impl;

import com.museo.modelo.entidades.ObservacionBienPatrimonial;
import com.museo.modelo.repositorios.ObservacionBienPatrimonialRepository;
import com.museo.modelo.servicios.ObservacionBienPatrimonialService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObservacionBienPatrimonialServiceImpl implements ObservacionBienPatrimonialService {

	@Autowired
    private ObservacionBienPatrimonialRepository observacionBienPatrimonialRepository;


    @Override
    public ObservacionBienPatrimonial guardarObservacionBienPatrimonial(ObservacionBienPatrimonial observacionBienPatrimonial) {
        return observacionBienPatrimonialRepository.save(observacionBienPatrimonial);
    }

    @Override
    public List<ObservacionBienPatrimonial> listarObservacionesBienPatrimonial() {
        return observacionBienPatrimonialRepository.findAll();
    }

    @Override
    public ObservacionBienPatrimonial actualizarObservacionBienPatrimonial(long id, ObservacionBienPatrimonial observacionBienPatrimonial) {
        if (observacionBienPatrimonialRepository.existsById(id)) {
            observacionBienPatrimonial.setId(id);
            return observacionBienPatrimonialRepository.save(observacionBienPatrimonial);
        } else {
            return null;
        }
    }

    @Override
    public void eliminarObservacionBienPatrimonial(long id) {
        observacionBienPatrimonialRepository.deleteById(id);
    }
}
