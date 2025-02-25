package Main.Model.Personaje;

import Main.Model.inventario.Inventario;
import Main.Model.mision.Mision;

import java.util.Set;

public class Arquero extends Personaje {
    public Arquero() {
    }

    public Arquero(String nombrePersonaje, double nivel, int experiencia, Inventario inventario, Set<Mision> misiones) {
        super(nombrePersonaje, nivel, experiencia, inventario,misiones);
        this.vida = 140;
        this.mana = 80;
        this.velocidadAtaque = 2;
    }

    @Override
    protected void atacar(Personaje enemigo) {

    }

    @Override
    protected void habilidadEspecial() {

    }
}
