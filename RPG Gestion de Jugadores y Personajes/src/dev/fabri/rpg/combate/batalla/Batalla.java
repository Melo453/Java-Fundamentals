package dev.fabri.rpg.combate.batalla;

import dev.fabri.rpg.Interfaces.IConsumible;
import dev.fabri.rpg.Model.inventario.PocionDeCuracion;
import dev.fabri.rpg.Model.inventario.PocionDeDanio;
import dev.fabri.rpg.combate.CombateEntity;
import dev.fabri.rpg.combate.Personajes.Personaje;

public class Batalla {

    public static void iniciarCombate(CombateEntity personaje, CombateEntity enemigo){
        try {
            double cooldownPersonaje = 0;
            double cooldownEnemigo = 0;

            double baseCooldownPersonaje = 1.0 / personaje.velocidadAtaque();
            double baseCooldownEnemigo = 1.0 / enemigo.velocidadAtaque();;

            double tiempo = 0.1;
            while (personaje.vida() > 0.0 && enemigo.vida() > 0.0){
                if (cooldownPersonaje <= 0.0 && cooldownEnemigo <= 0.0){
                    personaje.atacar(enemigo);
                    enemigo.atacar(personaje);

                    cooldownPersonaje = baseCooldownPersonaje;
                    cooldownEnemigo = baseCooldownEnemigo;
                } else if (cooldownPersonaje <= 0.0){
                    if (Math.random() <= 0.4){
                        if (personaje instanceof Personaje){
                            Personaje pj = (Personaje) personaje;
                            if (!pj.inventario().items().isEmpty()){
                                IConsumible pocionCuracion = pj.inventario().obtenerTipoConsumible(PocionDeCuracion.class);
                                pocionCuracion.consumir(pj);
                                pj.inventario().removeItem(pocionCuracion);
                            }
                        }
                    } else if (Math.random() <= 0.4){
                            if (personaje instanceof Personaje) {
                                Personaje pj = (Personaje) personaje;
                                if (!pj.inventario().items().isEmpty()) {
                                    IConsumible pocionDanio = pj.inventario().obtenerTipoConsumible(PocionDeDanio.class);
                                    pocionDanio.lanzar(enemigo);
                                    pj.inventario().removeItem(pocionDanio);
                                }
                            }
                    }
                    else
                        personaje.atacar(enemigo);

                    cooldownPersonaje = baseCooldownPersonaje;
                }
                else if (cooldownEnemigo <= 0.0){
                    enemigo.atacar(personaje);

                    cooldownEnemigo = baseCooldownEnemigo;
                }

                cooldownEnemigo -= tiempo;
                cooldownPersonaje -= tiempo;

                if (cooldownEnemigo < 0.0) cooldownEnemigo = 0.0;
                if (cooldownPersonaje < 0.0) cooldownPersonaje = 0.0;

            }

            if (personaje.vida() <= 0 && enemigo.vida() <= 0)
                System.out.println("Empate");
            else if (personaje.vida() <=0.0)
                System.out.println(enemigo.nombrePersonaje() + " gana el combate");
            else
                System.out.println(personaje.nombrePersonaje() + " gana el combate");

            Thread.sleep(100);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
            System.out.println(e.getMessage());
        }
    }


}
