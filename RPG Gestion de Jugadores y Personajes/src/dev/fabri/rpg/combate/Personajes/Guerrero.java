package dev.Model.Personaje;

import dev.Model.inventario.Inventario;
import dev.Model.mision.Mision;
import dev.fabri.rpg.combate.CombateEntity;
import dev.fabri.rpg.combate.Personajes.Personaje;

import java.util.Set;

public class Guerrero extends Personaje {

    public Guerrero() {
    }

    public Guerrero(String nombrePersonaje, double nivel, int experiencia, Inventario inventario, Set<Mision> misiones) {
        super(nombrePersonaje, nivel, experiencia, inventario,misiones);
        this.vida = 200;
        this.mana = 40;
        this.velocidadAtaque = .8;
    }

    @Override
    protected void atacar(CombateEntity objetivo) {

    }

    @Override
    protected void habilidadEspecial() {

    }
}
