package com.museo.controladores;

import com.museo.modelo.entidades.Cultura;
import com.museo.modelo.servicios.CulturaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/culturas")
@CrossOrigin(origins = { "*" })
public class CulturaController {

    @Autowired
    private CulturaService culturaService;

    @GetMapping("/")
    public List<Cultura> listarCulturasDescendente() {
        return culturaService.listarCulturasDescendente();
    }
}
