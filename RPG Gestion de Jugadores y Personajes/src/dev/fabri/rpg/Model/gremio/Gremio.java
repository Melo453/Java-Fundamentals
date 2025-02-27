package dev.Model.gremio;

import dev.fabri.rpg.combate.Personajes.Personaje;
import java.util.Set;

public class Gremio {
  private String nombreGremio;
  private String descripcion;
  private Set<Personaje> Personajes;

  public Gremio() {}

  public Gremio(String nombreGremio, String descripcion, Set<Personaje> Personajes) {
    this.nombreGremio = nombreGremio;
    this.descripcion = descripcion;
    this.Personajes = Personajes;
  }

  public void agregarMiembro(Personaje p) {}

  public void removerMiembro(Personaje p) {}

  public void listarMiembros() {}

  public void buscarMiembro(String nombre) {}

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
    return Personajes;
  }

  public Gremio setPersonajes(Set<Personaje> Personajes) {
    this.Personajes = Personajes;
    return this;
  }
}
