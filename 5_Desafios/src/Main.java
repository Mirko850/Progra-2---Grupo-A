import Implementaciones.*;
import Interfaces.ColaTDA;
import Interfaces.PilaTDA;

import Implementaciones.ColaDinamica;
import Implementaciones.PilaDinamica;
import Interfaces.ColaTDA;
import Interfaces.PilaTDA;

public class Main {

    public static void main(String[] args) {
        ColaTDA miCola = new ColaDinamica();
        miCola.InicializarCola();

        // Cargamos datos de prueba: 1001
        miCola.Acolar(1);
        miCola.Acolar(0);
        miCola.Acolar(0);
        miCola.Acolar(1);

        if (esPalindrome(miCola)) {
            System.out.println("Es palindrome");
        } else {
            System.out.println("No es palindrome");
        }
    }

    ///////////////////////// EJERCICIO 1 ////////////////////////////////
    public static boolean esPalindrome(ColaTDA colaOriginal) {
        ColaTDA colaAux = new ColaDinamica();
        PilaTDA pilaAux = new PilaDinamica();

        colaAux.InicializarCola();
        pilaAux.InicializarPila();

        boolean flag = true;

        while (!colaOriginal.ColaVacia()) {
            int x = colaOriginal.Primero();
            pilaAux.Apilar(x);
            colaAux.Acolar(x);
            colaOriginal.Desacolar();
        }

        while (!colaAux.ColaVacia()) {
            if (colaAux.Primero() != pilaAux.Tope()) {
                flag = false;
            }
            colaOriginal.Acolar(colaAux.Primero());

            colaAux.Desacolar();
            pilaAux.Desapilar();
        }

        return flag;
    }
    /////////////// EJERECICIO 2 ////////////////////////

    public static int contarPrioridad(ColaTDA original, int pBuscada) {
        ColaTDA aux = new ColaPrioridadDinamica();
        aux.InicializarCola();
        int contador = 0;

        while (!original.ColaVacia()) {
            int valor = original.Primero();
            int prioridad = original.Prioridad();

            if (prioridad == pBuscada) {
                contador++;
            }

            aux.AcolarPrioridad(valor, prioridad);
            original.Desacolar();
        }

        while (!aux.ColaVacia()) {
            original.AcolarPrioridad(aux.Primero(), aux.Prioridad());
            aux.Desacolar();
        }

        return contador;
    }

    //////// EJERCICIO 3 /////////

    public boolean pilaQueNoMiente(PilaTDA pila) {
        PilaTDA pilaAux = new PilaDinamica();
        pilaAux.InicializarPila();
        ConjuntoTDA conjunto = new ConjuntoDinamica();
        conjunto.InicializarConjunto();

        boolean tieneRepetidos = false;

        while (!pila.PilaVacia()) {
            int value = pila.Tope();

            if (conjunto.Pertenece(value)) {
                tieneRepetidos = true;
            }

            conjunto.Agregar(value);
            pilaAux.Apilar(value);
            pila.Desapilar();
        }

        while (!pilaAux.PilaVacia()) {
            pila.Apilar(pilaAux.Tope());
            pilaAux.Desapilar();
        }

        return tieneRepetidos;
    }



    /// ////////////EJERCICIO 4////////////////////////
    public ConjuntoTDA diferenciaSimetrica(ConjuntoTDA cA, ConjuntoTDA cB) {
        ConjuntoTDA resultado = new ConjuntoDinamico();
        resultado.InicializarConjunto();

        ConjuntoTDA cAuxiliar = new ConjuntoDinamico();
        resultado.InicializarConjunto();
        cAuxiliar.InicializarConjunto();

        while (!cA.ConjuntoVacio()) {
            int elemento = cA.Elegir();
            if (!cB.Pertenece(elemento)) {
                resultado.Agregar(elemento);
            }
            cAuxiliar.Agregar(elemento)
            cA.Sacar(elemento);
        }

        while (!cB.ConjuntoVacio()) {
            int elemento = cB.Elegir();
            if (!cAuxiliar.Pertenece(elemento)) {
                resultado.Agregar(elemento);
            }
            auxB.Sacar(elemento);
        }

        return resultado;
    }
////////////EJERCICIO 5 /////////////////////

public ColaTDA colaOrdenaSola(ColaTDA colaOriginal) {

    ColaPrioridadTDA cp = new ColaPrioridadDinamica();
    cp.InicializarColaPrioridad();

    while (!colaOriginal.ColaVacia()) {
        int x = colaOriginal.Primero();

        if (x > 0) {
            cp.AcolarPrioridad(x, 2);
        } else if (x == 0) {
            cp.AcolarPrioridad(x, 1);
        } else {
            cp.AcolarPrioridad(x, 0);
        }

        colaOriginal.Desacolar();
    }

    ColaTDA ordenada = new ColaDinamica();
    ordenada.InicializarCola();

    while (!cp.ColaVacia()) {
        ordenada.Acolar(cp.Primero());
        cp.Desacolar();
    }

    return ordenada;
}











}