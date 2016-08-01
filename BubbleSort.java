/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadetrabajo3;

import java.util.List;

/**
 *
 * @author Joseline
 */
public class BubbleSort {

    
    public void bubbleSort(Lista lista) throws Exception {
        int len = lista.getLargo();
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < len - j; i++) {                                       
                if ((Integer)(lista.getValor(i)) > (Integer)(lista.getValor(i + 1))) {                          
                    tmp = (Integer)(lista.getValor(i));
                    lista.editForPosition(i,(Integer)(lista.getValor(i+1)));
                    lista.editForPosition((i+1),tmp);
                    swapped = true;
                }
            }                
        }
        System.out.println("Resultado del ordenamiento BubbleSort: "+((List<Integer>) lista));
    }
    
}
