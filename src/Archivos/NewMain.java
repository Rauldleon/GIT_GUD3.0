/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.util.List;
import java.util.Random;
/**
 *
 * @author OscarIvan
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Archivos a = new Archivos();
        String linea=" ";
        int cont=0;
        Random  rand = new Random();
        String cadenaNumRand="";
        while(cont<20){
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
        merge.mergeSort();
        cont=0;
        System.out.println("Numeros ordenados por MergeSort: /n");
        while(cont<merge.getList().getLargo()){
            System.out.println(merge.getList().getValor(cont));
            cont++;
        }
        
    }
    
}
