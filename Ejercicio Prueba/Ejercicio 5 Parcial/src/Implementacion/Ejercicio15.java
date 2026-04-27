package Implementacion;

import Interfaces.DiccionarioSimpleTDA;
import Interfaces.PilaTDA;

import java.util.Arrays;

public class Ejercicio15{

    public void frecuencias(PilaTDA p, DiccionarioSimpleTDA dic){

        //Implementá un método externo estático frecuencias(PilaTDA p, DicSimpleTDA d) que, dada una pila p,
//construya en d un Diccionario Simple donde cada clave es un valor que aparece en la pila y el valor
// asociado es la cantidad de veces que ese valor aparece. La pila p debe quedar intacta al terminar. [10 pts]

//metodo llamado frecuencia que recibe una pila y un diccionario simple
//creamos un array de repetidos
// recorremos la pila y preguntamos si el valor del tope ya existe en el diccionario, si no lo agrega
// y el valor es 1. si ya existe busca esa clave y le suma 1 al valor. Luego el valor lo apilas en una pila
// auxiliar y desapilamos de la original. luego apilar todo lo de la auxiliar a la original y desapilar



        PilaTDA pilaRepetidos = new PilaEstaticaEstrategia1();

        while(!p.PilaVacia()){
            if(Arrays.asList(pilaRepetidos).contains(p.Tope())){
                pilaRepetidos.Apilar(p.Tope());
            }
            else pilaRepetidos.Apilar(p.Tope());



        }




    }
}
