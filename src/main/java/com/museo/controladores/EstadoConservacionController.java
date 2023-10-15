package com.museo.controladores;

import com.museo.modelo.entidades.EstadoConservacion;
import com.museo.modelo.servicios.EstadoConservacionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/estadosconservacion")
@CrossOrigin(origins = { "*" })
public class EstadoConservacionController {

    @Autowired
    private EstadoConservacionService estadoConservacionService;

    @GetMapping("/")
    public List<EstadoConservacion> listarEstadosConservacionDescendente() {
        return estadoConservacionService.listarEstadosConservacionDescendente();
    }
}
