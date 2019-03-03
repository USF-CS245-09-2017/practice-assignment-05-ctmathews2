import java.util.Arrays;

public class MergeSort implements SortingAlgorithm{


	public void sort(int a[]) 
	{ 
		if (a.length > 1) //Base case
		{ 
			int[] left = getLeft(a); //Seperate array into left and right sides
			int[] right = getRight(a);
			sort(left); //Sort each half
			sort(right);
			merge(left,right,a); //Merge halves on the way back up
		} 
	}

	public void merge(int[] left, int[] right, int[] a){
		int aIndex = 0; //Starting index of all arrays
		int leftIndex = 0;
		int rightIndex = 0;

		while(leftIndex < left.length && rightIndex < right.length ){ //Repeat until one array is completed
			if(left[leftIndex] <= right[rightIndex]){ //If left is bigger than right, add to new arrray and increase coresponding left or right index
				a[aIndex] = left[leftIndex];
				leftIndex++;
			}
			else{
				a[aIndex] = right[rightIndex];
				rightIndex++;
			}
			aIndex++; //increase new array index			
		}

		while(leftIndex < left.length){ //If any of the left array exists, add the rest
			a[aIndex] = left[leftIndex];
			leftIndex++;
			aIndex++;
		}

		while(rightIndex < right.length){ //If any of the right array exists, add the rest
			a[aIndex] = right[rightIndex];
			rightIndex++;
			aIndex++;
		}

	}

	public int[] getLeft(int[] a){ //Get left half of array
		int[] left = Arrays.copyOfRange(a, 0, a.length/2);
		return left;
	}

	public int[] getRight(int[] a){ //Get right half of array
		int[] right = Arrays.copyOfRange(a, (a.length/2), a.length );
		return right;
	}
}

