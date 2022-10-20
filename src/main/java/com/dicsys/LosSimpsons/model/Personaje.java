package com.dicsys.LosSimpsons.model;

import javax.persistence.*;

@Entity
@Table(name = "personajes")
public class Personaje {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombre", length = 50)
    private String nombre;

    // Constructores
//    public Personaje() {
//    }


    // Metodos

    // Getters & Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
