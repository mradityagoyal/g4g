package cci;

public class FindNumCommonInSortedArrays {
	
//	Question: Given two sorted arrays, find the number of elements in common. The arrays are the same length
//	and each has all distinct elements.
	static int numberOfCommonElements(int[] a1, int[] a2) {
		
		if(a1.length == 0 || a2.length == 0) return 0;
		
		int i = 0;
		int j = 0;
		int count= 0;
		
		while(i < a1.length && j < a2.length) {
			if(a1[i] == a2[j]) {
				count ++;
				i++;
				j++;
			}
			else if(a1[i] < a2[j]) i ++;
			else j ++;
		}
		return count;
		
	}

}
