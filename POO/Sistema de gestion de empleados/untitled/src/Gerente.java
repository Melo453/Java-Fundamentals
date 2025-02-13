import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Gerente extends Empleado{

    private String departamento;
    private List<Empleado> listaEmpleados;
    private double porcentajeBonoExtra;

    public Gerente() {
    }

    public Gerente(int id, String nombre, String apellido, String direccion, Date fechaNacimiento,
                   double salarioBase, Date fechaEntada, String numTelefono, String areaTelefono, int dni, String departamento, List<Empleado> listaEmpleados, double porcentajeBonoExtra) {
        super(id, nombre, apellido, direccion, fechaNacimiento, salarioBase, fechaEntada, numTelefono, areaTelefono, dni);
        this.departamento = departamento;
        this.listaEmpleados = listaEmpleados;
        this.porcentajeBonoExtra = porcentajeBonoExtra;
    }

    @Override
    protected double calcularBono() {
        return salarioBase() * porcentajeBonoExtra;
    }

    public void agregarEmpleado(Empleado empleadoAsignado){
        listaEmpleados.add(empleadoAsignado);
    }

    public List<Empleado> listaEmpleado(){
        return this.listaEmpleados;
    }
   public LocalDate realizarReunion(){
       LocalDate localDate = LocalDate.now();
       asistirReunion();
       return localDate;
   }
}
