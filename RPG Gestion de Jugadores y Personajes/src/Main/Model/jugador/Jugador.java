package Main.Model.jugador;

import Main.Model.Personaje.Personaje;

import java.util.Date;
import java.util.List;

public class Jugador {
    private String nombre;
    private String apellido;
    private String edad;
    private String email;
    private Date fechaNacimiento;
    private Perfil perfil;
    private List<Personaje> personaje;

    public Jugador() {
    }

    public Jugador(String nombre, String apellido, String edad, String email, Date fechaNacimiento, Perfil perfil, List<Personaje> personaje) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.perfil = perfil;
        this.personaje = personaje;
    }
}
