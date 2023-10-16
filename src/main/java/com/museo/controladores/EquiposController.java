package com.museo.controladores;

import com.museo.modelo.entidades.Equipos;
import com.museo.modelo.servicios.EquiposService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/equipos")
@CrossOrigin(origins = {"*"})
public class EquiposController {

    @Autowired
    private EquiposService equiposService;

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
    public void eliminarEquipo(@PathVariable Long id) {
        equiposService.eliminarEquipo(id);
    }
}