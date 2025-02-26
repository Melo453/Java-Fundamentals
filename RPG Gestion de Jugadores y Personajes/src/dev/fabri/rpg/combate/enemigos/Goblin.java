package dev.fabri.rpg.combate.enemigos;

import dev.fabri.rpg.Interfaces.ICritico;
import dev.fabri.rpg.combate.CombateEntity;

public class Goblin extends Enemigo implements ICritico {

    public Goblin() {
    }

    public Goblin(String nombrePersonaje, double nivel, int experiencia) {
        super(nombrePersonaje, nivel, experiencia);
        this.vida = 80;
        this.mana = 30;
        this.velocidadAtaque = 2;
        this.minDamage = 10;
        this.maxDamage = 12;
    }

    @Override
    public void atacar(CombateEntity objetivo) {
        if (golpeExitoso()){
            int danioBase = calcularDanioBase();
            if (Math.random() <= calcularProbabilidadAtaqueCritico()){
                double danioCritico = aplicarAtaqueCritico(danioBase);
                System.out.println("¡Golpe Crítico! " + nombrePersonaje +
                        " le quito " + danioCritico + " de vida a " + objetivo.nombrePersonaje());
                System.out.println("Al personaje " + objetivo.nombrePersonaje() + " le queda " + objetivo.vida() + " de vida");
                objetivo.recibirDanio((int) danioCritico);
            }else{
                System.out.println(" " + nombrePersonaje + " le quito " + danioBase + " de vida a " + objetivo.nombrePersonaje());
                System.out.println("Al personaje " + objetivo.nombrePersonaje() + " le queda " + objetivo.vida() + " de vida");
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
        return danioBase * 2.7;
    }

    @Override
    public double calcularProbabilidadAtaqueCritico() {
        return 1.7;
    }
}
