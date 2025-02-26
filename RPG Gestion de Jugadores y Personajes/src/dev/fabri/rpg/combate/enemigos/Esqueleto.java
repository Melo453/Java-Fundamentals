package dev.fabri.rpg.combate.enemigos;

import dev.fabri.rpg.combate.CombateEntity;

public class Esqueleto extends Enemigo{
    public Esqueleto() {
    }

    public Esqueleto(String nombrePersonaje, double nivel, int experiencia) {
        super(nombrePersonaje, nivel, experiencia);
        this.vida = 100;
        this.mana = 0;
        this.velocidadAtaque = 1.2;
    }

    @Override
    protected void atacar(CombateEntity objetivo) {

    }

    @Override
    protected void habilidadEspecial() {

    }
}
