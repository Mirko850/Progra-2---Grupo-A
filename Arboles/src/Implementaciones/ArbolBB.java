package Implementaciones;

public class ArbolBB {
    private NodoABB nodo;

    public void agregarElem(int x) {
        if (nodo == null) {
            nodo = new NodoABB();
            nodo.info = x;
            nodo.HijoIzq = new ArbolBB(); // Crea subárbol vacío
            nodo.HijoDer = new ArbolBB(); // Crea subárbol vacío
        } else if (nodo.info > x) {
            nodo.HijoIzq.agregarElem(x); // Delega a la izquierda
        } else if (nodo.info < x) {
            nodo.HijoDer.agregarElem(x); // Delega a la derecha
        }
    }
}