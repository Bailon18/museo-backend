package com.museo.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioControlador {
	
	@GetMapping("/Saludar")
	public String prueba() {
		return "Hola";
	}
}
