package dev.fabri.rpg.Interfaces;

import dev.fabri.rpg.combate.Personajes.Personaje;

public interface IConsumible {
    void consumir(Personaje objetivo);
    void lanzar(Personaje objetivo);
}
