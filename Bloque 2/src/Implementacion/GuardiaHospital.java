package Implementacion;

import Interfaces.ColasPrioridad;

public class GuardiaHospital implements ColasPrioridad {

    private int[] pacientes;
    private int[] prioridades;
    private int cantidad;

    @Override
    public void InicializarCola() {
        pacientes = new int[100];
        prioridades = new int[100];
        cantidad = 0;
    }

    @Override
    public void AcolarPrioridad(int paciente, int prioridad) {
        pacientes[cantidad] = paciente;
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

        pacientes[pos] = pacientes[cantidad - 1];
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

        return pacientes[pos];
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