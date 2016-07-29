/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadetrabajo3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Joseline
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> numeros = new ArrayList<Integer>();
        BubbleSort bubble = new BubbleSort();
        String metodo2 = "";
        int numero;
        try {
            FileReader fr = new FileReader("C:\\Users\\Joseline\\Documents\\NetBeansProjects\\HojaDeTrabajo3\\src\\hojadetrabajo3\\MiLista.txt");
            BufferedReader br = new BufferedReader(fr);

            String linea;
                      
            while((linea = br.readLine()) != null){
                numero = Integer.parseInt(linea);
                numeros.add(numero);
            } metodo2 = String.valueOf(bubble.bubbleSort(numeros));
            fr.close();
            
            System.out.println("Resultado del ordenamiento BubbleSort: "+ metodo2);

        }
        catch(Exception e) {
           // System.out.println("Excepcion leyendo fichero "+ fichero + ": " + e);
            System.out.println("Error");
        }

    }
        
}
