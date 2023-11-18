package com.museo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.museo.modelo.entidades.Vitrinas;
import com.museo.modelo.servicios.VitrinasService;
import com.museo.util.VitrinaDTO;

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
    public ResponseEntity<String> eliminarVitrina(@PathVariable long id) {
        try {
            boolean eliminado = vitrinasService.eliminarVitrina(id);
            if (eliminado) {
                return new ResponseEntity<>("Eliminado exitosamente", HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Recurso no encontrado", HttpStatus.NOT_FOUND);
            }
        } catch (DataIntegrityViolationException ex) {
            return new ResponseEntity<>("Error: No se puede eliminar debido a una restricción de clave externa", HttpStatus.CONFLICT);
        } catch (Exception ex) {
            return new ResponseEntity<>("Error al eliminar el recurso", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    
    @GetMapping("/codigoEquipoTipo/{codigoVitrina}")
    public ResponseEntity<VitrinaDTO> obtenerCodigoEquipoTipo(@PathVariable String codigoVitrina) {
    	VitrinaDTO resultado = vitrinasService.obtenerDatosPorCodigoVitrina(codigoVitrina);
        return new ResponseEntity<>(resultado, HttpStatus.OK);
    }
}
