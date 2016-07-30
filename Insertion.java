
public class Insertion {

	public static void insertionSort(int data[], int n){
		int numSorted = 1;
		int index;
		while (numSorted < n){
			int temp = data[numSorted];
			for(index = numSorted; index > 0; index--){
				if(temp < data[index]-1){
					data[index]= data[index-1];
				}else{
					break;
				}
			}
			data[index] = temp;
			numSorted++;
		}
	}
}
