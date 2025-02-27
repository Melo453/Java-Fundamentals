package dev.fabri.rpg.combate.Personajes;

import dev.Model.inventario.Inventario;
import dev.Model.mision.Mision;
import dev.fabri.rpg.combate.CombateEntity;

import java.util.Set;

public abstract class Personaje extends CombateEntity {

    protected Inventario inventario;
    private Set<Mision> misiones;

    public Personaje() {
    }

    public Personaje(String nombrePersonaje, double nivel, int experiencia, Inventario inventario, Set<Mision> misiones) {
        super(nombrePersonaje, nivel, experiencia);
        this.inventario = inventario;
        this.misiones = misiones;
    }

    protected void acumularExperiencia(){

    }

    public Inventario inventario() {
        return inventario;
    }
}
