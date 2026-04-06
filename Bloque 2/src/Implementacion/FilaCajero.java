package Implementacion;

import Interfaces.ColasPrioridad;

public class FilaCajero implements ColasPrioridad {
    private int[] valores;
    private int[] prioridades;
    private int cantidad;

    @Override
    public void InicializarCola() {
        valores = new int[100];
        prioridades = new int[100];
        cantidad = 0;
    }

    @Override
    public void AcolarPrioridad(int x, int prioridad) {
        valores[cantidad] = x;
        prioridades[cantidad] = prioridad;
        cantidad++;
    }

    @Override
    public void Desacolar() {
        int pos = 0;

        for (int i = 1; i < cantidad; i++) {
            if (prioridades[i] > prioridades[pos]) {
                pos = i;
            }
        }

        // aca reemplazo con el último
        valores[pos] = valores[cantidad - 1];
        prioridades[pos] = prioridades[cantidad - 1];

        cantidad--;
    }

    @Override
    public int Primero() {
        int pos = 0;

        for (int i = 1; i < cantidad; i++) {
            if (prioridades[i] > prioridades[pos]) {
                pos = i;
            }
        }

        return valores[pos];
    }

    @Override
    public int Prioridad() {
        int pos = 0;

        for (int i = 1; i < cantidad; i++) {
            if (prioridades[i] > prioridades[pos]) {
                pos = i;
            }
        }

        return prioridades[pos];
    }

    @Override
    public boolean ColaVacia() {
        return cantidad == 0;
    }

}

