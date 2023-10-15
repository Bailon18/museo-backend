package com.museo.controladores;

import com.museo.modelo.entidades.Categoria;
import com.museo.modelo.servicios.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")
@CrossOrigin(origins = { "*" })
public class CategoriaController {
	
	@Autowired
    private CategoriaService categoriaService;

    @GetMapping("/")
    public List<Categoria> listarCategoriasDescendente() {
        return categoriaService.listarCategoriasDescendente();
    }
}
