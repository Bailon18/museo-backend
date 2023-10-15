package com.museo.modelo.repositorios;

import com.museo.modelo.entidades.NivelPiso;
import com.museo.modelo.servicios.NivelPisoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/nivelespiso")
@CrossOrigin(origins = { "*" })
public class NivelPisoController {

    @Autowired
    private NivelPisoService nivelPisoService;

    @GetMapping("/")
    public List<NivelPiso> listarNivelesPisoDescendente() {
        return nivelPisoService.listarNivelesPisoDescendente();
    }
}
