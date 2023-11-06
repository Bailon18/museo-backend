package com.museo.modelo.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.museo.modelo.entidades.Observacion;
import com.museo.modelo.repositorios.ObservacionRepository;
import com.museo.modelo.servicios.ObservacionService;

import java.util.List;

@Service
public class ObservacionServiceImpl implements ObservacionService {
    
	
	@Autowired
	private ObservacionRepository observacionRepository;


    @Override
    public Observacion guardarObservacion(Observacion observacion) {
        Observacion nuevaObservacion = observacionRepository.save(observacion);
        String formatoCodigo = "O-VIT" + String.format("%05d", nuevaObservacion.getId());
        nuevaObservacion.setCodigoObservacion(formatoCodigo);
        return observacionRepository.save(nuevaObservacion);
    }

    @Override
    public Observacion obtenerObservacionPorId(long id) {
        return observacionRepository.findById(id).orElse(null);
    }

    @Override
    public List<Observacion> obtenerTodasLasObservaciones() {
        return observacionRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }

    @Override
    public void eliminarObservacion(long id) {
        observacionRepository.deleteById(id);
    }
    
    @Override
    public List<Object[]> getObservationReport() {
        return observacionRepository.getObservationReport();
    }
}
