package com.museo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.museo.modelo.entidades.BienesPatrimoniales;
import com.museo.modelo.servicios.BienesPatrimonialesService;

import java.util.List;

@RestController
@RequestMapping("/api/bienes-patrimoniales")
public class BienesPatrimonialesController {
	
	@Autowired
    private BienesPatrimonialesService bienesPatrimonialesService;

    
    @GetMapping
    public ResponseEntity<List<BienesPatrimoniales>> obtenerTodosLosBienesPatrimoniales() {
        List<BienesPatrimoniales> bienes = bienesPatrimonialesService.obtenerTodosLosBienesPatrimoniales();
        if (bienes.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(bienes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BienesPatrimoniales> obtenerPorId(@PathVariable long id) {
        BienesPatrimoniales bienes = bienesPatrimonialesService.obtenerPorId(id);
        if (bienes == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(bienes);
    }

    @PostMapping
    public ResponseEntity<BienesPatrimoniales> crearBienesPatrimoniales(@RequestBody BienesPatrimoniales bienesPatrimoniales) {
        if (bienesPatrimoniales == null) {
            return ResponseEntity.badRequest().build();
        }
        BienesPatrimoniales nuevoBienes = bienesPatrimonialesService.crearBienesPatrimoniales(bienesPatrimoniales);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoBienes);
    }
    
    @GetMapping("/filtrar")
    public ResponseEntity<List<BienesPatrimoniales>> buscarBienesPorCondiciones(
            @RequestParam Long ubicacion,
            @RequestParam(required = false) Long ambiente,
            @RequestParam(required = false) Long nivelpiso,
            @RequestParam Long categoria
    ) {
        List<BienesPatrimoniales> bienes = bienesPatrimonialesService.buscarBienesPorCondiciones(ubicacion, ambiente, nivelpiso, categoria);
        if (bienes.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(bienes);
    }

    
    @DeleteMapping("/{id}")
    public void eliminarBienesPatrimoniales(@PathVariable long id) {
        bienesPatrimonialesService.eliminarBienesPatrimoniales(id);
    }

    @PutMapping("/{id}")
    public BienesPatrimoniales actualizarBienesPatrimoniales(@PathVariable long id, @RequestBody BienesPatrimoniales bienesPatrimoniales) {
        return bienesPatrimonialesService.actualizarBienesPatrimoniales(id, bienesPatrimoniales);
    }
    
}