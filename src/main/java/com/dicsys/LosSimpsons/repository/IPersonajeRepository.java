package com.dicsys.LosSimpsons.repository;

import com.dicsys.LosSimpsons.model.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonajeRepository extends JpaRepository<Personaje, Integer> {
}
