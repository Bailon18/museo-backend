package com.museo.controladores;

import com.museo.modelo.entidades.Ubicacion;
import com.museo.modelo.servicios.UbicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/ubicaciones")
@CrossOrigin(origins = { "*" })
public class UbicacionController {

    @Autowired
    private UbicacionService ubicacionService;

    @GetMapping("/")
    public List<Ubicacion> listarUbicacionesDescendente() {
        return ubicacionService.listarUbicacionesDescendente();
    }
}
