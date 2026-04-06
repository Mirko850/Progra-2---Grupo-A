package ImplementacionDiccionarios;

import Interfaces.Diccionarios;

public class AgendaContactos implements Diccionarios {

    private static final int MAX = 100;
    private int[] nombres;
    private int[] telefonos;
    private int cantidad;

    @Override
    public void InicializarDiccionario() {
        nombres = new int[MAX];
        telefonos = new int[MAX];
        cantidad = 0;
    }

    @Override
    public void Agregar(int nombre, int telefono) {
        int i = 0;

        while (i < cantidad && nombres[i] != nombre) {
            i++;
        }

        if (i < cantidad) {
            telefonos[i] = telefono; // actualiza si la clave ya existe
            System.out.println("El contacto ya existe, se actualizara su telefono");
        } else if (cantidad < MAX) {
            nombres[cantidad] = nombre;
            telefonos[cantidad] = telefono;
            cantidad++;
        }
    }


    @Override
    public void Eliminar(int nombre) {
        int i = 0;

        while (i < cantidad && nombres[i] != nombre) {
            i++;
        }

        if (i < cantidad) {
            nombres[i] = nombres[cantidad - 1];
            telefonos[i] = telefonos[cantidad - 1];
            cantidad--;
        }
        System.out.println("Elimiaste el contacto " + nombre);
    }

    @Override
    public int[] Claves() {
        int[] aux = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            aux[i] = nombres[i];
        }
        return aux;
    }
}
