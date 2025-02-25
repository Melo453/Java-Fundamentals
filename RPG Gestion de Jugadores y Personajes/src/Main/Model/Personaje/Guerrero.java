package Main.Model.Personaje;

import Main.Model.inventario.Inventario;
import Main.Model.mision.Mision;

import java.util.Set;

public class Guerrero extends Personaje {

    public Guerrero() {
    }

    public Guerrero(String nombrePersonaje, double nivel, int experiencia, Inventario inventario, Set<Mision> misiones) {
        super(nombrePersonaje, nivel, experiencia, inventario,misiones);
        this.vida = 200;
        this.mana = 40;
        this.velocidadAtaque = .8;
    }

    @Override
    protected void atacar(Personaje enemigo) {

    }

    @Override
    protected void habilidadEspecial() {

    }
}
