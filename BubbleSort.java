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

    
    public List<Integer> bubbleSort(List<Integer> lista) {
      boolean swapped = true;
      int j = 0;
      int tmp;
      while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < lista.size() - j; i++) {                                       
                  if (lista.get(i) > lista.get(i + 1)) {                          
                        tmp = lista.get(i);
                        lista.set((i),lista.get(i + 1));
                        lista.set((i+1),tmp);
                        swapped = true;
                  }
            }                
      }
        return lista;
}
    
}
