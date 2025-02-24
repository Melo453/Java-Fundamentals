package Main.Interfaces;

import Main.Model.Personaje.Personaje;

public interface IConsumible {
    void consumir(Personaje objetivo);
    void lanzar(Personaje objetivo);
}
