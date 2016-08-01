/* Algoritmos y Estructuras de Datos.
 * Nombres: Didier Salazar, 15487. Raul de Leon, Michelle Morales, Joselin Ortiz.
 * Nodo.java ... Clase necesaria para implementar un nodo en una lista.
 * 
 */


/**
 *Clase necesaria para implementar un nodo en una lista.
* @author Didier Salazar, 15487. Raul de Leon, Michelle Morales, Joselin Ortiz.
 * @param <T> Objeto generico que extiende de la clase comparable.
 */
public class Nodo<T extends Comparable>
{
    private T Valor; //Objeto generico del valor del nodo.
    
    private Nodo Siguiente; //Referencia al nodo siguiente.
    
    /**
     *Metodo que crea un nodo.
     * @param valor Valor del nodo.
     */
    public Nodo(T valor)
    {
        this.Valor = valor;
       
    }
    
    /**
     *Metodo que setea un nodo.
     * @param valor Valor del nodo.
     */
    public void setValor(T valor)
    {
        this.Valor = valor;
    }
    
    /**
     *Metodo que regresa el valor de un nodo.
     * @return Valor de un nodo.
     */
    public T getValor()
    {
        return this.Valor;
    }    
    
    /**
     * Metodo que setea la referencia al siguiente nodo.
     * @param siguiente Referencia al siguiente noto.
     */
    public void setSiguiente(Nodo siguiente)
    {
        this.Siguiente = siguiente;
    }
    
    /**
     * Metodo que devuelve la referencia del siguiente nodo.
     * @return Devuelve la referencia del siguiente nodo.
     */
    public Nodo getSiguiente()
    {
        return this.Siguiente;
    }
    
    @Override
    public String toString()
    {
        return  Valor.toString();
    }
    
    /**
     * Metodo que compara valores de nodos.
     * @param other valor de un nodo.
     * @return El compare to con el nodo actual.
     */
    public int compareTo(T other)
    {
        return Valor.compareTo(other);
    }

}
