package com.museo.modelo.servicios.impl;

import com.museo.modelo.entidades.CondicionesAmbientalesMonitoreo;
import com.museo.modelo.repositorios.CondicionesAmbientalesMonitoreoRepository;
import com.museo.modelo.servicios.CondicionesAmbientalesMonitoreoService;
import com.museo.util.CondicionesAmbientalesDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
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
	
    public List<CondicionesAmbientalesDTO> obtenerCondicionesDTO() {
        List<Object[]> resultados = condicionesAmbientalesMonitoreoRepository.obtenerCondicionesAmbientalesMonitoreoDTO();
        List<CondicionesAmbientalesDTO> dtoList = new ArrayList<>();

        for (Object[] result : resultados) {
            CondicionesAmbientalesDTO dto = new CondicionesAmbientalesDTO();
            dto.setId((Long) result[0]);
            dto.setCodigoCondicion((String) result[1]);
            dto.setFechaRegistro((Date) result[2]);
            dto.setCodigoVitrina((String) result[3]);
            dto.setAmbiente((String) result[4]);
            dto.setNivelPiso((String) result[5]);
            dto.setEstadoVitrina((String) result[6]);
            dto.setHumedadAlerta((String) result[7]);
            dto.setTemperaturaAlerta((String) result[8]);
            dto.setLuminosidadAlerta((String) result[9]);
            dto.setEquipoTiposTem((String) result[10]);
            dto.setEquipoTiposHum((String) result[11]);
            dto.setEquipoTiposLum((String) result[12]);
            dtoList.add(dto);
        }

        return dtoList;
    }
}
