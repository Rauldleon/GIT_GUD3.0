/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author OscarIvan
 */
public class Lista<T> {

    Nodo Cabeza;
    int Largo=0;
      
   public void Lista(){
        Cabeza = null;
        Largo = 0;
    }
 
    public boolean isEmpty(){
        return Cabeza == null;
    }
    
    public int getLargo(){
        return Largo;
    }
    
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
     
    public void aggInicio(Comparable valor){
        // Define y agrega el valor a un nuevo nodo.
        Nodo nuevo = new Nodo(valor);
        
        //Valida si esta vacia el nodo de inicio.
        if (isEmpty()) {
            // Si esta vacia la cabeza, agrega el nodo actual como la nueva cabeza.
            Cabeza = nuevo;
        // De no serlo, agrega dicho nodo al principio de la lista.
        } else{
            //Enlaza dicho nodo con la lista latente.
            nuevo.setSiguiente(Cabeza);
            //Cambia el nombre del nodo como la cabeza de la lista.
            Cabeza = nuevo;
        }
        //El tamaño de la lista aumenta por una unidad.
        Largo++;
    }

    
    public void insertForPosition(int posicion, Comparable valor){
        // Verifica si la posición ingresada se encuentre en el rango
        // >= 0 y <= que el numero de elementos del la lista.
        if(posicion>=0 && posicion<=Largo){
            Nodo nuevo = new Nodo(valor);
            
            // Consulta si el nuevo nodo a ingresar va al inicio de la lista.
            if(posicion == 0){
                // Inserta el nuevo nodo al inicio de la lista.
                nuevo.setSiguiente(Cabeza);
                Cabeza = nuevo;
            }
            else{
                // Si el nodo a inserta va al final de la lista.
                if(posicion == Largo){
                    Nodo fin = Cabeza;
                    // Recorre la lista hasta llegar al ultimo nodo.
                    while(fin.getSiguiente() != null){
                        fin = fin.getSiguiente();
                    }
                    // Inserta el nuevo nodo despues de del ultimo.
                    fin.setSiguiente(nuevo);              
                }
                else{
                    // Si el nodo a insertar va en el medio de la lista.
                    Nodo ini = Cabeza;
                    // Recorre la lista hasta llegar al nodo anterior
                    // a la posicion en la cual se insertara el nuevo nodo.
                    for (int i = 0; i < (posicion-1); i++) {
                        ini = ini.getSiguiente();
                    }
                    // Guarda el nodo siguiente al nodo en la posición
                    // en la cual va a insertar el nevo nodo.
                    Nodo siguiente = ini.getSiguiente();
                    // Inserta el nuevo nodo en la posición indicada.
                    ini.setSiguiente(nuevo);
                    // Une el nuevo nodo con el resto de la lista.
                    nuevo.setSiguiente(siguiente);
                }
            }
            // Incrementa el contador de tamaño de la lista.
            Largo++;
        }
    }
    /**
     * Obtiene el valor de un nodo en una determinada posición.
     * @param posicion del nodo que se desea obtener su valor.
     * @return un numero entero entre [0,n-1] n = numero de nodos de la lista.
     * @throws Exception
     */
    public Comparable getValor(int posicion) throws Exception{
        // Verifica si la posición ingresada se encuentre en el rango
        // >= 0 y < que el numero de elementos del la lista.
        if(posicion>=0 && posicion<Largo){
            // Consulta si la posicion es el inicio de la lista.
            if (posicion == 0) {
                // Retorna el valor del inicio de la lista.
                return Cabeza.getValor();
            }else{
                // Crea una copia de la lista.
                Nodo ini = Cabeza;
                // Recorre la lista hasta la posición ingresada.
                for (int i = 0; i < posicion; i++) {
                    ini = ini.getSiguiente();
                }
                // Retorna el valor del nodo.
                return ini.getValor();
            }
        // Crea una excepción de Posicion inexistente en la lista.
        } else {
            throw new Exception("Posicion inexistente en la lista.");
        }
    }

    /**
     * Actualiza el valor de un nodo que se encuentre en la lista ubicado
     * por su posición.
     * @param posicion en la cual se encuentra el nodo a actualizar.
     * @param valor nuevo valor para el nodo.
     */
    public void editForPosition(int posicion , Comparable valor){
        // Verifica si la posición ingresada se encuentre en el rango
        // >= 0 y < que el numero de elementos del la lista.
        if(posicion>=0 && posicion<Largo){
            // Consulta si el nodo a eliminar es el primero.
            if(posicion == 0){
                // Alctualiza el valor delprimer nodo.
                Cabeza.setValor(valor);
            }
            else{
                // En caso que el nodo a eliminar este por el medio 
                // o sea el ultimo
                Nodo fin = Cabeza;
                // Recorre la lista hasta lleger al nodo anterior al eliminar.
                for (int i = 0; i < posicion; i++) {
                    fin = fin.getSiguiente();
                }
                // Actualiza el valor del nodo.
                fin.setValor(valor);
            }
        }
    }
    
}
        

