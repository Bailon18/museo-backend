package com.museo.controladores;

import com.museo.modelo.entidades.Coleccion;
import com.museo.modelo.servicios.ColeccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/colecciones")
@CrossOrigin(origins = { "*" })
public class ColeccionController {

    @Autowired
    private ColeccionService coleccionService;

    @GetMapping("/")
    public List<Coleccion> listarColeccionesDescendente() {
        return coleccionService.listarColeccionesDescendente();
    }
}
