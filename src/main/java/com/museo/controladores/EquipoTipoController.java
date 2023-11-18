package com.museo.controladores;

import com.museo.modelo.entidades.EquipoTipo;
import com.museo.modelo.entidades.Equipos;
import com.museo.modelo.servicios.EquipoTipoService;
import com.museo.modelo.servicios.EquiposService;

import io.swagger.v3.oas.annotations.Operation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
    


    @Operation(summary = "Tiene que enviar 3 objectos de EquipoTipo || Funciona para AGREGAR(id = 0) O ACTUALIZAR(  id = ?)")
    @PostMapping("/")
    public List<EquipoTipo> crearOActualizarEquiposTipos(@RequestBody List<EquipoTipo> equiposTipos) {
        List<EquipoTipo> resultados = new ArrayList<>();

        Equipos equipos = null;

        for (EquipoTipo equipoTipo : equiposTipos) {
            Long id = equipoTipo.getId();

            if (id > 0) {

                EquipoTipo equipoTipoActualizado = equipoTipoService.actualizarEquipoTipo(id, equipoTipo);
                resultados.add(equipoTipoActualizado);
            } else {
  
                if (equipos == null) {
                    equipos = new Equipos();
                    Equipos equipogrupo = equipoService.crearEquipo(equipos);
                }
                
                equipoTipo.setEquipos(equipos); 
                EquipoTipo nuevoEquipoTipo = equipoTipoService.crearEquipoTipo(equipoTipo);
                resultados.add(nuevoEquipoTipo);
            }
        }
        
        return resultados;
    }

    
    
    @Operation(summary = "Si quieres eliminar apunta  a este enpoint: http://museo-backend-production.up.railway.app/api/equipos/idDELCONTENEDOR ")
    @DeleteMapping("/{id}")
    public void eliminarEquipoTipo(@PathVariable Long id) {
        equipoTipoService.eliminarEquipoTipo(id);
    }
}
