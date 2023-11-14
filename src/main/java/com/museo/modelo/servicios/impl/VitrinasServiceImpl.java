package com.museo.modelo.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.museo.modelo.entidades.Vitrinas;
import com.museo.modelo.repositorios.VitrinasRepository;
import com.museo.modelo.servicios.VitrinasService;
import com.museo.util.EquipoTipoDTO;
import com.museo.util.VitrinaDTO;

import java.util.ArrayList;
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

    public VitrinaDTO obtenerDatosPorCodigoVitrina(String codigoVitrina) {
        List<Object[]> resultados = vitrinasRepository.findDataByCodigoVitrina(codigoVitrina);

        VitrinaDTO vitrinaDTO = null;

        for (Object[] resultado : resultados) {
            if (vitrinaDTO == null) {
                vitrinaDTO = new VitrinaDTO();
                vitrinaDTO.setCodigoVitrina((String) resultado[0]);
                vitrinaDTO.setAmbiente((String) resultado[1]);
                vitrinaDTO.setNivelpiso((String) resultado[2]);
                vitrinaDTO.setEstadoVitrina((String) resultado[3]);

                List<EquipoTipoDTO> equipoTipos = new ArrayList<>();
                EquipoTipoDTO equipoTipoDTO = new EquipoTipoDTO();
                equipoTipoDTO.setCodigo_equipo_tipo((String) resultado[4]);
                equipoTipoDTO.setUnidad_medida((String) resultado[5]);
                equipoTipos.add(equipoTipoDTO);

                vitrinaDTO.setEquipoTipos(equipoTipos);
            } else {
                // Si hay múltiples resultados, agrega a la lista existente
                EquipoTipoDTO equipoTipoDTO = new EquipoTipoDTO();
                equipoTipoDTO.setCodigo_equipo_tipo((String) resultado[4]);
                equipoTipoDTO.setUnidad_medida((String) resultado[5]);
                vitrinaDTO.getEquipoTipos().add(equipoTipoDTO);
            }
        }

        return vitrinaDTO;
    }


}
