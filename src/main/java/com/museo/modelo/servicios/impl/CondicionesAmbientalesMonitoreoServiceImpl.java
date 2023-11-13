package com.museo.modelo.servicios.impl;

import com.museo.modelo.entidades.CondicionesAmbientalesMonitoreo;
import com.museo.modelo.repositorios.CondicionesAmbientalesMonitoreoRepository;
import com.museo.modelo.servicios.CondicionesAmbientalesMonitoreoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CondicionesAmbientalesMonitoreoServiceImpl implements CondicionesAmbientalesMonitoreoService {

	@Autowired
	private CondicionesAmbientalesMonitoreoRepository condicionesAmbientalesMonitoreoRepository;

	@Override
	public CondicionesAmbientalesMonitoreo guardarCondicionesAmbientalesMonitoreo(
			CondicionesAmbientalesMonitoreo condicionesAmbientalesMonitoreo) {
		
		condicionesAmbientalesMonitoreo = condicionesAmbientalesMonitoreoRepository
				.save(condicionesAmbientalesMonitoreo);
		String nuevoCodigo = "CA-VIT" + String.format("%04d", condicionesAmbientalesMonitoreo.getId());
		condicionesAmbientalesMonitoreo.setCodigo_condicion(nuevoCodigo);
		return condicionesAmbientalesMonitoreoRepository.save(condicionesAmbientalesMonitoreo);
	}

	@Override
	public List<CondicionesAmbientalesMonitoreo> obtenerTodosCondicionesAmbientalesMonitoreo() {
		return condicionesAmbientalesMonitoreoRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
	}

	@Override
	public Optional<CondicionesAmbientalesMonitoreo> obtenerPorId(Long id) {
		return condicionesAmbientalesMonitoreoRepository.findById(id);
	}

	@Override
	public void eliminarCondicionesAmbientalesMonitoreo(Long id) {
		condicionesAmbientalesMonitoreoRepository.deleteById(id);
	}
}
