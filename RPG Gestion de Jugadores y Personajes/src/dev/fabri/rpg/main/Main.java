package dev.fabri.rpg.main;

import dev.fabri.rpg.combate.Personajes.Guerrero;
import dev.fabri.rpg.combate.batalla.Batalla;
import dev.fabri.rpg.combate.enemigos.Esqueleto;
import dev.fabri.rpg.combate.enemigos.Ogro;

public class Main {
    public static void main(String[] args) {
        Esqueleto esqueleto = new Esqueleto("Nico", 0,0);
        Guerrero guerrero = new Guerrero("fabri", 0,0, null, null);

        Batalla.iniciarCombate(guerrero,esqueleto);
    }
}