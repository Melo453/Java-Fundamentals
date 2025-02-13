import java.util.Date;

public abstract class Empleado {
    private int id;
    private String nombre;
    private String apellido;
    private String direccion;
    private Date fechaNacimiento;
    private double salarioBase;
    private Date fechaEntada;
    private String numTelefono;
    private String areaTelefono;
    private int dni;

    public Empleado() {
    }

    public Empleado(int id, String nombre, String apellido, String direccion, Date fechaNacimiento,
                    double salarioBase, Date fechaEntada, String numTelefono,String areaTelefono, int dni) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.salarioBase = salarioBase;
        this.fechaEntada = fechaEntada;
        this.numTelefono = numTelefono;
        this.dni = dni;
    }

    public int id() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String nombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String apellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String direccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date fechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double salarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Date fechaEntada() {
        return fechaEntada;
    }

    public void setFechaEntada(Date fechaEntada) {
        this.fechaEntada = fechaEntada;
    }

    public String numTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String areaTelefono() {
        return areaTelefono;
    }

    public void setAreaTelefono(String areaTelefono) {
        this.areaTelefono = numTelefono;
    }

    public int dni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    protected abstract double calcularBono();
    protected void trabajar(){
        System.out.println( "esta trabajando");
    }
    public void asistirReunion(){
        System.out.println("asistio a la reunion");
    }


    @Override
    public String toString() {
        return "Empleado{" +
                "numTelefono='" + numTelefono + '\'' +
                ", areaTelefono='" + areaTelefono + '\'' +
                '}';
    }
}
