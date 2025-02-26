package dev.fabri.rpg.combate.Personajes;

import dev.Model.inventario.Inventario;
import dev.Model.mision.Mision;
import dev.fabri.rpg.Interfaces.ICritico;
import dev.fabri.rpg.combate.CombateEntity;
import dev.fabri.rpg.combate.Personajes.Personaje;

import java.util.Set;

public class Mago extends Personaje implements ICritico {
    public Mago() {
    }

    public Mago(String nombrePersonaje, double nivel, int experiencia, Inventario inventario, Set<Mision> misiones) {
        super(nombrePersonaje, nivel, experiencia, inventario,misiones);
        this.vida = 120;
        this.mana = 170;
        this.velocidadAtaque = 1.2;
        this.minDamage = 20;
        this.maxDamage = 25;
    }

    @Override
    public void atacar(CombateEntity objetivo) {
        if (golpeExitoso()){
            int danioBase = calcularDanioBase();
            if (Math.random() <= calcularProbabilidadAtaqueCritico()){
                double danioCritico = aplicarAtaqueCritico(danioBase);
                System.out.println("¡Golpe Crítico! " + nombrePersonaje +
                        " le quito " + danioCritico + " de vida a " + objetivo.nombrePersonaje());
                System.out.println("A " + objetivo.nombrePersonaje() + " le queda " + objetivo.vida() + " de vida");
                objetivo.recibirDanio((int) danioCritico);
            }else {
                System.out.println(" " + nombrePersonaje + " le quito " + danioBase + " de vida a " + objetivo.nombrePersonaje());
                System.out.println("A " + objetivo.nombrePersonaje() + " le queda " + objetivo.vida() + " de vida");
                objetivo.recibirDanio(danioBase);
            }
        }else
            System.out.println(nombrePersonaje + " ha fallado el ataque.");
    }

    @Override
    protected void habilidadEspecial() {

    }

    @Override
    public double aplicarAtaqueCritico(int danioBase) {
        return danioBase * 2;
    }

    @Override
    public double calcularProbabilidadAtaqueCritico() {
        return 0.15;
    }
}
