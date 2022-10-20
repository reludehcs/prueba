package com.dicsys.LosSimpsons.service;

import com.dicsys.LosSimpsons.model.Personaje;
import com.dicsys.LosSimpsons.repository.IPersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonajeService {
    @Autowired
    IPersonajeRepository repo;

    public Personaje crearPersonaje(Personaje pj) {
        return repo.save(pj);
    }

    public List<Personaje> obtenerPersonajes(){
        return repo.findAll();
    }

    public void borrarPersonaje(Integer id) {
        repo.deleteById(id);
    }
}
