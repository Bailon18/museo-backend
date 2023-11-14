package com.museo.modelo.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.museo.modelo.entidades.Evento;
import com.museo.modelo.repositorios.EventoRepository;
import com.museo.modelo.servicios.EventoService;
import com.museo.util.DetallesEventoBienesPatrimonialesDTO;

@Service
public class EventoServiceImpl implements EventoService {

	@Autowired
    private EventoRepository eventoRepository;

    @Override
    public Evento crearEvento(Evento evento) {
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
            return null; // o lanza una excepción según tu lógica de manejo de errores
        }

        Object[] row = (Object[]) result;
        
        DetallesEventoBienesPatrimonialesDTO dto = new DetallesEventoBienesPatrimonialesDTO();

        dto.setNombreUbicacion((String) row[0]);
        dto.setNombreNivelPiso((String) row[1]);
        dto.setRni((String) row[2]);
      

        return dto;
    }
}