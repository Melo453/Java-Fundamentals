package Main.Model.gremio;

import Main.Model.Personaje.Personaje;

import java.util.Set;

public class Gremio {
    private String nombreGremio;
    private String descripcion;
    private Set<Personaje> personajes;

    public Gremio() {
    }

    public Gremio(String nombreGremio, String descripcion, Set<Personaje> personajes) {
        this.nombreGremio = nombreGremio;
        this.descripcion = descripcion;
        this.personajes = personajes;
    }

    public void agregarMiembro(Personaje p){

    }
    public void removerMiembro(Personaje p){

    }

    public void listarMiembros(){

    }
    public void buscarMiembro(String nombre){

    }

    public String nombreGremio() {
        return nombreGremio;
    }

    public Gremio setNombreGremio(String nombreGremio) {
        this.nombreGremio = nombreGremio;
        return this;
    }

    public String descripcion() {
        return descripcion;
    }

    public Gremio setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public Set<Personaje> personajes() {
        return personajes;
    }

    public Gremio setPersonajes(Set<Personaje> personajes) {
        this.personajes = personajes;
        return this;
    }
}
