/* Algoritmos y Estructuras de Datos.
 * Nombres: Didier Salazar, 15487. Raul de Leon, Michelle Morales, Joselin Ortiz.
 * InsertionSort.java ... Clase que realiza un ordenamiento InsertionSort de una lista ingresada.
 * 
 */
/*
 * Codigo obtenido en el libro JavaStructures
 */



/**
 * Clase que realiza un ordenamiento InsertionSort de una lista ingresada.
 * @author Didier Salazar, 15487. Raul de Leon, Michelle Morales, Joselin Ortiz.
 */
public class InsertionSort{
		
    /**
     * Metodo que realiza el ordenamiento de tipo de insercion.
     * @param data Lista a ordenar.
     * @return Lista ordenada.
     * @throws Exception Por si ocurre algun error en la lista.
     */
    public Lista insertionSort(Lista data) throws Exception {
      int i, j, temp;
      for (i = 1; i < data.getLargo(); i++) {
            temp = (Integer)data.getValor(i);
            j = i;
            while (j > 0 && (Integer)data.getValor(j-1) > temp) {
                  data.editForPosition(j, data.getValor(j-1));
                  j--;
            }
            data.editForPosition(j, temp);
      }
      return data;
}
}
