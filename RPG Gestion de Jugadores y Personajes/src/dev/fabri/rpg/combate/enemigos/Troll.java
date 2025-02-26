package dev.fabri.rpg.combate.enemigos;

import dev.fabri.rpg.combate.CombateEntity;

public class Troll extends Enemigo{

    public Troll() {
    }

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
        if (golpeExitoso()){
            int danio = calcularDanioBase();
            System.out.println("El " + nombrePersonaje + "le quito " + danio + "a " + objetivo.nombrePersonaje());
            objetivo.recibirDanio(danio);
        }else
            System.out.println("El ataque ha fallado.");
    }

    @Override
    protected void habilidadEspecial() {

    }
}
