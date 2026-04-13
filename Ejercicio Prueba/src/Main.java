import Implementacion.ColaDinamica;
import Implementacion.PilaDinamica;
import Implementacion.PilaEstaticaEstrategia1;
import Interfaces.ColaTDA;
import Interfaces.PilaTDA;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PilaTDA pila = new PilaEstaticaEstrategia1();
        ColaTDA cola = new ColaDinamica();
        PilaTDA pilaDinamica = new PilaDinamica();

        ///Iniciamos una cola y una pila
        pila.InicializarPila();
        cola.InicializarCola();
        pilaDinamica.InicializarPila();

        pila.Apilar(1);
        pila.Apilar(2);
        pila.Apilar(3);
        pila.Apilar(4);
        pila.Apilar(5);
        //Tenemos 5 elementos en la pila

        //Pasamos a una cola dinamica
        while(!pila.PilaVacia()){
            cola.Acolar(pila.Tope());
            System.out.println("Estoy sacando " + pila.Tope());
            pila.Desapilar();

        }

        //Pasamos a una pila dinamica invertida
        while (!cola.ColaVacia()){
            pilaDinamica.Apilar(cola.Primero());
            System.out.println("Esta ingresando a pila invertida " + cola.Primero());
            cola.Desacolar();
        }
        //  Mostrar resultado
        while (!pilaDinamica.PilaVacia()) {
            System.out.println(pilaDinamica.Tope());
            pilaDinamica.Desapilar();
        }


    }
}