package dev.fabri.rpg.combate.Personajes;

import dev.Model.inventario.Inventario;
import dev.Model.mision.Mision;
import dev.fabri.rpg.combate.CombateEntity;

import java.util.Set;

public abstract class Personaje extends CombateEntity {

    protected String nombrePersonaje;
    protected double nivel;
    protected double vida;
    protected double mana;
    protected double velocidadAtaque;
    protected int experiencia;
    protected Inventario inventario;
    private Set<Mision> misiones;

    public Personaje() {
    }

    public Personaje(String nombrePersonaje, double nivel, int experiencia, Inventario inventario, Set<Mision> misiones) {
        this.nombrePersonaje = nombrePersonaje;
        this.nivel = nivel;
        this.vida = 100;
        this.mana = 50;
        this.velocidadAtaque = 50;
        this.experiencia = experiencia;
        this.inventario = inventario;
        this.misiones = misiones;
    }

    protected void acumularExperiencia(){

    }

}
