package dev.fabri.rpg.combate.enemigos;

import dev.fabri.rpg.combate.CombateEntity;

public class Esqueleto extends Enemigo{
    public Esqueleto() {
    }

    public Esqueleto(String nombrePersonaje, double nivel, int experiencia) {
        super(nombrePersonaje, nivel, experiencia);
        this.vida = 100;
        this.mana = 0;
        this.velocidadAtaque = 1.2;
        this.minDamage = 15;
        this.maxDamage = 18;
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
