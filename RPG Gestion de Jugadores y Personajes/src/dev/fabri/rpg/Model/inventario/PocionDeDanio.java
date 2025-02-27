package dev.fabri.rpg.Model.inventario;
import dev.fabri.rpg.combate.CombateEntity;

public class PocionDeDanio extends Pocion {
    private static final int puntosDanio = 30;

    public PocionDeDanio() {
        super("Pocion de daño", "Quita 30 puntos de vida al enemigo al ser lanzada.");
    }


    @Override
    public void consumir(CombateEntity objetivo) {

    }

    @Override
    public void lanzar(CombateEntity objetivo) {
        objetivo.recibirDanio(puntosDanio);
        System.out.println("le lanzaron una pocion de danio a " + objetivo.nombrePersonaje() + " -" +puntosDanio + " de vida, ahora tiene " + objetivo.vida() + " de vida");
    }
}
