package com.dicsys.LosSimpsons.controller;

import com.dicsys.LosSimpsons.model.Personaje;
import com.dicsys.LosSimpsons.service.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class PersonajeController {

    @Autowired
    PersonajeService pjService;

    // Crear / Actualizar - Personajes
    @PostMapping("/personajes")
    public Personaje crearPersonaje(@RequestBody Personaje pj) {
        return pjService.crearPersonaje(pj);
    }

    // Listar todos - Personajes
    @GetMapping("/personajes")
    public List<Personaje> obtenerPersonajes() {
        return pjService.obtenerPersonajes();
    }

    // Listar 1 - Personaje
    @GetMapping("/personajes/{id}")
    public ResponseEntity<Object> obtenerXID(@PathVariable(value = "id") Integer id) {
        Optional<Personaje> resultado = pjService.obtenerXID(id);

        if (resultado.isPresent()) {
            return new ResponseEntity<Object>(resultado, HttpStatus.OK);
        }

        return new ResponseEntity<Object>("Personaje no encontrado", HttpStatus.NOT_FOUND);
    }


    // Borrar - Personajes
    @DeleteMapping("/personajes/{id}")
    public boolean borrarPersonaje(@PathVariable(value = "id") Integer id) {
        return pjService.borrarPersonaje(id);
    }
}
