package dev.fabri.rpg.Interfaces;

import dev.fabri.rpg.combate.Personajes.Personaje;

public interface ICurable {
  void curar(Personaje aliado, int puntos);
}
