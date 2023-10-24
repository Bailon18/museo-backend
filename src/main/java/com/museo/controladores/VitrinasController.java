package com.museo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.museo.modelo.entidades.Vitrinas;
import com.museo.modelo.servicios.VitrinasService;

import java.util.List;

@RestController
@RequestMapping("/vitrinas")
@CrossOrigin(origins = { "*" })
public class VitrinasController {

	@Autowired
    private  VitrinasService vitrinasService;


    @GetMapping("/")
    public List<Vitrinas> obtenerTodasLasVitrinas() {
        return vitrinasService.obtenerTodasLasVitrinas();
    }

    @GetMapping("/{id}")
    public Vitrinas obtenerVitrinaPorId(@PathVariable Long id) {
        return vitrinasService.obtenerVitrinaPorId(id);
    }

    @PostMapping("/")
    public Vitrinas guardarVitrina(@RequestBody Vitrinas vitrina) {
        return vitrinasService.guardarVitrina(vitrina);
    }

    @DeleteMapping("/{id}")
    public void eliminarVitrina(@PathVariable Long id) {
        vitrinasService.eliminarVitrina(id);
    }
}