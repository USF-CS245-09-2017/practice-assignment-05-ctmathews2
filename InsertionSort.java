

public class InsertionSort implements SortingAlgorithm{


	public void sort(int [] a){
		int length = a.length; 
		for (int i = 1; i < length; i++) //Pass through all of array. No need to check start at first element
		{ 
			int elementToSort = a[i]; //Element that will be sorted into sorted part of array
			int j = i-1; 
			while (j >= 0 && a[j] > elementToSort) //Check if the element is in the right place
			{ 
				a[j+1] = a[j]; //While it is not in the right place
				j = j-1; 	   //Shift elements
			} 
			a[j+1] = elementToSort; 
		} 
	}
}