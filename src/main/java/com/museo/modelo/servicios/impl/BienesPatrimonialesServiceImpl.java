package com.museo.modelo.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import com.museo.modelo.entidades.BienesPatrimoniales;
import com.museo.modelo.repositorios.BienesPatrimonialesRepository;
import com.museo.modelo.servicios.BienesPatrimonialesService;

import java.util.List;
import java.util.Optional;

@Service
public class BienesPatrimonialesServiceImpl implements BienesPatrimonialesService {
    
	@Autowired
	private BienesPatrimonialesRepository bienesPatrimonialesRepository;


    @Override
    public List<BienesPatrimoniales> obtenerTodosLosBienesPatrimoniales() {
        return bienesPatrimonialesRepository.findAll();
    }

    @Override
    public BienesPatrimoniales obtenerPorId(long id) {
        return bienesPatrimonialesRepository.findById(id).orElse(null);
    }


    public BienesPatrimoniales crearBienesPatrimoniales(BienesPatrimoniales bienesPatrimoniales) {
        bienesPatrimoniales = bienesPatrimonialesRepository.save(bienesPatrimoniales);
        System.out.println("BIEN " + bienesPatrimoniales);
        String nuevoCodigo = "CC" + String.format("%06d", bienesPatrimoniales.getId());
        bienesPatrimoniales.setCodigoBienPatrimonial(nuevoCodigo);
        System.out.println("BIEN2 " + bienesPatrimoniales);
        return bienesPatrimonialesRepository.save(bienesPatrimoniales);
    }

    
    @Override
    public List<BienesPatrimoniales> buscarBienesPorCondiciones(long ubicacion, long ambiente, long nivelpiso, long categoria) {
        return bienesPatrimonialesRepository.buscarBienesPorCondiciones(ubicacion, ambiente, nivelpiso, categoria);
    }
    
    @Override
    public boolean eliminarBienesPatrimoniales(long id) {
        try {
            bienesPatrimonialesRepository.deleteById(id);
            return true; // Retorna true cuando se elimina correctamente
        } catch (EmptyResultDataAccessException ex) {
            return false; // Retorna false cuando el recurso no se encuentra
        } catch (DataIntegrityViolationException ex) {
            throw ex; // Lanza la excepción cuando hay una restricción de clave externa
        } catch (Exception ex) {
            return false; // Retorna false en caso de otros errores
        }
    }

    
    @Override
    public BienesPatrimoniales actualizarBienesPatrimoniales(long id, BienesPatrimoniales bienesPatrimoniales) {
    	
        Optional<BienesPatrimoniales> optionalBienesPatrimoniales = bienesPatrimonialesRepository.findById(id);

        if (optionalBienesPatrimoniales.isPresent()) {
            BienesPatrimoniales existente = optionalBienesPatrimoniales.get();
            
            System.out.println("BIENESS PATRO: "+ existente.getId());
            
            // Aquí actualizas solo los campos necesarios
            
            existente.setId(bienesPatrimoniales.getId());
            existente.setTipoMaterial(bienesPatrimoniales.getTipoMaterial());
            existente.setDenominacion(bienesPatrimoniales.getDenominacion());
            existente.setTematica(bienesPatrimoniales.getTematica());
            existente.setDescripcion(bienesPatrimoniales.getDescripcion());
            existente.setDetalleConservacion(bienesPatrimoniales.getDetalleConservacion());
            existente.setTratamiento(bienesPatrimoniales.getTratamiento());
            existente.setResponsable(bienesPatrimoniales.getResponsable());
            existente.setCorreo(bienesPatrimoniales.getCorreo());
            existente.setCultura(bienesPatrimoniales.getCultura());
            existente.setUbicacion(bienesPatrimoniales.getUbicacion());
            existente.setCategoria(bienesPatrimoniales.getCategoria());
            existente.setColeccion(bienesPatrimoniales.getColeccion());
            existente.setNivelpiso(bienesPatrimoniales.getNivelpiso());
            existente.setRni(bienesPatrimoniales.getRni());
            existente.setEstadoConservacion(bienesPatrimoniales.getEstadoConservacion());

            // Luego, guarda la entidad actualizada
            return bienesPatrimonialesRepository.save(existente);
        } else {
            // Manejo de error si no se encuentra el elemento a actualizar
            throw new RuntimeException("No se encontró el bien patrimonial con ID " + id);
        }
    }
    
    @Override
    public List<Object[]> listarIdYCodigoBienPatrimonial() {
        return bienesPatrimonialesRepository.findIdAndCodigoBienPatrimonial();
    }

}
