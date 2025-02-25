package dev.fabri.rpg.Interfaces;

import dev.fabri.rpg.combate.Personajes.Personaje;

public interface IHechizable {
    void lanzarHechizo(String nombreHechizo, Personaje objetivo);
    void recibirHechizo(String nombreHechizo);
}
