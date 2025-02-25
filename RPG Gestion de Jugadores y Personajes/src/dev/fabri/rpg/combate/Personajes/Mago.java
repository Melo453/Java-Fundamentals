package dev.Model.Personaje;

import dev.Model.inventario.Inventario;
import dev.Model.mision.Mision;
import dev.fabri.rpg.combate.CombateEntity;
import dev.fabri.rpg.combate.Personajes.Personaje;

import java.util.Set;

public class Mago extends Personaje {
    public Mago() {
    }

    public Mago(String nombrePersonaje, double nivel, int experiencia, Inventario inventario, Set<Mision> misiones) {
        super(nombrePersonaje, nivel, experiencia, inventario,misiones);
        this.vida = 120;
        this.mana = 170;
        this.velocidadAtaque = 1.2;
    }

    @Override
    protected void atacar(CombateEntity objetivo) {

    }

    @Override
    protected void habilidadEspecial() {

    }
}
