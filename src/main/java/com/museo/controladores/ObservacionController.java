package com.museo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.museo.modelo.entidades.Observacion;
import com.museo.modelo.entidades.ObservacionBienPatrimonial;
import com.museo.modelo.entidades.ObservacionVitrina;
import com.museo.modelo.servicios.ObservacionBienPatrimonialService;
import com.museo.modelo.servicios.ObservacionService;
import com.museo.modelo.servicios.ObservacionVitrinaService;
import com.museo.util.CrearObservacionRequest;
import com.museo.util.ObservacionDetalleDTO;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/observaciones")
@CrossOrigin(origins = { "*" })
public class ObservacionController {
	
	@Autowired
    private ObservacionService observacionService;

	@Autowired
	private ObservacionVitrinaService observacionvitrinaService;
	
	@Autowired
	private ObservacionBienPatrimonialService observacionBienPatrimonialService;

	@PostMapping
	public ResponseEntity<Observacion> guardarObservacion(@RequestBody CrearObservacionRequest request) {
	    
		Observacion ob = new Observacion();
		
	    Observacion observacion = observacionService.guardarObservacion(ob);
	    
	    ObservacionVitrina  observacionVitrina =  request.getObservacionVitrina();
	    observacionVitrina.setObservacion(observacion);
	    
	    observacionvitrinaService.guardarObservacionVitrina(observacionVitrina);

	    for (ObservacionBienPatrimonial observacionesBP : request.getListaObservacionBienPatrimonial()) {
	    	observacionesBP.setObservacion(observacion);
	        observacionBienPatrimonialService.guardarObservacionBienPatrimonial(observacionesBP);	        
	    }

	    return new ResponseEntity<>(observacion, HttpStatus.CREATED);
	}

    
    @GetMapping("/{id}")
    public ResponseEntity<ObservacionDetalleDTO> obtenerObservacionPorId(@PathVariable Long id) {
    	ObservacionDetalleDTO observacion = observacionService.obtenerObservacionPorId(id);
        if (observacion != null) {
            return new ResponseEntity<>(observacion, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarObservacion(@PathVariable Long id) {
        observacionService.eliminarObservacion(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
    @GetMapping
    public ResponseEntity<List<Object[]>> getObservationReport() {
        List<Object[]> report = observacionService.getObservationReport();
        return ResponseEntity.ok(report);
    }
}
