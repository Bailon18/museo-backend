package com.museo.controladores;

import com.museo.modelo.entidades.EquipoTipo;
import com.museo.modelo.entidades.Equipos;
import com.museo.modelo.servicios.EquipoTipoService;
import com.museo.modelo.servicios.EquiposService;

import io.swagger.v3.oas.annotations.Operation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/equipostipo")
@CrossOrigin(origins = { "*" })
public class EquipoTipoController {

    @Autowired
    private EquipoTipoService equipoTipoService;
    
    @Autowired
    private EquiposService equipoService;
    

    @GetMapping("/")
    public List<EquipoTipo> listarEquiposTipo() {
        return equipoTipoService.listarEquiposTipo();
    }

    @GetMapping("/{id}")
    public EquipoTipo obtenerEquipoTipoPorId(@PathVariable Long id) {
        return equipoTipoService.obtenerEquipoTipoPorId(id);
    }
    

 
    @Operation(summary = "tiene que enviar 3 objectos de EquipoTipo")
    @PostMapping("/")
    public List<EquipoTipo> crearEquiposTipos(
        @RequestBody List<EquipoTipo> equiposTipos // pero no se supone 
        ) {
        
        Equipos equipos = new Equipos(); // Crea un nuevo objeto Equipos
        Equipos equipogrupo = equipoService.crearEquipo(equipos); // Crea el objeto Equipos
        

        for (EquipoTipo equipoTipo : equiposTipos) {
            equipoTipo.setEquipos(equipogrupo); // Asocia el equipo a la entidad Equipos
            equipoTipoService.crearEquipoTipo(equipoTipo); // Crea cada objeto EquipoTipo
        }
        
        return equiposTipos;
    }


    @PutMapping("/{id}")
    public EquipoTipo actualizarEquipoTipo(@PathVariable Long id, @RequestBody EquipoTipo equipoTipo) {
        return equipoTipoService.actualizarEquipoTipo(id, equipoTipo);
    }

    @DeleteMapping("/{id}")
    public void eliminarEquipoTipo(@PathVariable Long id) {
        equipoTipoService.eliminarEquipoTipo(id);
    }
}
