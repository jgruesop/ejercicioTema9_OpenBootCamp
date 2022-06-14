public class Main {
    public static void main(String[] args){

        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        System.out.println("Datos del usuario: \n");
        cliente.nombre = "Jhonatan Grueso Perea";
        cliente.edad = 36;
        cliente.telefono = "3805555555";
        cliente.credito = 2500000.00;

        System.out.println("Su nombre es " + cliente.nombre + "\nusted tiene " + cliente.edad +
                " anios" + "\ny su numero telefonico es " + cliente.telefono + "\n actualmente el credito es " +
                cliente.credito);

        System.out.println("\nDatos del Trabajador: \n");
        trabajador.nombre = "Jose Pedro Pintor";
        trabajador.edad = 25;
        trabajador.telefono = "3806666665";
        trabajador.salario = 2100000.00;

        System.out.println("Su nombre es " + trabajador.nombre + "\nusted tiene " + trabajador.edad +
                " anios" + "\ny su numero telefonico es " + trabajador.telefono + "\nsu salario es de " +
                trabajador.salario);

    }
}

class Persona{
    String nombre;
    String telefono;
    int edad;
}

class Cliente extends Persona{
    double credito;
}

class Trabajador extends Persona{
    double salario;
}