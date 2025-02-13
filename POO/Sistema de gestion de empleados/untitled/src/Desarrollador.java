import java.util.Date;

public class Desarrollador extends Empleado{

    private int lengaujeDominados;
    private String nivel;
    private int proyectosCompletados;

    public Desarrollador() {
    }

    public Desarrollador(int id, String nombre, String apellido, String direccion, Date fechaNacimiento, double salarioBase, Date fechaEntada, String numTelefono,
                         String areaTelefono, int dni, int lengaujeDominados, String nivel, int proyectosCompletados) {
        super(id, nombre, apellido, direccion, fechaNacimiento, salarioBase, fechaEntada, numTelefono, areaTelefono, dni);
        this.lengaujeDominados = lengaujeDominados;
        this.nivel = nivel;
        this.proyectosCompletados = proyectosCompletados;
    }

    @Override
    protected double calcularBono() {
        return salarioBase() * (proyectosCompletados / 100.0);
    }
    public String desarollarModulo(String modulo){
        return modulo;
    }

}
