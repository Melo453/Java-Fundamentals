package dev.fabri.rpg.combate.enemigos;

import dev.fabri.rpg.Interfaces.ICritico;
import dev.fabri.rpg.combate.CombateEntity;

public class Troll extends Enemigo implements ICritico {

  public Troll() {}

  public Troll(String nombrePersonaje, double nivel, int experiencia) {
    super(nombrePersonaje, nivel, experiencia);
    this.vida = 220;
    this.mana = 40;
    this.velocidadAtaque = 0.6;
    this.minDamage = 25;
    this.maxDamage = 28;
  }

  @Override
  public void atacar(CombateEntity objetivo) {
    if (golpeExitoso()) {
      int danioBase = calcularDanioBase();
      if (Math.random() <= calcularProbabilidadAtaqueCritico()) {
        double danioCritico = aplicarAtaqueCritico(danioBase);
        objetivo.recibirDanio((int) danioCritico);
        System.out.println(
            "¡Golpe Crítico! "
                + nombrePersonaje
                + " le quito "
                + danioCritico
                + " de vida a "
                + objetivo.nombrePersonaje());
        System.out.println(
            "Al personaje "
                + objetivo.nombrePersonaje()
                + " le queda "
                + objetivo.vida()
                + " de vida");
      } else {
        objetivo.recibirDanio(danioBase);
        System.out.println(
            " "
                + nombrePersonaje
                + " le quito "
                + danioBase
                + " de vida a "
                + objetivo.nombrePersonaje());
        System.out.println(
            "Al personaje "
                + objetivo.nombrePersonaje()
                + " le queda "
                + objetivo.vida()
                + " de vida");
      }
    } else System.out.println(nombrePersonaje + " ha fallado el ataque.");
  }

  @Override
  protected void habilidadEspecial() {}

  @Override
  public double aplicarAtaqueCritico(int danioBase) {
    return danioBase * 1.6;
  }

  @Override
  public double calcularProbabilidadAtaqueCritico() {
    return 0.1;
  }
}
