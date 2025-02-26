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
    }

    @Override
    protected void atacar(CombateEntity objetivo) {

    }

    @Override
    protected void habilidadEspecial() {

    }
}
