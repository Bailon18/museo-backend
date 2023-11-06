package com.museo.controladores;

import com.museo.modelo.entidades.EquipoTipo;
import com.museo.modelo.entidades.Equipos;
import com.museo.modelo.servicios.EquipoTipoService;
import com.museo.modelo.servicios.EquiposService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/equipos")
@CrossOrigin(origins = {"*"})
public class EquiposController {

    @Autowired
    private EquiposService equiposService;
    
    @Autowired
    private EquipoTipoService equipoTipoService;

    @GetMapping("/")
    public List<Equipos> listarEquipos() {
        return equiposService.listarEquiposDescendente();
    }

    @GetMapping("/{id}")
    public Equipos obtenerEquipoPorId(@PathVariable Long id) {
        return equiposService.obtenerEquipoPorId(id);
    }
    
    @PostMapping("/")
    public Equipos crearEquipo(
            @RequestBody Equipos equipo) {
        return equiposService.crearEquipo(equipo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarEquipo(@PathVariable Long id) {

        try {
            boolean eliminado = equiposService.eliminarEquipo(id);
            if (eliminado) {
                return new ResponseEntity<>("Eliminado exitosamente", HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Recurso no encontrado", HttpStatus.NOT_FOUND);
            }
        } catch (DataIntegrityViolationException ex) {
            return new ResponseEntity<>("Error: No se puede eliminar debido a una restricción de clave externa", HttpStatus.CONFLICT);
        } catch (Exception ex) {
            return new ResponseEntity<>("Error al eliminar el recurso", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @GetMapping("/equipotipo/{equipoId}")
    public ResponseEntity<List<EquipoTipo>> getEquipoTipoByEquipoId(@PathVariable Long equipoId) {

        List<EquipoTipo> equipoTipos = equipoTipoService.findEquipoTipoByEquiposId(equipoId);
        return new ResponseEntity<>(equipoTipos, HttpStatus.OK);
    }
}