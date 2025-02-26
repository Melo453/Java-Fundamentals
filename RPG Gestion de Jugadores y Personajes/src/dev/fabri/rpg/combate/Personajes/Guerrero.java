package dev.fabri.rpg.combate.Personajes;

import dev.Model.inventario.Inventario;
import dev.Model.mision.Mision;
import dev.fabri.rpg.combate.CombateEntity;
import dev.fabri.rpg.combate.Personajes.Personaje;

import java.util.Set;

public class Guerrero extends Personaje {

    public Guerrero() {
    }

    public Guerrero(String nombrePersonaje, double nivel, int experiencia, Inventario inventario, Set<Mision> misiones) {
        super(nombrePersonaje, nivel, experiencia, inventario, misiones);
        this.vida = 200;
        this.mana = 40;
        this.velocidadAtaque = 0.8;
        this.minDamage = 25;
        this.maxDamage = 30;
    }

    @Override
    public void atacar(CombateEntity objetivo) {
        if (golpeExitoso()){
            int danio = calcularDanioBase();
            System.out.println("El " + nombrePersonaje + " le quito " + danio + " de vida a " + objetivo.nombrePersonaje());
            System.out.println("Al enemigo " + objetivo.nombrePersonaje() + " le queda " + objetivo.vida() + " de vida");
            objetivo.recibirDanio(danio);
        }else
            System.out.println(nombrePersonaje + " ha fallado el ataque."); 
 

    }

    @Override
    protected void habilidadEspecial() {

    }
}
