/* Algoritmos y Estructuras de Datos.
 * Nombres: Didier Salazar, 15487. Raul de Leon, Michelle Morales, Joselin Ortiz.
 * Lista.java ... Clase necesaria para crear una lista.
 * 
 */
package Archivos;

/**
 *
 * @author Didier
 * @param <T>
 */
public class Nodo<T extends Comparable>
{
    private T Valor;
    
    private Nodo Siguiente;
    
    /**
     *
     * @param valor
     */
    public Nodo(T valor)
    {
        this.Valor = valor;
       
    }
    
    /**
     *
     * @param valor
     */
    public void setValor(T valor)
    {
        this.Valor = valor;
    }
    
    /**
     *
     * @return
     */
    public T getValor()
    {
        return this.Valor;
    }    
    
    /**
     *
     * @param siguiente
     */
    public void setSiguiente(Nodo siguiente)
    {
        this.Siguiente = siguiente;
    }
    
    /**
     *
     * @return
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
     *
     * @param other
     * @return
     */
    public int compareTo(T other)
    {
        return Valor.compareTo(other);
    }

}
