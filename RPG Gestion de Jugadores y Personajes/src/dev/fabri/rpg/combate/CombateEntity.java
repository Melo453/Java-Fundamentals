package dev.fabri.rpg.combate;

import dev.fabri.rpg.combate.Personajes.Personaje;

public abstract class CombateEntity {

    protected String nombrePersonaje;
    protected double nivel;
    protected double vida;
    protected double mana;
    protected double velocidadAtaque;
    protected int experiencia;


    public CombateEntity() {
    }

    public CombateEntity(String nombrePersonaje, double nivel, int experiencia) {
        this.nombrePersonaje = nombrePersonaje;
        this.nivel = nivel;
        this.vida = 100;
        this.mana = 50;
        this.velocidadAtaque = 50;
        this.experiencia = experiencia;
    }

    protected boolean consumirMana(int cantidad) {
        if (mana >= cantidad) {
            mana -= cantidad;
            return true;
        } else{
            System.out.println("No tienes suficiente mana para usar este ataque");
            return false;
        }
    }

    protected void recibirDanio(int puntos){
        vida -= puntos;
    }

    protected void subirNivel(){

    }

    protected abstract void atacar(CombateEntity objetivo);
    protected abstract void habilidadEspecial();
}
