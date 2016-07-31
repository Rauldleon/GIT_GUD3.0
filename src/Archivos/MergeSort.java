/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;


public class MergeSort {
    private Lista list;
    private Comparable numbers[];
        public MergeSort(Lista list) throws Exception{
            this.list = list;
            int cont=0;
            numbers=new Comparable[list.getLargo()];
            while(cont<list.getLargo()){
                numbers[cont]=(Integer)list.getValor(cont);
                cont++;
            }
        }
        public Lista getList(){
            return list;
        }
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

