package dev.Model.mision;

import dev.fabri.rpg.combate.Personajes.Personaje;

import java.util.Set;

public class Mision {
    private int idMision;
    private String nombreMision;
    private String descripcion;
    private int estado;
    private Set<Personaje> participantes;

    public Mision() {
    }

    public Mision(int idMision, String nombreMision, String descripcion, int estado, Set<Personaje> participantes) {
        this.idMision = idMision;
        this.nombreMision = nombreMision;
        this.descripcion = descripcion;
        this.estado = estado;
        this.participantes = participantes;
    }

    public void iniciarMision(){

    }

    public void finalizarMision(){

    }
    public void removerParticipante(){

    }

    public int idMision() {
        return idMision;
    }

    public Mision setIdMision(int idMision) {
        this.idMision = idMision;
        return this;
    }

    public String nombreMision() {
        return nombreMision;
    }

    public Mision setNombreMision(String nombreMision) {
        this.nombreMision = nombreMision;
        return this;
    }

    public String descripcion() {
        return descripcion;
    }

    public Mision setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public int estado() {
        return estado;
    }

    public Mision setEstado(int estado) {
        this.estado = estado;
        return this;
    }

    public Set<Personaje> participantes() {
        return participantes;
    }

    public Mision setParticipantes(Set<Personaje> participantes) {
        this.participantes = participantes;
        return this;
    }
}
