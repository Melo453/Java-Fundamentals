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
    }

    @Override
    protected void atacar(CombateEntity objetivo) {

    }

    @Override
    protected void habilidadEspecial() {

    }
}
