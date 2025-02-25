package Main.Interfaces;

import Main.Model.Personaje.Personaje;

public interface IHechizable {
    void lanzarHechizo(String nombreHechizo, Personaje objetivo);
    void recibirHechizo(String nombreHechizo);
}
