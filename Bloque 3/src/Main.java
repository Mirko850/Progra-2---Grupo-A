import Interfaces.ConjuntoTDA;
import ImplementacionConjuntos.PadronElectoral;

public class Main {
    public static void main(String[] args) {

        // PRUEBA PADRON ELECTORAL
        ConjuntoTDA c = new PadronElectoral();
        c.InicializarConjunto();

        System.out.println("¿Conjunto vacío?: " + c.ConjuntoVacio());

        // Agregamos strings
        c.Agregar("Andres");
        c.Agregar("Pablo");
        c.Agregar("Andres"); // No se agregará porque ya existe
        c.Agregar("Juan");

        // CORRECCIÓN: Buscamos Strings, no ints
        System.out.println("¿Pertenece Andres?: " + c.Pertenece("Andres"));
        System.out.println("¿Pertenece Pedro?: " + c.Pertenece("Pedro"));

        // Elegir devolverá un nombre
        System.out.println("Elemento elegido: " + c.Elegir());

        // CORRECCIÓN: Sacamos un String
        c.Sacar("Juan");
        System.out.println("¿Pertenece Juan luego de sacarlo?: " + c.Pertenece("Juan"));

        c.Sacar("Andres");
        System.out.println("¿Pertenece Andres luego de sacarlo?: " + c.Pertenece("Andres"));

        System.out.println("¿Conjunto vacío?: " + c.ConjuntoVacio());
    }
}