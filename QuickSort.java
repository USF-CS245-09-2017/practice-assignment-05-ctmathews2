

public class QuickSort implements SortingAlgorithm{


	public int partition(int a[], int start, int end) 
	{ 
		int pivot = a[end]; //Take last index as pivot. (Better pivot points can be chosen)
		int i = start-1; //
		for (int j = start; j < end; j++) //From start to end
		{ 
			if (a[j] <= pivot) //If less than pivot point. Swap elements
			{ 
				i++; 
				int temp = a[i]; 
				a[i] = a[j]; 
				a[j] = temp; 
			} 
		} 

		int temp = a[i+1]; // Get new pivot
		a[i+1] = a[end]; 
		a[end] = temp; 

		return i + 1; 
	} 

	public void sort(int a[]){ //Get length and call overloaded sort
		int length = a.length;
		sort(a,0,length-1);
	}


	public void sort(int a[], int start, int end) //overloaded sort method with requried parameters
	{ 
		if (start < end) 
		{ 
			int pi = partition(a, start, end); //Find partition index

			sort(a, start, pi-1); //Sort both halves
			sort(a, pi+1, end); 
		} 
	} 

}
