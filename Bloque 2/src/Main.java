import Implementacion.FilaCajero;
import Implementacion.GuardiaHospital;
import Implementacion.ImpresoraLab;
import Interfaces.Colas;
import Interfaces.ColasPrioridad;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // ---------- Pruebas Fila Cajero
        System.out.println("Pruebas Fila de Cajero");
        ColasPrioridad fila = new FilaCajero();
        fila.InicializarCola();

        // cliente normal
        fila.AcolarPrioridad(1, 1);

        // embarazada
        fila.AcolarPrioridad(2, 10);

        // jubilado
        fila.AcolarPrioridad(3, 5);

        System.out.println("Es turno del cliente Nro: " + fila.Primero());

        // ------------ Prueba Impresora Lab
        System.out.println("Pruebas Impresora Lab");

        Colas impresora = new ImpresoraLab();
        impresora.InicializarCola();

        // llegan 5 archivos
        impresora.Acolar(1);
        impresora.Acolar(2);
        impresora.Acolar(3);
        impresora.Acolar(4);
        impresora.Acolar(5);

        // orden de impresión
        while (!impresora.ColaVacia()) {
            System.out.println("Imprimiendo archivo: " + impresora.Primero());
            impresora.Desacolar();
        }

        // --------- Pruebas Guardia Hospital de clinicas
        System.out.println("Pruebas Guardia Hospital");
        ColasPrioridad triage = new GuardiaHospital();
        triage.InicializarCola();

        // llegan en cualquier orden
        triage.AcolarPrioridad(1, 1);   // raspón
        triage.AcolarPrioridad(2, 100); // bobazo
        triage.AcolarPrioridad(3, 20);  // corte
        triage.AcolarPrioridad(4, 70);  // fractura
        triage.AcolarPrioridad(5, 10);  // muela

//        // atención por prioridad
//        while (!triage.ColaVacia()) {
//            System.out.println(
//                    "Paciente: " + triage.Primero() +
//                            " | Prioridad: " + triage.Prioridad()
//            );
//            triage.Desacolar();
//        }


    }
}
