 package com.museo.modelo.servicios.impl;


import com.museo.modelo.entidades.EquipoTipo;
import com.museo.modelo.repositorios.EquipoTipoRepository;
import com.museo.modelo.servicios.EquipoTipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipoTipoServiceImpl implements EquipoTipoService {

    @Autowired
    private EquipoTipoRepository equipoTipoRepository;

    @Override
    public List<EquipoTipo> listarEquiposTipo() {
        return equipoTipoRepository.findAll();
    }

    @Override
    public EquipoTipo obtenerEquipoTipoPorId(Long id) {
        return equipoTipoRepository.findById(id).orElse(null);
    }

    @Override
    public EquipoTipo crearEquipoTipo(EquipoTipo equipoTipo) {

        // Asumimos que 'tipo' es el tipo de equipo proporcionado (TEM, HUM, LUM)
        String tipo = "";

        if (1 == equipoTipo.getTipoEquipo().getId()) {
            tipo = "TEM";
        } else if (2 == equipoTipo.getTipoEquipo().getId()) {
            tipo = "HUM";
        } else {
            tipo = "LUM";
        }

        // Guardamos equipoTipo en la base de datos
        equipoTipo = equipoTipoRepository.save(equipoTipo);

        // Verificamos que equipoTipo tenga un ID asignado (diferente de cero)
        if (equipoTipo.getId() != 0) {
            String nuevoCodigo = "E-" + tipo + String.format("%04d", equipoTipo.getId());
            equipoTipo.setCodigoEquipoTipo(nuevoCodigo);
            return equipoTipoRepository.save(equipoTipo);
        }
        
        // Manejo de errores si no se guardó correctamente
        return null;
    }


    @Override
    public EquipoTipo actualizarEquipoTipo(Long id, EquipoTipo equipoTipo) {
        if (equipoTipoRepository.existsById(id)) {
            equipoTipo.setId(id);
            return equipoTipoRepository.save(equipoTipo);
        }
        return null;
    }

    @Override
    public void eliminarEquipoTipo(Long id) {
        equipoTipoRepository.deleteById(id);
    }
    
    @Override
    public List<EquipoTipo> findEquipoTipoByEquiposId(Long equiposId) {
        return equipoTipoRepository.findByEquiposId(equiposId);
    }
}
