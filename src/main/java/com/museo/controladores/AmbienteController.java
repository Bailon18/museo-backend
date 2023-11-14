package com.museo.controladores;

import com.museo.modelo.entidades.Ambiente;
import com.museo.modelo.servicios.AmbienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/ambientes")
@CrossOrigin(origins = { "*" })
public class AmbienteController {

	@Autowired
    private AmbienteService ambienteService;

    @GetMapping
    public ResponseEntity<List<Ambiente>> obtenerAmbientes() {
        List<Ambiente> ambientes = ambienteService.listarAmbientes();
        return new ResponseEntity<>(ambientes, HttpStatus.OK);
    }
}
