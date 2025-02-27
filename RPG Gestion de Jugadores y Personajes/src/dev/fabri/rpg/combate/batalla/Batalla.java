package dev.fabri.rpg.combate.batalla;

import dev.fabri.rpg.Interfaces.IConsumible;
import dev.fabri.rpg.Model.inventario.PocionDeCuracion;
import dev.fabri.rpg.Model.inventario.PocionDeDanio;
import dev.fabri.rpg.combate.CombateEntity;
import dev.fabri.rpg.combate.Personajes.Personaje;

/**
 * Clase que simula una batalla entre dos entidades de combate. La batalla se ejecuta de forma
 * automática basándose en cooldowns, permitiendo que el personaje decida acciones especiales (como
 * consumir pociones) de forma aleatoria mientras el enemigo ataca automáticamente.
 *
 * <p>Esta clase contiene métodos estáticos para iniciar el combate y para ejecutar acciones
 * específicas del personaje, como consumir pociones de curación o lanzar pociones de daño.
 *
 * @author
 * @version 1.0
 */
public class Batalla {

  /**
   * Inicia el combate entre dos entidades. El combate se simula en un bucle, donde se alternan las
   * acciones de ataque y el uso de ítems basados en cooldowns.
   *
   * @param personaje La entidad que representa al personaje (debe ser instancia de Personaje para
   *     usar ítems).
   * @param enemigo La entidad que representa al enemigo.
   */
  public static void iniciarCombate(CombateEntity personaje, CombateEntity enemigo) {
    try {
      double cooldownPersonaje = 0;
      double cooldownEnemigo = 0;

      double baseCooldownPersonaje = 1.0 / personaje.velocidadAtaque();
      double baseCooldownEnemigo = 1.0 / enemigo.velocidadAtaque();

      double tiempo = 0.1;
      while (personaje.vida() > 0.0 && enemigo.vida() > 0.0) {
        if (cooldownPersonaje <= 0.0 && cooldownEnemigo <= 0.0) {
          personaje.atacar(enemigo);
          enemigo.atacar(personaje);

          cooldownPersonaje = baseCooldownPersonaje;
          cooldownEnemigo = baseCooldownEnemigo;
        } else if (cooldownPersonaje <= 0.0) {
          ejecutarAccionPersonaje(personaje, enemigo);
          cooldownPersonaje = baseCooldownPersonaje;
        } else if (cooldownEnemigo <= 0.0) {
          enemigo.atacar(personaje);

          cooldownEnemigo = baseCooldownEnemigo;
        }

        cooldownEnemigo -= tiempo;
        cooldownPersonaje -= tiempo;

        if (cooldownEnemigo < 0.0) cooldownEnemigo = 0.0;
        if (cooldownPersonaje < 0.0) cooldownPersonaje = 0.0;
      }

      if (personaje.vida() <= 0 && enemigo.vida() <= 0) System.out.println("Empate");
      else if (personaje.vida() <= 0.0)
        System.out.println(enemigo.nombrePersonaje() + " gana el combate");
      else System.out.println(personaje.nombrePersonaje() + " gana el combate");

      Thread.sleep(100);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      System.out.println(e.getMessage());
    }
  }

  /**
   * Ejecuta la acción del personaje cuando su cooldown llega a cero. Se decide de forma aleatoria
   * si el personaje usa una poción de daño, una poción de curación, o ataca normalmente.
   *
   * @param personaje La entidad del personaje (se asume que es instancia de Personaje).
   * @param enemigo La entidad del enemigo, a quien se puede aplicar el ataque o efecto.
   */
  private static void ejecutarAccionPersonaje(CombateEntity personaje, CombateEntity enemigo) {
    if (personaje instanceof Personaje pj) {
      double accion = Math.random();
      if (accion <= 0.2) {
        lanzarPocionDanio(pj, enemigo);
      } else if (accion <= 0.4) {
        consumirPocionCuracion(pj);
      } else {
        personaje.atacar(enemigo);
      }
    }
  }

  /**
   * Intenta consumir una poción de curación del inventario del personaje.
   * Si se encuentra, la consume y se elimina del inventario.
   *
   * @param pj El personaje que consumirá la poción.
   * @return true si se consumió una poción, false si no había.
   */
  private static boolean consumirPocionCuracion(Personaje pj) {
    IConsumible pocionCuracion = pj.inventario().obtenerTipoConsumible(PocionDeCuracion.class);
    if (pocionCuracion != null) {
      pocionCuracion.consumir(pj);
      pj.inventario().removeItem(pocionCuracion);
      return true;
    }
    System.out.println(pj.nombrePersonaje() + " se quedo sin pociones.");
    return false;
  }

  /**
   * Intenta lanzar una poción de daño desde el inventario del personaje hacia el enemigo. Si se
   * encuentra, se lanza y se elimina del inventario.
   *
   * @param pj El personaje que lanzará la poción.
   * @param enemigo El objetivo sobre el que se lanzará la poción.
   * @return true si se lanzó la poción, false si no había.
   */
  private static boolean lanzarPocionDanio(Personaje pj, CombateEntity enemigo) {
    IConsumible pocionDanio = pj.inventario().obtenerTipoConsumible(PocionDeDanio.class);
    if (pocionDanio != null) {
      pocionDanio.lanzar(enemigo);
      pj.inventario().removeItem(pocionDanio);
      return true;
    }
    System.out.println(pj.nombrePersonaje() + " se quedo sin pociones.");
    return false;
  }
}
