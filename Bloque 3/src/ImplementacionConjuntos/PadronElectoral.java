package ImplementacionConjuntos;

import Interfaces.ConjuntoTDA;

public class PadronElectoral implements ConjuntoTDA {

    private static final int MAX = 100;
    private String[] datos;
    private int cantidad;

    @Override
    public void InicializarConjunto() {
        datos = new String[MAX];
        cantidad = 0;
    }

    @Override
    public void Agregar(String x) {
        if (cantidad < MAX && !Pertenece(x)) {
            datos[cantidad] = x;
            cantidad++;
        }
    }

    @Override
    public void Sacar(String x) {
        int i = 0;

        while (i < cantidad && datos[i].equals(x)) {
            i++;
        }

        if (i < cantidad) {
            datos[i] = datos[cantidad - 1];
            cantidad--;
        }
    }

    @Override
    public boolean ConjuntoVacio() {
        return cantidad == 0;
    }

    @Override
    public boolean Pertenece(String x) {
        int i = 0;
        while (i < cantidad) {
            if (datos[i].equals(x)) {
                return true;
            }
            i++;
        }
        return false;
    }

    @Override
    public String Elegir() { // <--- Cambia 'int' por 'String'
        if (cantidad > 0) {
            return datos[cantidad - 1]; // Devolvemos el último elemento guardado
        }
        return null; // O un mensaje de error si el conjunto está vacío
    }
}
