package dev.fabri.rpg.combate.enemigos;

import dev.fabri.rpg.combate.CombateEntity;

public class Ogro extends Enemigo{
    public Ogro() {
    }

    public Ogro(String nombrePersonaje, double nivel, int experiencia) {
        super(nombrePersonaje, nivel, experiencia);
        this.vida = 200;
        this.mana = 50;
        this.velocidadAtaque = 0.8;
        this.minDamage = 25;
        this.maxDamage = 30;
    }

    @Override
    public void atacar(CombateEntity objetivo) {
        if (golpeExitoso()){
            int danio = calcularDanioBase();
            System.out.println("El " + nombrePersonaje + " le quito " + danio + " de vida a " + objetivo.nombrePersonaje());
            System.out.println("Al personaje " + objetivo.nombrePersonaje() + " le queda " + objetivo.vida() + " de vida");
            objetivo.recibirDanio(danio);
        }else
            System.out.println(nombrePersonaje + " ha fallado el ataque."); 
 

    }

    @Override
    protected void habilidadEspecial() {

    }
}
