package com.dicsys.LosSimpsons.controller;

import com.dicsys.LosSimpsons.model.Personaje;
import com.dicsys.LosSimpsons.repository.IPersonajeRepository;
import com.dicsys.LosSimpsons.service.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonajeController {

    @Autowired
    PersonajeService pjService;

    @PostMapping("/personajes")
    public Personaje crearPersonaje(@RequestBody Personaje pj) {
        // asdasd
        return pjService.crearPersonaje(pj);
    }

    @GetMapping("/personajes")
    public List<Personaje> obtenerPersonajes() {
        return pjService.obtenerPersonajes();
    }

    @DeleteMapping("/personajes/{id}")
    public void borrarPersonaje(@PathVariable(value = "id") Integer id) {
        pjService.borrarPersonaje(id);
    }
}
