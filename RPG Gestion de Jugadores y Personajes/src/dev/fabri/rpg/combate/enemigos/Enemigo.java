package dev.fabri.rpg.combate.enemigos;

import dev.fabri.rpg.combate.CombateEntity;

public abstract class Enemigo extends CombateEntity {

  public Enemigo() {}

  public Enemigo(String nombrePersonaje, double nivel, int experiencia) {
    super(nombrePersonaje, nivel, experiencia);
  }

  protected void morir() {}
}
