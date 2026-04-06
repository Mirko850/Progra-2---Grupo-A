import ImplementacionDiccionarios.AgendaContactos;
import ImplementacionDiccionarios.DiccionarioSinonimos;
import ImplementacionDiccionarios.PuntajeTorneo;
import Interfaces.Diccionarios;
import Interfaces.DiccionariosMultiple;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
      public static void main(String[] args) {
        // PRUEBA AGENDA TELEFONICA
        Diccionarios agenda = new AgendaContactos();
        agenda.InicializarDiccionario();
        System.out.println("Prueba Agenda Telefonica");

        //Agrega Contactos
        agenda.Agregar("Juan", "1132589554");
        agenda.Agregar("Pedro","25485447");
        agenda.Agregar("Matias", "2225415522");

        System.out.println("Nombres de la Agenda: ");
        String[] claves1 = agenda.Claves();
        for (int i = 0; i < claves1.length; i++) {
            System.out.println(claves1[i]);
        }

        agenda.Eliminar("Juan");

        System.out.println("Claves luego de eliminar la clave 2:");
        String[] claves2 = agenda.Claves();
        for (int i = 0; i < claves2.length; i++) {
            System.out.println(claves2[i]);
        }
        //PRUEBA DICCIONARIO SINONIMOS
          DiccionariosMultiple sinonimos = new DiccionarioSinonimos();
          sinonimos.InicializarDiccionario();

          System.out.println("=== Prueba Diccionario de Sinónimos ===");

          System.out.println("Agregar Sinonimos");

          sinonimos.Agregar("feliz", "contento");
          sinonimos.Agregar("feliz", "alegre");
          sinonimos.Agregar("feliz", "satisfecho");

          sinonimos.Agregar("triste", "deprimido");
          sinonimos.Agregar("triste", "melancolico");

          System.out.println("Mostrar Palabras");
          System.out.println("\nPalabras en el diccionario:");
          String[] claves = sinonimos.Claves();
          for (int i = 0; i < claves.length; i++) {
              System.out.println(claves[i]);
          }

          System.out.println("Recuperar sinonimo Feliz");
          System.out.println("\nSinónimos de 'feliz':");
          String[] sinonimosFeliz = sinonimos.Recuperar("feliz");
          for (int i = 0; i < sinonimosFeliz.length; i++) {
              System.out.println("- " + sinonimosFeliz[i]);
          }

          System.out.println("Recuperar Sinonimos triste");
          System.out.println("\nSinónimos de 'triste':");
          String[] sinonimosTriste = sinonimos.Recuperar("triste");
          for (int i = 0; i < sinonimosTriste.length; i++) {
              System.out.println("- " + sinonimosTriste[i]);
          }

          System.out.println("Eliminamos triste");
          sinonimos.Eliminar("triste");

          System.out.println("Verificar eliminacion");
          System.out.println("\nDiccionario luego de eliminar 'triste':");
          String[] clavesFinal = sinonimos.Claves();
          for (int i = 0; i < clavesFinal.length; i++) {
              System.out.println(clavesFinal[i]);

            // PRUEBA PUNTAJE TORNEO

            PuntajeTorneo Puntajes = new PuntajeTorneo();

            Puntajes.InicializarDiccionario();

            String Jugador1 = "Jugador 1";
            String Jugador2 = "Jugador 2";

            int Puntaje1 = 500;
            int Puntaje2 = 350;

            Puntajes.Agregar(Jugador1, Puntaje1);
            Puntajes.Agregar(Jugador2, Puntaje2);

            System.out.println("\nEl jugador 1 tiene "+Puntajes.Recuperar(Jugador1)+" puntos y el jugador 2 tiene "+Puntajes.Recuperar(Jugador2)+" puntos.\n");

          }
    }
}