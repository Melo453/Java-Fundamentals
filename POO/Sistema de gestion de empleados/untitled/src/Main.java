import java.util.Calendar;
import java.util.Date;

public class Main {
    private static final Gerente gerente1 = new Gerente();
    private static final Desarrollador desarrollador = new Desarrollador();
    public static void main(String[] args) {

        //declaro personas
        gerente1.setId(0);
        gerente1.setNombre("Rodrigo");
        gerente1.setApellido("Guzman");
        gerente1.setDireccion("Calle 123");
        gerente1.setDni(45088412);
        Calendar fechaEntrada = Calendar.getInstance();
        fechaEntrada.set(2023, Calendar.JULY, 24);
        gerente1.setFechaEntada(fechaEntrada.getTime());
        Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.set(1998, Calendar.FEBRUARY, 1);
        gerente1.setFechaNacimiento(fechaNacimiento.getTime());
        gerente1.setSalarioBase(1900);
        gerente1.setNumTelefono("351443322");
        gerente1.setAreaTelefono("54");

        desarrollador.setId(1);
        desarrollador.setNombre("Maria");
        desarrollador.setApellido("Diaz");
        desarrollador.setDireccion("Calle 111");
        desarrollador.setDni(45241356);
        desarrollador.setFechaEntada(fechaEntrada.getTime());
        desarrollador.setFechaNacimiento(fechaNacimiento.getTime());
        desarrollador.setSalarioBase(1500);
        desarrollador.setNumTelefono("3511169321");
        desarrollador.setAreaTelefono("54");


        //imprimo personas


        System.out.println(imprimirGerente());
        System.out.println(imprimirDesarrollador());
    }

    public static String imprimirGerente() {
        return "Empleado{" +
                "id='" +  gerente1.id() + '\'' +
                ", Nombre='" + gerente1.nombre() + '\'' +
                ", Apellido='" + gerente1.apellido() + '\'' +
                ", Direccion='" + gerente1.direccion() + '\'' +
                ", Dni='" + gerente1.dni() + '\'' +
                ", FechaEntrada='" + gerente1.fechaEntada() + '\'' +
                ", FechaNacimiento='" + gerente1.fechaNacimiento() + '\'' +
                ", SalarioBase='" + gerente1.salarioBase() + '\'' +
                ", NumeroTelefono='" + gerente1.numTelefono() + '\'' +

                '}';
    }

    public static String imprimirDesarrollador() {
        return "Empleado{" +
                "id='" +  desarrollador.id() + '\'' +
                ", Nombre='" + desarrollador.nombre() + '\'' +
                ", Apellido='" + desarrollador.apellido() + '\'' +
                ", Direccion='" + desarrollador.direccion() + '\'' +
                ", Dni='" + desarrollador.dni() + '\'' +
                ", FechaEntrada='" + desarrollador.fechaEntada() + '\'' +
                ", FechaNacimiento='" + desarrollador.fechaNacimiento() + '\'' +
                ", SalarioBase='" + desarrollador.salarioBase() + '\'' +
                ", NumeroTelefono='" + desarrollador.numTelefono() + '\'' +

                '}';
    }
}