package Bloque2;

public class EjerciciosBloque2 {

    public static void main(String[] args) {
        buffetDeLaFacultad();
        embarqueDeAerolineas();
        distribucionDeTicketsIT();
    }

    public static void buffetDeLaFacultad() {
        String[] cola = new String[10];
        int fin = 0;

        cola[fin] = "Ana";
        fin++;

        cola[fin] = "Bruno";
        fin++;

        cola[fin] = "Carla";
        fin++;

        cola[fin] = "VibeCoder";
        fin++;

        System.out.println("Buffet de la Facultad");

        for (int i = 0; i < fin; i++) {
            System.out.println(cola[i]);
        }

        System.out.println();
    }

    public static void embarqueDeAerolineas() {
        String[] nombres = {"Lucas", "Maria", "Pedro", "Sofia", "Elena"};
        int[] prioridades = {1, 3, 2, 2, 3};
        int[] llegada = {1, 2, 3, 4, 5};
        boolean[] usado = {false, false, false, false, false};

        System.out.println("Embarque de Aerolineas");

        for (int turno = 0; turno < nombres.length; turno++) {
            int mejor = -1;

            for (int i = 0; i < nombres.length; i++) {
                if (!usado[i]) {
                    if (mejor == -1) {
                        mejor = i;
                    } else {
                        if (prioridades[i] > prioridades[mejor]) {
                            mejor = i;
                        } else if (prioridades[i] == prioridades[mejor]) {
                            if (llegada[i] < llegada[mejor]) {
                                mejor = i;
                            }
                        }
                    }
                }
            }

            usado[mejor] = true;
            System.out.println(nombres[mejor] + " " + prioridades[mejor]);
        }

        System.out.println();
    }

    public static void distribucionDeTicketsIT() {
        String[] tickets = {
                "No me gusta el fondo de pantalla",
                "No anda la impresora",
                "Se cayo internet en un sector",
                "Se rompio el servidor principal"
        };

        int[] prioridades = {0, 20, 100, 999};
        boolean[] usado = {false, false, false, false};

        System.out.println("Distribucion de Tickets IT");

        for (int turno = 0; turno < tickets.length; turno++) {
            int mejor = -1;

            for (int i = 0; i < tickets.length; i++) {
                if (!usado[i]) {
                    if (mejor == -1 || prioridades[i] > prioridades[mejor]) {
                        mejor = i;
                    }
                }
            }

            usado[mejor] = true;
            System.out.println(tickets[mejor] + " " + prioridades[mejor]);
        }
    }
}