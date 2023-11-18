package com.museo.controladores;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.museo.modelo.entidades.Evento;
import com.museo.modelo.servicios.EventoService;
import com.museo.util.DetallesEventoBienesPatrimonialesDTO;

@RestController
@RequestMapping("/eventos")
@CrossOrigin(origins = { "*" })
public class EventoController {

    @Autowired
    private EventoService eventoService;

    @PostMapping
    public ResponseEntity<Evento> crearEvento(@RequestBody Evento evento) {
        Evento nuevoEvento = eventoService.crearEvento(evento);
        return new ResponseEntity<>(nuevoEvento, HttpStatus.CREATED);
    }

    
    @GetMapping("/prioridad")
    public ResponseEntity<List<Object>> obtenerEventosPorPrioridad() {
        List<Object> eventos = eventoService.obtenerEventosPorPrioridad();
        return new ResponseEntity<>(eventos, HttpStatus.OK);
    }
    
    
    @PutMapping
    public ResponseEntity<Evento> actualizarEvento(@RequestBody Evento evento) {
        Evento eventoActualizado = eventoService.actualizarEvento(evento);
        if (eventoActualizado != null) {
            return new ResponseEntity<>(eventoActualizado, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarEvento(@PathVariable("id") Long eventoId) {
        eventoService.eliminarEvento(eventoId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/detalles/{bienPatrimonialId}")
    public ResponseEntity<DetallesEventoBienesPatrimonialesDTO> obtenerDetallesPorIdBienesPatrimoniales(@PathVariable Long bienPatrimonialId) {
        DetallesEventoBienesPatrimonialesDTO detalles = eventoService.obtenerDetallesPorIdBienesPatrimoniales(bienPatrimonialId);
        if (detalles != null) {
            return new ResponseEntity<>(detalles, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Evento> buscarEventoPorId(@PathVariable Long id) {
        Optional<Evento> eventoOptional = eventoService.buscarPorId(id);
        return eventoOptional.map(evento -> new ResponseEntity<>(evento, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
