package com.dicsys.LosSimpsons.service;

import com.dicsys.LosSimpsons.model.Personaje;
import com.dicsys.LosSimpsons.repository.IPersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional<Personaje> obtenerXID(Integer id) {
        return repo.findById(id);
    }

    public boolean borrarPersonaje(Integer id) {
        try {
            repo.deleteById(id);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
