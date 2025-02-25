package dev.Model.inventario;

import dev.fabri.rpg.combate.Personajes.Personaje;

public class PocionDeDanio extends Pocion{
    private int puntosDanio = 30;

    public PocionDeDanio() {
        super("Pocion de daño", "Quita 30 puntos de vida al enemigo al ser lanzada.");
    }


    @Override
    public void consumir(Personaje objetivo) {

    }

    @Override
    public void lanzar(Personaje objetivo) {

    }
}
