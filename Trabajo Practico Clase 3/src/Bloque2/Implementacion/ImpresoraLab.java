package Bloque2.Implementacion;

import Bloque2.Interfaces.Colas;

public class ImpresoraLab implements Colas {

    private int[] cola;
    private int inicio;
    private int fin;

    @Override
    public void InicializarCola() {
        cola = new int[100];
        inicio = 0;
        fin = 0;
    }

    @Override
    public void Acolar(int x) {
        cola[fin] = x;
        fin++;
    }

    @Override
    public void Desacolar() {
        if (!ColaVacia()) {
            inicio++;
        }
    }

    @Override
    public int Primero() {
        if (!ColaVacia()) {
            return cola[inicio];
        }
        return -1;
    }

    @Override
    public boolean ColaVacia() {
        return inicio == fin;
    }
}
