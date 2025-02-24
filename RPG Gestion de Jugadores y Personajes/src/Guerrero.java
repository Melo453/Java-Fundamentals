public class Guerrero extends Personaje{

    public Guerrero() {
    }

    public Guerrero(String nombrePersonaje, double nivel, int experiencia, Inventario inventario) {
        super(nombrePersonaje, nivel, experiencia, inventario);
        this.vida = 200;
        this.mana = 40;
        this.velocidadAtaque = .8;
    }

    @Override
    protected void atacar(Personaje enemigo) {

    }

    @Override
    protected void habilidadEspecial() {

    }
}
