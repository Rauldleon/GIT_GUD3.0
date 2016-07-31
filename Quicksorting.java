/**
 * 
 * @author Michelle
 *
 */
public class Quicksorting {
	/**
	 * El método ordena un array de enteros comparables de izquierda a derceha
	 * @param Array Recibe un array de números enteros
	 * @param izq recibe los valores izq = 0
	 * @param der recibe los valores der = número de elementos - 1
	 */
		public static void quicksort(Comparable Array[], int izq, int der) {
			
			/**
			 * Pivote es el primer elemento del array
			 * i realiza la búsqueda de izquierda a derecha
			 * j hace una búsqueda de derecha a izquierda
			 */
			  int pivote= (Integer) Array[izq];
			  int i=izq; // busqueda izquierda-derecha
			  int j=der; // busqueda derecha-izquierda
			  int aux;
			 /**
			  * Mientras no se hayan cruzado ambas búsquedas (i & j), siguen buscándose el elemento menor y mayor
			  * ya si no se han cruzado aún, estos se intercambian
			  */
			  while(i<j){            
			     while((Integer)Array[i]<=pivote && i<j) i++; 
			     while((Integer)Array[j]>pivote) j--;         
			     if (i<j) {                                           
			         aux= (Integer) Array[i];                  
			         Array[i]=Array[j];
			         Array[j]=aux;
			     }
			   }
			  /**
			   * Los números menores al pivotede ordenan a la izq y los mayores a la der
			   */
			  
			   Array[izq]=Array[j]; 
			   Array[j]=pivote; 
			   
			   /**
			    * Ambos subarrays (izq y der) se ordenan
			    */
			   if(izq<j-1)
			      quicksort(Array,izq,j-1);
			   if(j+1 <der)
			      quicksort(Array,j+1,der);
		}
	}
