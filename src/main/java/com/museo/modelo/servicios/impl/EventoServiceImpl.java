package com.museo.modelo.servicios.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.museo.modelo.entidades.BienesPatrimoniales;
import com.museo.modelo.entidades.Evento;
import com.museo.modelo.entidades.ObservacionBienPatrimonial;
import com.museo.modelo.repositorios.EventoRepository;
import com.museo.modelo.repositorios.ObservacionBienPatrimonialRepository;
import com.museo.modelo.servicios.EventoService;
import com.museo.util.DetallesEventoBienesPatrimonialesDTO;

@Service
public class EventoServiceImpl implements EventoService {

	@Autowired
    private EventoRepository eventoRepository;

    @Autowired
    private ObservacionBienPatrimonialRepository observacionBienPatrimonialRepository;

    @Override
    public Evento crearEvento(Evento evento) {
        BienesPatrimoniales bienesPatrimoniales = evento.getPatrimonio();
    
        if (bienesPatrimoniales != null) {
            ObservacionBienPatrimonial ultimaObservacion = observacionBienPatrimonialRepository.findLatestObservacionByBienPatrimonialId(bienesPatrimoniales.getId()).orElse(null);
    
            if (ultimaObservacion != null) {
                String nivelGravedad = ultimaObservacion.getGravedad().getDescripcion();
    
                if ("Grave".equals(nivelGravedad)) {
                    evento.setPrioridad("Alta");
                } else if ("Moderado".equals(nivelGravedad)) {
                    evento.setPrioridad("Media");
                } else if ("Leve".equals(nivelGravedad)) {
                    evento.setPrioridad("Baja");
                }
            }
        }
    
        evento = eventoRepository.save(evento);
        String nuevoCodigo = "EV-PRI" + String.format("%06d", evento.getId());
        evento.setCodigoEventos(nuevoCodigo);
    
        return eventoRepository.save(evento);
    }
    


    @Override
    public Evento actualizarEvento(Evento evento) {
        if (eventoRepository.existsById(evento.getId())) {
            return eventoRepository.save(evento);
        } else {
            return null;
        }
    }

    @Override
    public void eliminarEvento(Long eventoId) {
        eventoRepository.deleteById(eventoId);
    }

	@Override
	public DetallesEventoBienesPatrimonialesDTO obtenerDetallesPorIdBienesPatrimoniales(Long bienPatrimonialId) {
	
		  Object result = eventoRepository.obtenerDetallesPorIdBienesPatrimoniales(bienPatrimonialId);
	        return transformarResultado(result);
	}
	
	
    private DetallesEventoBienesPatrimonialesDTO transformarResultado(Object result) {
  
        if (result == null) {
            return null; 
        }

        Object[] row = (Object[]) result;
        
        DetallesEventoBienesPatrimonialesDTO dto = new DetallesEventoBienesPatrimonialesDTO();

        dto.setNombreUbicacion((String) row[0]);
        dto.setNombreNivelPiso((String) row[1]);
        dto.setRni((String) row[2]);        
        dto.setNombreCategoria((String) row[3]);        
        dto.setNombreColeccion((String) row[4]);
        dto.setNombreCultura((String) row[5]);
        dto.setNombreEstadoConservacion((String) row[6]);
        dto.setTipoMaterial((String) row[7]);
        dto.setDenominacion((String) row[8]);
        dto.setTematica((String) row[9]);
        dto.setCodigoBienPatrimonial((String) row[10]);
        dto.setNombreAnomalia((String) row[11]);
        dto.setNombreTipoAnomalia((String) row[12]);
        dto.setNombreGravedad((String) row[13]);
        dto.setNombreResultado((String) row[14]);        
        //dto.setDenominacion((String) row[15]);

        
        return dto;
    }
    
    @Override
    public List<Object> obtenerEventosPorPrioridad() {
        return eventoRepository.obtenerEventosPrioridad();
    }
}