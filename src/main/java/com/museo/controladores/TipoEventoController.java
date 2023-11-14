package com.museo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.museo.modelo.entidades.TipoEvento;
import com.museo.modelo.servicios.TipoEventoService;

import java.util.List;

@RestController
@RequestMapping("/api/tipo-evento")
@CrossOrigin(origins = { "*" })
public class TipoEventoController {

	@Autowired
    private TipoEventoService tipoEventoService;

    @GetMapping
    public List<TipoEvento> listarTiposEventos() {
        return tipoEventoService.listarTiposEventos();
    }
}
