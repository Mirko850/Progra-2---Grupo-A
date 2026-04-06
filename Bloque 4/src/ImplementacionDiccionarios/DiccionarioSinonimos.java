package ImplementacionDiccionarios;
import Interfaces.DiccionariosMultiple;

public class DiccionarioSinonimos implements DiccionariosMultiple {

    private static final int MAX = 100;
    private String[] palabras;
    private String[][] sinonimos;
    private int[] cant;
    private int cantidad;

    public void InicializarDiccionario() {
        palabras = new String[MAX];
        sinonimos = new String[MAX][MAX];
        cant = new int[MAX];
        cantidad = 0;
    }

    public void Agregar(String palabra, String sinonimo) {
        int i = 0;

        while (i < cantidad && !palabras[i].equals(palabra)) i++;

        if (i == cantidad) {
            palabras[cantidad] = palabra;
            sinonimos[cantidad][0] = sinonimo;
            cant[cantidad] = 1;
            cantidad++;
        } else {
            sinonimos[i][cant[i]] = sinonimo;
            cant[i]++;
        }
    }

    public void Eliminar(String palabra) {
        int i = 0;

        while (i < cantidad && !palabras[i].equals(palabra)) i++;

        if (i < cantidad) {
            palabras[i] = palabras[cantidad - 1];
            cant[i] = cant[cantidad - 1];
            cantidad--;
        }
    }

    public String[] Claves() {
        String[] aux = new String[cantidad];
        for (int i = 0; i < cantidad; i++) aux[i] = palabras[i];
        return aux;
    }

    public String[] Recuperar(String palabra) {
        int i = 0;
        while (i < cantidad && !palabras[i].equals(palabra)) i++;

        if (i == cantidad) return new String[0];

        String[] aux = new String[cant[i]];
        for (int j = 0; j < cant[i]; j++) aux[j] = sinonimos[i][j];
        return aux;
    }
}