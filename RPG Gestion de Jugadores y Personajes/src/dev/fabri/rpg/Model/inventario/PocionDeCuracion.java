package dev.fabri.rpg.Model.inventario;

import dev.fabri.rpg.combate.CombateEntity;

public class PocionDeCuracion extends Pocion {
  private final int puntosCuracion = 100;

  public PocionDeCuracion() {
    super("Pocion de Curacion", "Restaura 100 puntos de vida al ser consumida.");
  }

  @Override
  public void consumir(CombateEntity objetivo) {
    objetivo.recuperarVida(puntosCuracion);
    System.out.println(
        objetivo.nombrePersonaje()
            + " se lanzo una pocion de curacion +"
            + puntosCuracion
            + " de vida, ahora tiene "
            + objetivo.vida()
            + " de vida");
  }

  @Override
  public void lanzar(CombateEntity objetivo) {}
}
