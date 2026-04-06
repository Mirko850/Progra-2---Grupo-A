package Interfaces;

public interface DiccionariosMultiple {

    void InicializarDiccionario();
    void Agregar(String clave, String valor);
    void Eliminar(String clave);
    String[] Claves();
    String[] Recuperar(String clave);
}
