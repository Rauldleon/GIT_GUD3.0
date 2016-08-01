/* Algoritmos y Estructuras de Datos.
 * Nombres: Didier Salazar, 15487. Raul de Leon, Michelle Morales, Joselin Ortiz.
 * QuickSort.java ... Clase que realiza un ordenamiento QuickSort de una lista ingresada.
 * 
 */


/**
 * Clase que realiza un ordenamiento QuickSort de una lista ingresada.
 * @author Didier Salazar, 15487. Raul de Leon, Michelle Morales, Joselin Ortiz.
 */

public class QuickSort{
    private Lista list; //Lista a ordenar.
    private Comparable Array[]; //Arreglo de numeros a ordenar.
    private int izq; //Coordenada del inicio del lado izquierdo.
    private int der; //Coordenada de inicio del lado derecho.
    
    /**
     * Metodo Constructor de la clase.
     * @param list Lista a ordenar.
     * @throws Exception Por algun error.
     */
    public QuickSort(Lista list) throws Exception{
        this.list = list;
            int cont=0;
            Array=new Comparable[list.getLargo()];
            izq=0;
            der=(list.getLargo()-1);
            //Se ingresan los elementos de la lista al arreglo de numeros.
            while(cont<list.getLargo()){
                Array[cont]=(Integer)list.getValor(cont);
                cont++;
            }
    }

    /**
     * Metodo que setea la lista.
     * @param list Lista nueva.
     */
    public void setList(Lista list){
        this.list=list;
    }

    /**
     *Metodo que que devuelve la lista.
     * @return Devuelve la lista de la clase.
     */
    public Lista getList(){
        return list;
    }

    /**
     * Metodo que setea el arreglo a ordenar.
     * @param Array Arreglo a ordenar.
     */
    public void setArray(Comparable Array[]){
        this.Array=Array;
    }

    /**
     * Metodo que devuelve el arreglo a ordenar/ordenado.
     * @return Devuelve el arreglo a ordenar/ordenado.
     */
    public Comparable[] getArray(){
        return Array;
    }

    /**
     * Metodo que setea la coordenada de inicio del ordenamiento izquierdo.
     * @param izq Coordenada de inicio del ordenamiento izquierdo.
     */
    public void setIzq(int izq){
        this.izq=izq;
    }

    /**
     *Metodo que devuelve la coordenada de inicio del ordenamiento izquierdo.
     * @return Devuelve la coordenada de inicio del ordenamiento izquierdo.
     */
    public int getIzq(){
        return izq;
    }

    /**
     *Metodo que setea la coordenada de inicio del ordenamiento derecho.
     * @param der Coordenada de inicio del ordenamiento izquierdo.
     */
    public void setDer(int der){
        this.der=der;
    }

    /**
     *Metodo que devuelve la coordenada de inicio del ordenamiento derecho.
     * @return Devuelve coordenada de inicio del ordenamiento izquierdo.
     */
    public int getDer(){
        return der;
    }
    /**
	 * El método ordena un array de enteros comparables de izquierda a derceha
	 * @param Array Recibe un array de números enteros
	 * @param izq recibe los valores izq = 0
	 * @param der recibe los valores der = número de elementos - 1
	 */
	public void quicksort(Comparable Array[],int izq, int der) {
                  
		  int pivote= (Integer)Array[izq];
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
		   if(izq<j-1){
		      quicksort(Array,izq,j-1);
                     
                    } // Subarray izquierda se ordena
                   if(j+1 <der){
		      quicksort(Array,j+1,der);
                   } // Sub. derecho se ordena
                   this.Array=Array;
                   int cont=0;
                Lista ordenada=new Lista();
                while(cont<Array.length){
                ordenada.aggFinal(Array[cont]);
                cont++;
                }
                list=ordenada;
	}
}
