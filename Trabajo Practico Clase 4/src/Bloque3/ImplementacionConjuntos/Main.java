public class Main {
    public static void main(){

        //Padron Electoral///////////////////

        int votante1 = 0;
        int votante2 = 1;

        ConjuntoTDA PadronElectoral = new ConjuntoEstatico();

        PadronElectoral.InicializarConjunto();
        //Votante 1 voto
        PadronElectoral.Agregar(votante1);
        //Votante 2 vota
        PadronElectoral.Agregar(votante2);
        //Votante 2 intenta votar de nuevo
        PadronElectoral.Agregar(votante2);
        //Votante 2 no va a aparecer porque la funcion agregar verifica la existencia del dato en el conjunto.

        //Invitados a la fiesta de fin de cursada/////////////////////////

        int Invitado1 = 0;
        int Invitado2 = 1;

        ConjuntoTDA ListaInvitados = new ConjuntoEstatico();

        ListaInvitados.InicializarConjunto();
        //Invitado1 es invitado
        ListaInvitados.Agregar(Invitado1);
        //Invitado2 es invitado
        ListaInvitados.Agregar(Invitado2);
        //Invitado2 es invitado de nuevo
        ListaInvitados.Agregar(Invitado2);
        //Invitado2 no va a aparecer porque la funcion agregar verifica la existencia del dato en el conjunto.
        //El conjunto no cambia de tamaño.

        //Filtro de spam(Blacklist)/////////////////////////

        String[] Mail  = {"Ganar","dinero","facil","..."};

        ConjuntoStrings PalabrasProhibidas = new ConjuntoStrings();

        PalabrasProhibidas.InicializarConjunto();
        //Cargamos las 3 palabras prohibidas
        PalabrasProhibidas.Agregar("Ganá");
        PalabrasProhibidas.Agregar("Crypto");
        PalabrasProhibidas.Agregar("Premio");

        boolean esSpam = false;
        for (String s : Mail){ if (esSpam==false) esSpam = PalabrasProhibidas.Pertenece(s);}
        //
        //Recorremos el array y si s es igual a una palabra prohibida el esSpam cambia a true osea que es spam.


        //Tags de un blog de ingenieria/////////////////////////

        ConjuntoStrings Tags = new ConjuntoStrings();

        //Agregamos los tags al conjunto
        Tags.Agregar("#Programacion");
        Tags.Agregar("#Java");
        Tags.Agregar("#OOP");

        //No usamos una pila porque no es necesario tener el mismo tag duplicado, no deberia afectar la funcionalidad del sistema.

        //Gestion de legajos/////////////////////////

        ConjuntoTDA Legajos = new ConjuntoEstatico();

        int Estudiante1 = 100;

        //Agregamos el legajo del estudiante al conjunto, asumiendo que se anoto a una carrera
        Legajos.Agregar(Estudiante1);
        //Volvemos a agregar el legajo del estudiante porque se inscribio en otra carrera
        Legajos.Agregar(Estudiante1);

        //El conjunto Legajos no lo agrega porque el estudiante ya tiene legajo aunque este en 2 carreras a la vez

        //Operacion elegir vs sacar/////////////////////////

        //Dependiendo como lo implementes, Elegir() puede agarrar una posicion especifica, por lo que entonces devuelve 2 veces el mismo elemento.
        //Si Elegir() agarra una posicion random puede devolver el mismo elemento o otro porque es aleatorio.

    }
}
