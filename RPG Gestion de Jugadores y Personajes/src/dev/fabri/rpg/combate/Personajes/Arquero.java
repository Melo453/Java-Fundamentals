package dev.Model.Personaje;

import dev.Model.inventario.Inventario;
import dev.Model.mision.Mision;
import dev.fabri.rpg.combate.CombateEntity;
import dev.fabri.rpg.combate.Personajes.Personaje;

import java.util.Set;

public class Arquero extends Personaje {
    public Arquero() {
    }


    public Arquero(String nombrePersonaje, double nivel, int experiencia, Inventario inventario, Set<Mision> misiones) {
        super(nombrePersonaje, nivel, experiencia, inventario,misiones);
        this.vida = 140;
        this.mana = 80;
        this.velocidadAtaque = 2;
    }

    @Override
    protected void atacar(CombateEntity objetivo) {

    }
    @Override
    protected void habilidadEspecial() {

    }
}
