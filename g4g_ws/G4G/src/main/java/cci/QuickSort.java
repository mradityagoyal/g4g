package cci;

public class QuickSort {
	
	
	
	static int[] quickSort(int[] input, int low, int high) {
		
		if(low < high) {
			int pi = partition(input, low, high);
			
			quickSort(input, low, pi - 1);
			quickSort(input, pi +1, high);
		}
		return input;
	}

	static int partition(int[] input, int low, int high) {
		int pivot = input[high - 1];
		int i = low -1;
		for (int j = low; j <= high -1; j++) {
			if(input[j]<= pivot) {
				i++;
				swap(input, i, j);
			}
		}
		swap(input, high, i + 1);
		return i + 1;
	}
	
	private static void swap(int[] input, int i , int j) {
		int temp = input[i];
		input[i] = input[j];
		input[j] = temp;
	}

}
