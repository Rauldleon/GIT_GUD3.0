/* Algoritmos y Estructuras de Datos.
 * Nombres: Didier Salazar, 15487. Raul de Leon, Michelle Morales, Joselin Ortiz.
 * Lista.java ... Clase necesaria para crear una lista.
 * 
 */
package Archivos;

import java.util.List;
import java.util.Random;
/**
 *
 * @author Didier Salazar, 15487. Raul de Leon, Michelle Morales, Joselin Ortiz.
 */
public class NewMain {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Archivos a = new Archivos();
        String linea=" ";
        int cont=0;
        Random  rand = new Random();
        String cadenaNumRand="";
        while(cont<10){
            cadenaNumRand+=(String.valueOf(rand.nextInt(2000))+" ");
            cont++;
        }
        a.escribirArchivos("C:\\Users\\Didier\\Desktop\\Hoja de trabajo3\\src\\Archivos\\datos.txt", cadenaNumRand);
        linea=(a.leerArchivos("C:\\Users\\Didier\\Desktop\\Hoja de trabajo3\\src\\Archivos\\datos.txt"));
        String numArray[] = linea.split(" ");
        cont=0;
        Comparable numbers[]=new Comparable [numArray.length];
        while(cont<numArray.length){
            numbers[cont]=Integer.parseInt(numArray[cont]);
            cont++;
        }
        cont=0;
        Lista listNumbers=new Lista();
        while(cont<numbers.length){
            listNumbers.aggFinal(numbers[cont]);
            cont++;
        }
        MergeSort merge=new MergeSort(listNumbers);
        QuickSort quick=new QuickSort(listNumbers);
        
        merge.mergeSort();
        quick.quicksort(quick.getArray(), quick.getIzq(), quick.getDer());
        cont=0;
        System.out.println("Numeros ordenados por MergeSort: \n");
        while(cont<merge.getList().getLargo()){
            System.out.println(merge.getList().getValor(cont));
            cont++;
        }
        cont=0;
        System.out.println("Numeros ordenados por QuickSort: \n");
        while(cont<quick.getList().getLargo()){
            System.out.println(quick.getList().getValor(cont));
            cont++;
        }
        
    }
    
}
