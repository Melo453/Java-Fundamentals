package dev.fabri.rpg.Model.logro;

import java.util.Date;

public class Logro {
  private int id;
  private String nombre;
  private String descripcion;
  private Date fechaObtencion;

  public Logro() {}

  public Logro(int id, String nombre, String descripcion, Date fechaObtencion) {
    this.id = id;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.fechaObtencion = fechaObtencion;
  }

  public int id() {
    return id;
  }

  public String nombre() {
    return nombre;
  }

  public String descripcion() {
    return descripcion;
  }

  public Date fechaObtencion() {
    return fechaObtencion;
  }
}
