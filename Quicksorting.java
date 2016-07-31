

/* @autor Michelle
 * 
 */
public class Quicksorting {
	public static void quicksort(Comparable Array[], int izq, int der) {

		  int pivote= (Integer) Array[izq];
		  int i=izq; // busqueda izquierda-derecha
		  int j=der; // busqueda derecha-izquierda
		  int aux;
		 
		  while(i<j){            
		     while((Integer)Array[i]<=pivote && i<j) i++; 
		     while((Integer)Array[j]>pivote) j--;         
		     if (i<j) {                                           
		         aux= (Integer) Array[i];                  
		         Array[i]=Array[j];
		         Array[j]=aux;
		     }
		   }
		  // Los números menores al pivote se ordenan a la izquierda y los mayores a él a la derecha
		   Array[izq]=Array[j]; 
		   Array[j]=pivote; 
		   if(izq<j-1)
		      quicksort(Array,izq,j-1); // Subarray izquierda se ordena
		   if(j+1 <der)
		      quicksort(Array,j+1,der); // Sub. derecho se ordena
	}
}


