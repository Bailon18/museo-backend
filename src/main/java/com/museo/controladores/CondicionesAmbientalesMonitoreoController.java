package com.museo.controladores;

import com.museo.modelo.entidades.CondicionesAmbientalesMonitoreo;
import com.museo.modelo.servicios.CondicionesAmbientalesMonitoreoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/condiciones-ambientales-monitoreo")
@CrossOrigin(origins = { "*" })
public class CondicionesAmbientalesMonitoreoController {

	@Autowired
    private  CondicionesAmbientalesMonitoreoService condicionesAmbientalesMonitoreoService;

    @PostMapping
    public ResponseEntity<CondicionesAmbientalesMonitoreo> guardarCondicionesAmbientalesMonitoreo(@RequestBody CondicionesAmbientalesMonitoreo condicionesAmbientalesMonitoreo) {
        CondicionesAmbientalesMonitoreo nuevoRegistro = condicionesAmbientalesMonitoreoService.guardarCondicionesAmbientalesMonitoreo(condicionesAmbientalesMonitoreo);
        return new ResponseEntity<>(nuevoRegistro, HttpStatus.CREATED);
    }

	@GetMapping
	public ResponseEntity<List<CondicionesAmbientalesMonitoreo>> obtenerTodosCondicionesAmbientalesMonitoreo() {
		List<CondicionesAmbientalesMonitoreo> condicionesAmbientalesMonitoreoList = condicionesAmbientalesMonitoreoService
				.obtenerTodosCondicionesAmbientalesMonitoreo();
		return new ResponseEntity<>(condicionesAmbientalesMonitoreoList, HttpStatus.OK);
	}

    @GetMapping("/{id}")
    public ResponseEntity<CondicionesAmbientalesMonitoreo> obtenerPorId(@PathVariable Long id) {
        Optional<CondicionesAmbientalesMonitoreo> condicionesAmbientalesMonitoreo = condicionesAmbientalesMonitoreoService.obtenerPorId(id);
        return condicionesAmbientalesMonitoreo.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarCondicionesAmbientalesMonitoreo(@PathVariable Long id) {
        condicionesAmbientalesMonitoreoService.eliminarCondicionesAmbientalesMonitoreo(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
