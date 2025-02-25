package Main.Model.Personaje;

import Main.Model.inventario.Inventario;
import Main.Model.mision.Mision;

import java.util.Set;

public abstract class Personaje {

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
    protected void acumularExperiencia(){

    }

    protected abstract void atacar(Personaje enemigo);
    protected abstract void habilidadEspecial();
}
