/* Algoritmos y Estructuras de Datos.
 * Nombres: Didier Salazar, 15487. Raul de Leon, Michelle Morales, Joselin Ortiz.
 * Lista.java ... Clase necesaria para crear una lista.
 * 
 */
package Archivos;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Didier Salazar, 15487. Raul de Leon, Michelle Morales, Joselin Ortiz.
 * @param <T> Nodo de la lista, valor.
 */
public class Lista<T> {

    private Nodo Cabeza; //Cabeza de la lista.
    private int Largo=0; //Tamaño de la lista.
      
    /**
     * Metodo constructor de la clase lista.
     */
    public void Lista(){
        Cabeza = null;
        Largo = 0;
    }
 
    /**
     *
     * @return Devuelve la cabeza, si esta vacia.
     */
    public boolean isEmpty(){
        return Cabeza == null;
    }
    
    /**
     *
     * @return Devuelve el tamaño de la lista.
     */
    public int getLargo(){
        return Largo;
    }
    
    /**
     *Metodo que agrega un valor al final de la lista.
     * @param valor Se pasa como parametro el valor el cual se agregara a la lista.
     */
    public void aggFinal(Comparable valor){
        // Define y agrega el valor a un nuevo nodo.
        Nodo nuevo = new Nodo(valor);
        
        //Valida si esta vacia el nodo de inicio.
        if (isEmpty()) {
            // Si esta vacia la cabeza, agrega el nodo actual como la nueva cabeza.
            Cabeza = nuevo;
        //De no estar vacia, recorre toda la lista hasta encontrar un nodo vacio y lo agrega.
        } else{
            // Se crea un backup de la lista.
            Nodo fin = Cabeza;
            // La lista se moviliza hasta llegar al ultimo nodo.
            while(fin.getSiguiente() != null){
                fin = fin.getSiguiente();
            }
            //Se agrega dicho nodo hasta la finalización de la lista.
            fin.setSiguiente(nuevo);
        }
        //El tamaño de la lista aumenta por una unidad.
        Largo++;
    }
     
   
    /**
     * Metodo que devuelve cierto valor de la posicion ingresada de la lista.
     * @param posicion Se pasa como parametro la posicion de la lista de donde queremos sacar el valor.
     * @return Devuelve cierto valor de la posicion ingresada de la lista.
     * @throws Exception
     */
    public Comparable getValor(int posicion) throws Exception{
        //Se valida si la posicion ingresada es valida, si no excede del tamaño de la lista.
        if(posicion>=0 && posicion<Largo){
            //Chequea si la posicion es cero (inicio de la lista).
            if (posicion == 0) {
                //Devuelve la cabeza de la lista.
                return Cabeza.getValor();
            }else{
                //Se crea un backup de la lista.
                Nodo ini = Cabeza;
                //Se realiza un recorrido para toda la lista hasta llegar a la posicion ingresada.
                for (int i = 0; i < posicion; i++) {
                    ini = ini.getSiguiente();
                }
                //Devuelve el valor del nodo encontrado tras el recorrido.
                return ini.getValor();
            }
        //Si no se encuentra la posicion en la lista (excede los limites) devuelve dicho error.
        } else {
            throw new Exception("No existe tal posición ingresada.");
        }
    }    
}
        

