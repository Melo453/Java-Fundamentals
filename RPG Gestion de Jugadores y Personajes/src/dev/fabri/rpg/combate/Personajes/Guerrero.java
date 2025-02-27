package dev.fabri.rpg.combate.Personajes;

import dev.Model.mision.Mision;
import dev.fabri.rpg.Interfaces.IConsumible;
import dev.fabri.rpg.Interfaces.ICritico;
import dev.fabri.rpg.combate.CombateEntity;


import java.util.Set;

public class Guerrero extends Personaje implements ICritico, IConsumible {

    public Guerrero() {
    }

    public Guerrero(String nombrePersonaje, double nivel, int experiencia, dev.Model.inventario.Inventario inventario, Set<Mision> misiones) {
        super(nombrePersonaje, nivel, experiencia, inventario, misiones);
        this.vida = 200;
        this.mana = 40;
        this.velocidadAtaque = 0.8;
        this.minDamage = 25;
        this.maxDamage = 30;
    }

    @Override
    public void atacar(CombateEntity objetivo) {
        if (golpeExitoso()){
            int danioBase = calcularDanioBase();
            if (Math.random() <= calcularProbabilidadAtaqueCritico()){
                double danioCritico = aplicarAtaqueCritico(danioBase);
                objetivo.recibirDanio((int) danioCritico);
                System.out.println("¡Golpe Crítico! " + nombrePersonaje +
                        " le quito " + danioCritico + " de vida a " + objetivo.nombrePersonaje());
                System.out.println("A " + objetivo.nombrePersonaje() + " le queda " + objetivo.vida() + " de vida");
            }else {
                objetivo.recibirDanio(danioBase);
                System.out.println(" " + nombrePersonaje + " le quito " + danioBase + " de vida a " + objetivo.nombrePersonaje());
                System.out.println("A " + objetivo.nombrePersonaje() + " le queda " + objetivo.vida() + " de vida");
            }
        }else
            System.out.println(nombrePersonaje + " ha fallado el ataque."); 
 

    }

    @Override
    protected void habilidadEspecial() {

    }

    @Override
    public double aplicarAtaqueCritico(int danioBase) {
        return danioBase * 1.5;
    }

    @Override
    public double calcularProbabilidadAtaqueCritico() {
        return 0.1;
    }

    @Override
    public void consumir(CombateEntity objetivo) {

    }

    @Override
    public void lanzar(CombateEntity objetivo) {

    }
}
