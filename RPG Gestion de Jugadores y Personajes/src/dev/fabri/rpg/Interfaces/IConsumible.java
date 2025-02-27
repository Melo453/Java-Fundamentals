package dev.fabri.rpg.Interfaces;

import dev.fabri.rpg.combate.CombateEntity;


public interface IConsumible {
    void consumir(CombateEntity objetivo);
    void lanzar(CombateEntity objetivo);
}
