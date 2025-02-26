package dev.fabri.rpg.combate;

import dev.fabri.rpg.combate.Personajes.Personaje;

public abstract class CombateEntity {

    protected String nombrePersonaje;
    protected double nivel;
    protected double vida;
    protected double mana;
    protected double velocidadAtaque;
    protected int experiencia;
    protected int minDamage;
    protected int maxDamage;
    protected static final double PROBABILIDAD_GOLPE = 0.85;


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

    public void recibirDanio(int puntos){
        this.vida -= puntos;
    }

    protected void subirNivel(){

    }

    public abstract void atacar(CombateEntity objetivo);
    protected abstract void habilidadEspecial();

    protected int calcularDanioBase(){
        return (int) (Math.random() * (maxDamage - minDamage +1) + minDamage);
    }

    protected boolean golpeExitoso(){
        return Math.random() <= PROBABILIDAD_GOLPE;
    }
    public String nombrePersonaje() {
        return nombrePersonaje;
    }

    public double velocidadAtaque() {
        return velocidadAtaque;
    }

    public double vida() {
        return this.vida;
    }
}
