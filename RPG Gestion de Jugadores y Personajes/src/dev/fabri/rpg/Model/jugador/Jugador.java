package dev.fabri.rpg.Model.jugador;

import dev.fabri.rpg.combate.Personajes.Personaje;

import java.util.Date;
import java.util.List;

public class Jugador {
    private String nombre;
    private String apellido;
    private String edad;
    private String email;
    private Date fechaNacimiento;
    private dev.Model.jugador.Perfil perfil;
    private List<Personaje> Personaje;

    public Jugador() {
    }

    public Jugador(String nombre, String apellido, String edad, String email, Date fechaNacimiento, dev.Model.jugador.Perfil perfil, List<Personaje> Personaje) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.perfil = perfil;
        this.Personaje = Personaje;
    }
}
