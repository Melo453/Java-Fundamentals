package Main.Interfaces;

import Main.Model.Personaje.Personaje;

public interface ICurable {
    void curar(Personaje aliado, int puntos);
}
