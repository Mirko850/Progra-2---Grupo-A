package ImplementacionDiccionarios;

import Interfaces.Diccionarios;

public class AgendaContactos implements Diccionarios {

    private static final int MAX = 100;
    private String[] nombres;
    private String[] telefonos;
    private int cantidad;

    public void InicializarDiccionario() {
        nombres = new String[MAX];
        telefonos = new String[MAX];
        cantidad = 0;
    }

    public void Agregar(String nombre, String telefono) {
        int i = 0;

        while (i < cantidad && !nombres[i].equals(nombre)) i++;

        if (i < cantidad) {
            telefonos[i] = telefono;
        } else {
            nombres[cantidad] = nombre;
            telefonos[cantidad] = telefono;
            cantidad++;
        }
    }

    public void Eliminar(String nombre) {
        int i = 0;

        while (i < cantidad && !nombres[i].equals(nombre)) i++;

        if (i < cantidad) {
            nombres[i] = nombres[cantidad - 1];
            telefonos[i] = telefonos[cantidad - 1];
            cantidad--;
        }
    }

    public String[] Claves() {
        String[] aux = new String[cantidad];
        for (int i = 0; i < cantidad; i++) aux[i] = nombres[i];
        return aux;
    }

    public String Recuperar(String nombre) {
        int i = 0;
        while (i < cantidad && !nombres[i].equals(nombre)) i++;
        return (i < cantidad) ? telefonos[i] : null;
    }
}