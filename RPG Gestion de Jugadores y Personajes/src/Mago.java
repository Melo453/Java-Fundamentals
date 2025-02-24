public class Mago extends Personaje{
    public Mago() {
    }

    public Mago(String nombrePersonaje, double nivel, int experiencia, Inventario inventario) {
        super(nombrePersonaje, nivel, experiencia, inventario);
        this.vida = 120;
        this.mana = 170;
        this.velocidadAtaque = 1.2;
    }

    @Override
    protected void atacar(Personaje enemigo) {

    }

    @Override
    protected void habilidadEspecial() {

    }
}
