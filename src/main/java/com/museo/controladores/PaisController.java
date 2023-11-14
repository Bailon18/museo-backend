package com.museo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.museo.modelo.entidades.Departamento;
import com.museo.modelo.entidades.Pais;
import com.museo.modelo.servicios.DepartamentoService;
import com.museo.modelo.servicios.PaisService;

import java.util.List;

@RestController
@RequestMapping("/api/paises")
@CrossOrigin(origins = { "*" })
public class PaisController {

	@Autowired
    private PaisService paisService;
	
	@Autowired
	private DepartamentoService departamentoService;

    @GetMapping("/listar")
    public List<Pais> listarPaises() {
        return paisService.listarPaises();
    }
    
    @GetMapping("/por-pais/{paisId}")
    public List<Departamento> obtenerDepartamentosPorPais(@PathVariable Long paisId) {
        return departamentoService.obtenerDepartamentosPorPais(paisId);
    }
}
