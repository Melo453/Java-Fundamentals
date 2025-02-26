package dev.fabri.rpg.combate.enemigos;

import dev.fabri.rpg.combate.CombateEntity;

public class Goblin extends Enemigo{

    public Goblin() {
    }

    public Goblin(String nombrePersonaje, double nivel, int experiencia) {
        super(nombrePersonaje, nivel, experiencia);
        this.vida = 80;
        this.mana = 30;
        this.velocidadAtaque = 1.5;
        this.minDamage = 10;
        this.maxDamage = 12;
    }

    @Override
    public void atacar(CombateEntity objetivo) {
        if (golpeExitoso()){
            int danio = calcularDanioBase();
            System.out.println("El " + nombrePersonaje + " le quito " + danio + " de vida a " + objetivo.nombrePersonaje());
            System.out.println("Al personaje " + objetivo.nombrePersonaje() + " le queda " + objetivo.vida() + " de vida");
            objetivo.recibirDanio(danio);
        }else
            System.out.println(nombrePersonaje + " ha fallado el ataque."); 

    }

    @Override
    protected void habilidadEspecial() {

    }
}
