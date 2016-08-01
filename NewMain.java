/* Algoritmos y Estructuras de Datos.
 * Nombres: Didier Salazar, 15487. Raul de Leon, Michelle Morales, Joselin Ortiz.
 * NewMain.java ... Clase principal del programa.
 * 
 */


import java.util.List;
import java.util.Random;
import java.util.Scanner;
/**
 * Clase principal del programa.
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
        while(cont<2000){
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
        
        
        cont=0;
        Scanner sc = new Scanner(System.in);
        int op=0;
        boolean salir=false;
        while (salir==false){
        System.out.println("\n\n¿Con cual tipo de sorting desea ordenar los numeros de una lista creada aleatoriamente? \n");
        System.out.println("1. BubleSorting");
        System.out.println("2. InsertionSorting");
        System.out.println("3. QuickSorting");
        System.out.println("4. MergeSorting");
        System.out.println("5. Salir del Programa");
        op=sc.nextInt();
        if(op==1){
            BubbleSort bubble= new BubbleSort();
            cont=0;
            System.out.println("Numeros ordenados por BubbleSort: \n");
            Lista lis=new Lista();
            lis=bubble.bubbleSort(listNumbers);
            while(cont<listNumbers.getLargo()){
            System.out.println(lis.getValor(cont));
            cont++;
        }
        }
        else if(op==2){
            InsertionSort insert=new InsertionSort();
            cont=0;
            System.out.println("Numeros ordenados por InsertSort: \n");
            Lista lis=new Lista();
            lis=insert.insertionSort(listNumbers);
            while(cont<listNumbers.getLargo()){
            System.out.println(lis.getValor(cont));
            cont++;
        } 
        }
        else if(op==3){
            QuickSort quick=new QuickSort(listNumbers);
        quick.quicksort(quick.getArray(), 0, listNumbers.getLargo()-1);
           cont=0;
        System.out.println("Numeros ordenados por QuickSort: \n");
        while(cont<quick.getList().getLargo()){
            System.out.println(quick.getList().getValor(cont));
            cont++;
        } 
        }
        else if(op==4){
            cont=0;
            MergeSort merge=new MergeSort(listNumbers);
            merge.mergeSort();
        System.out.println("Numeros ordenados por MergeSort: \n");
        while(cont<merge.getList().getLargo()){
            System.out.println(merge.getList().getValor(cont));
            cont++;
        }
        }
        else if(op==5){
            System.out.println("Gracias por utilizar el programa...\n");
            salir=true;
        }
        else{
            System.out.println("ERROR, el numero que usted ingresó no está dentro de las opciones...\n");
        }
        
        
    }
        }
}
