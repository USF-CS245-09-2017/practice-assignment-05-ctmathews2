import java.util.Arrays;

public class MergeSort implements SortingAlgorithm{


	public void sort(int a[]) 
	{ 
		if (a.length > 1) 
		{ 
			int[] left = getLeft(a);
			int[] right = getRight(a);
			sort(left);
			sort(right);
			merge(left,right,a);
		} 
	}

	public void merge(int[] left, int[] right, int[] a){
		int aIndex = 0;
		int leftIndex = 0;
		int rightIndex = 0;

		while(leftIndex < left.length && rightIndex < right.length ){
			if(left[leftIndex] <= right[rightIndex]){
				a[aIndex] = left[leftIndex];
				leftIndex++;
			}
			else{
				a[aIndex] = right[rightIndex];
				rightIndex++;
			}
			aIndex++;			
		}

		while(leftIndex < left.length){
			a[aIndex] = left[leftIndex];
			leftIndex++;
			aIndex++;
		}

		while(rightIndex < right.length){
			a[aIndex] = right[rightIndex];
			rightIndex++;
			aIndex++;
		}

	}

	public int[] getLeft(int[] a){
		int[] left = Arrays.copyOfRange(a, 0, a.length/2);
		return left;
	}

	public int[] getRight(int[] a){
		int[] right = Arrays.copyOfRange(a, (a.length/2), a.length );
		return right;
	}
}

