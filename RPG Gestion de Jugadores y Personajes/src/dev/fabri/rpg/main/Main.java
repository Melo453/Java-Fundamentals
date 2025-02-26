package dev.fabri.rpg.main;

import dev.fabri.rpg.combate.Personajes.Arquero;
import dev.fabri.rpg.combate.Personajes.Guerrero;
import dev.fabri.rpg.combate.Personajes.Mago;
import dev.fabri.rpg.combate.batalla.Batalla;
import dev.fabri.rpg.combate.enemigos.Esqueleto;
import dev.fabri.rpg.combate.enemigos.Goblin;
import dev.fabri.rpg.combate.enemigos.Ogro;
import dev.fabri.rpg.combate.enemigos.Troll;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------Combate 1------------------------");
        Esqueleto esqueleto = new Esqueleto("Nico", 0,0);
        Guerrero guerrero = new Guerrero("Fabri", 0,0, null, null);

        Batalla.iniciarCombate(guerrero,esqueleto);

        System.out.println("------------------------Combate 2------------------------");

        Goblin goblin = new Goblin("Raul", 0,0);
        Mago mago = new Mago("Rodrigo", 0,0, null, null);

        Batalla.iniciarCombate(mago,goblin);

        System.out.println("------------------------Combate 3------------------------");

        Ogro ogro = new Ogro("Tizi", 0,0);
        Arquero arquero = new Arquero("Sofi", 0,0, null, null);

        Batalla.iniciarCombate(arquero,ogro);

        System.out.println("------------------------Combate 4------------------------");

        Troll troll = new Troll("Mary", 0,0);

        Batalla.iniciarCombate(guerrero,troll);
    }
}