import java.util.*;

public class Main {

    public static void main(String[] args) {

        Calendar fechaEntrada = Calendar.getInstance();
        fechaEntrada.set(2023, Calendar.JULY, 24);

        Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.set(1998, Calendar.FEBRUARY, 1);

        Desarrollador desarrollador = new Desarrollador(1,"Maria", "Diaz", "Calle 111",fechaNacimiento.getTime(),1500,
                fechaEntrada.getTime(),"3511169321","54",45241356,2,"Semi Senior", 3);



        List<Empleado> empleados = new ArrayList<>();
        Gerente gerente1 = new Gerente(0,"Rodrigo", "Guzman", "Calle 123",fechaNacimiento.getTime(),1900,
                fechaEntrada.getTime(),"351443322","54",45088412,"I+D", empleados, 5.0);
        //imprimo personas
        gerente1.agregarEmpleado(desarrollador);

        System.out.println("Empleado{" +
                "id='" +  gerente1.id() + '\'' +
                ", Nombre='" + gerente1.nombre() + '\'' +
                ", Apellido='" + gerente1.apellido() + '\'' +
                ", Direccion='" + gerente1.direccion() + '\'' +
                ", Dni='" + gerente1.dni() + '\'' +
                ", FechaEntrada='" + gerente1.fechaEntada() + '\'' +
                ", FechaNacimiento='" + gerente1.fechaNacimiento() + '\'' +
                ", SalarioBase='" + gerente1.salarioBase() + '\'' +
                ", NumeroTelefono='" + gerente1.numTelefono() + '\'' +
                ", empleadosAsignados='" + gerente1.listaEmpleado() + '\'' +
                '}');

        System.out.println("Empleado{" +
            "id='" +  desarrollador.id() + '\'' +
                    ", Nombre='" + desarrollador.nombre() + '\'' +
                    ", Apellido='" + desarrollador.apellido() + '\'' +
                    ", Direccion='" + desarrollador.direccion() + '\'' +
                    ", Dni='" + desarrollador.dni() + '\'' +
                    ", FechaEntrada='" + desarrollador.fechaEntada() + '\'' +
                    ", FechaNacimiento='" + desarrollador.fechaNacimiento() + '\'' +
                    ", SalarioBase='" + desarrollador.salarioBase() + '\'' +
                    ", NumeroTelefono='" + desarrollador.numTelefono() + '\'' +

                    '}');


        System.out.println(gerente1.calcularBono());
        System.out.println(gerente1.listaEmpleado());
        System.out.println("se programo una reunion para le dia: " + gerente1.realizarReunion());

        System.out.println(desarrollador.calcularBono());
        System.out.println("Desarrolar modulo: " + desarrollador.desarollarModulo("Threads"));
    }



}