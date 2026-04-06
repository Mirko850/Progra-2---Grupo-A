import ImplementacionDiccionarios.AgendaContactos;
import Interfaces.Diccionarios;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
      public static void main(String[] args) {
        // PRUEBA AGENDA TELEFONICA
        Diccionarios agenda = new AgendaContactos();
        agenda.InicializarDiccionario();
        System.out.println("Prueba Agenda Telefonica");

        //Agrega Contactos
        agenda.Agregar(1, 3);
        agenda.Agregar(2,3);
        agenda.Agregar(2, 5);

        System.out.println("Nombres de la Agenda: ");
        int[] claves1 = agenda.Claves();
        for (int i = 0; i < claves1.length; i++) {
            System.out.println(claves1[i]);
        }

        agenda.Eliminar(2);

        System.out.println("Claves luego de eliminar la clave 2:");
        int[] claves2 = agenda.Claves();
        for (int i = 0; i < claves2.length; i++) {
            System.out.println(claves2[i]);
        }


    }
}