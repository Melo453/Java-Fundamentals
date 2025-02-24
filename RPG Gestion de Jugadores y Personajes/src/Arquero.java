public class Arquero extends Personaje{
    public Arquero() {
    }

    public Arquero(String nombrePersonaje, double nivel, int experiencia, Inventario inventario) {
        super(nombrePersonaje, nivel, experiencia, inventario);
        this.vida = 140;
        this.mana = 80;
        this.velocidadAtaque = 2;
    }

    @Override
    protected void atacar(Personaje enemigo) {

    }

    @Override
    protected void habilidadEspecial() {

    }
}
