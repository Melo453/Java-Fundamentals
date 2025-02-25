package Main.Model.Personaje;

import Main.Model.inventario.Inventario;
import Main.Model.mision.Mision;

import java.util.Set;

public class Mago extends Personaje {
    public Mago() {
    }

    public Mago(String nombrePersonaje, double nivel, int experiencia, Inventario inventario, Set<Mision> misiones) {
        super(nombrePersonaje, nivel, experiencia, inventario,misiones);
        this.vida = 120;
        this.mana = 170;
        this.velocidadAtaque = 1.2;
    }

    @Override
    protected void atacar(Personaje enemigo) {

    }

    @Override
    protected void habilidadEspecial() {

    }
}
