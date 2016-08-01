/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Didier
 */
public class BubbleSort {
  
      
public Lista bubbleSort(Lista lista) throws Exception {
               
                int n = lista.getLargo();
                int temp = 0;
               
                for(int i=0; i < n; i++){
                        for(int j=1; j < (n-i); j++){
                               
                                if((Integer)lista.getValor(j-1) > (Integer)lista.getValor(j)){
                                        //swap the elements!
                                        temp = (Integer)lista.getValor(j-1);
                                        lista.editForPosition(j-1, lista.getValor(j));
                                        lista.editForPosition(j,temp);
                                }
                               
                        }
                }
                return lista;
        }
}
      
  
