package com.museo.modelo.servicios.impl;


import com.museo.modelo.entidades.ObservacionVitrina;
import com.museo.modelo.repositorios.ObservacionVitrinaRepository;
import com.museo.modelo.servicios.ObservacionVitrinaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ObservacionVitrinaServiceImpl implements ObservacionVitrinaService {

	@Autowired
    private ObservacionVitrinaRepository observacionVitrinaRepository;


    @Override
    public ObservacionVitrina guardarObservacionVitrina(ObservacionVitrina observacionVitrina) {
        return observacionVitrinaRepository.save(observacionVitrina);
    }

    @Override
    public List<ObservacionVitrina> listarObservacionesVitrina() {
        return observacionVitrinaRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }

    @Override
    public ObservacionVitrina actualizarObservacionVitrina(long id, ObservacionVitrina observacionVitrina) {
        Optional<ObservacionVitrina> observacionExistente = observacionVitrinaRepository.findById(id);
        if (observacionExistente.isPresent()) {
            observacionVitrina.setId(id);
            return observacionVitrinaRepository.save(observacionVitrina);
        }
        return null;
    }

	@Override
	public ObservacionVitrina buscarObservacionVitrinaxObservacion(Long id) {
		return observacionVitrinaRepository.listadoOvitrinaxObservacion(id);
	}
    

}
