package Main.Model.inventario;

import Main.Model.Personaje.Personaje;

public class PocionDeCuracion extends Pocion{
    private final int puntosCuracion = 20;

    public PocionDeCuracion() {
        super("Pocion de Curacion", "Restaura 20 puntos de vida al ser consumida.");

    }

    @Override
    public void consumir(Personaje objetivo) {

    }

    @Override
    public void lanzar(Personaje objetivo) {

    }
}
