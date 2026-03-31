package Bloque4.Interfaces;

public interface DiccionariosMultiple {
    void InicializarDiccionario();
    void Agregar(int clave, int valor);
    void EliminarValor(int clave, int valor);
    void Eliminar(int clave);
    int[] Recuperar(int clave);
    int[] Claves();
}
