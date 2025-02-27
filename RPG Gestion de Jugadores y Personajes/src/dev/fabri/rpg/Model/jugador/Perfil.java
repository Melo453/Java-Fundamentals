package dev.Model.jugador;

import dev.Model.logro.Logro;
import java.util.Date;
import java.util.Set;

public class Perfil {
  private int idPerfil;
  private Date fechaCreacion;
  private Set<Logro> logros;

  public Perfil() {}

  public Perfil(int idPerfil, Date fechaCreacion, Set<Logro> logros) {
    this.idPerfil = idPerfil;
    this.fechaCreacion = fechaCreacion;
    this.logros = logros;
  }

  public int idPerfil() {
    return idPerfil;
  }

  public Perfil setIdPerfil(int idPerfil) {
    this.idPerfil = idPerfil;
    return this;
  }

  public Date fechaCreacion() {
    return fechaCreacion;
  }

  public Perfil setFechaCreacion(Date fechaCreacion) {
    this.fechaCreacion = fechaCreacion;
    return this;
  }

  public Set<Logro> logros() {
    return logros;
  }

  public Perfil setLogros(Set<Logro> logros) {
    this.logros = logros;
    return this;
  }
}
