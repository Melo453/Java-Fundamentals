package dev.fabri.rpg.Model.inventario;

import dev.fabri.rpg.Interfaces.IConsumible;

public abstract class Pocion implements IConsumible {

  protected String nombre;
  protected String descripcion;

  public Pocion() {}

  public Pocion(String nombre, String descripcion) {
    this.nombre = nombre;
    this.descripcion = descripcion;
  }

  public String nombre() {
    return nombre;
  }

  public String descripcion() {
    return descripcion;
  }
}
