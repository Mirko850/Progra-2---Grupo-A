package ImplementacionDiccionarios;

import Interfaces.Diccionarios;

import java.util.Objects;

public class PuntajeTorneo {

    private static final int MAX = 100;
    private String[] claves;
    private int[] valores;
    private int cantidad;

    public void InicializarDiccionario() {
        claves = new String[MAX];
        valores = new int[MAX];
        cantidad = 0;
    }

    public void Agregar(String clave, int valor) {
        int i = 0;

        while (i < cantidad && !Objects.equals(claves[i], clave)) {
            i++;
        }

        if (i < cantidad) {
            valores[i] = valor; // actualiza si la clave ya existe
        } else if (cantidad < MAX) {
            claves[cantidad] = clave;
            valores[cantidad] = valor;
            cantidad++;
        }
    }

    public void Eliminar(String clave) {
        int i = 0;

        while (i < cantidad && !Objects.equals(claves[i], clave)) {
            i++;
        }

        if (i < cantidad) {
            claves[i] = claves[cantidad - 1];
            valores[i] = valores[cantidad - 1];
            cantidad--;
        }
    }

    public String[] Claves() {
        String[] aux = new String[cantidad];
        for (int i = 0; i < cantidad; i++) {
            aux[i] = claves[i];
        }
        return aux;
    }

    public int Recuperar(String clave) {
        int posClave = buscarClave(clave);

        if (posClave == -1) {
            return 0;
        }

        int aux = valores[posClave];

        return aux;
    }
    private int buscarClave(String clave) {
        int i = 0;
        while (i < cantidad && claves[i] != clave) {
            i++;
        }

        if (i < cantidad) {
            return i;
        }
        return -1;
    }

    private int buscarValor(int posClave, int valor) {
        int i = 0;
        while (i < valores[posClave] && valores[posClave] != valor) {
            i++;
        }

        if (i <  valores[posClave]) {
            return i;
        }
        return -1;
    }

    private boolean existeValor(int posClave, int valor) {
        return buscarValor(posClave, valor) != -1;
    }
}
