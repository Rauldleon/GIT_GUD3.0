/* Algoritmos y Estructuras de Datos.
 * Nombres: Didier Salazar, 15487. Raul de Leon, Michelle Morales, Joselin Ortiz.
 * MergeSort.java ... Clase necesaria para ordenar una lista de numeros por el método de MergeSorting.
 * 
 */
package Archivos;

/**
 * Clase necesaria para ordenar una lista de numeros por el método de MergeSorting.
 * @author Didier Salazar, 15487. Raul de Leon, Michelle Morales, Joselin Ortiz.
 */
public class MergeSort {
    private Lista list; //Lista a ordenar.
    private Comparable numbers[]; //Arreglo de numeros a ordenar.

    /**
     * Metodo constructor de la clase.
     * @param list Pasa como parametro una lista de numeros que instancian la clase Comparable.
     * @throws Exception Por si sucede algun error.
     */
    public MergeSort(Lista list) throws Exception{
            this.list = list;
            int cont=0;
            numbers=new Comparable[list.getLargo()];
            //Se ingresan los elementos de la lista al arreglo de numeros.
            while(cont<list.getLargo()){
                numbers[cont]=(Integer)list.getValor(cont);
                cont++;
            }
        }

    /**
     *Metodo que devuelve la lista de la clase.
     * @return Devuelve la lista de la clase.
     */
    public Lista getList(){
            return list;
        }

    /**
     *Metodo que desglosa el arreglo de numeros hasta que este ordenada.
     */
    public void mergeSort()
	{
                Comparable[ ] a=numbers;
		Comparable[] tmp = new Comparable[a.length];
		mergeSort(a, tmp,  0,  a.length - 1);
                int cont=0;
                Lista ordenada=new Lista();
                while(cont<a.length){
                ordenada.aggFinal(a[cont]);
                cont++;
            }
                list=ordenada;
	}
    /**
     *Metodo utilizado por el anterior para desglosar la lista e ir operandola.
     * @param a Arreglo de la lista.
     * @param tmp Arreglo de la lista temporal.
     * @param left coordenadas del desglosamiento a la izquierda.
     * @param right coordenadas del desglosamiento a la derecha.
     */
	private void mergeSort(Comparable[ ] a, Comparable[] tmp, int left, int right)
	{
		if( left < right )
		{
			int center = (left + right) / 2;
			mergeSort(a, tmp, left, center);
			mergeSort(a, tmp, center + 1, right);
			merge(a, tmp, left, center + 1, right);
		}
	}
/**
     *Metodo utilizado al final para terminar de ordenar por MergeSorting.
     * @param a Arreglo de la lista.
     * @param tmp Arreglo de la lista temporal.
     * @param left coordenada del desglosamiento a la izquierda.
     * @param right coordenada del desglosamiento a la derecha.
     * @param rightEnd coordenada del desglosamiento final a la derecha.
     */
    private void merge(Comparable[ ] a, Comparable[ ] tmp, int left, int right, int rightEnd )
    {
        int leftEnd = right - 1;
        int k = left;
        int num = rightEnd - left + 1;

        while(left <= leftEnd && right <= rightEnd)
            if(a[left].compareTo(a[right]) <= 0)
                tmp[k++] = a[left++];
            else
                tmp[k++] = a[right++];

        while(left <= leftEnd)    // Copy rest of first half
            tmp[k++] = a[left++];

        while(right <= rightEnd)  // Copy rest of right half
            tmp[k++] = a[right++];

        // Copy tmp back
        for(int i = 0; i < num; i++, rightEnd--)
            a[rightEnd] = tmp[rightEnd];
    }
 }

