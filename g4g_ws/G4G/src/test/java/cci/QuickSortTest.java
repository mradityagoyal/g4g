package cci;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class QuickSortTest {
	
	@Test
	public void partitionTest() {
		
		int[] input = new int[] {10,80,30,90,40,50,70};
		QuickSort.partition(input, 0, input.length -1);
		
		int[] expected = new int[] {10,30,40,50,70,90,80};
		
		assertArrayEquals(expected, input);
	}
	
	public void quickSortTest() {
		
		int[] input = new int[] {10,80,30,90,40,50,70};
		QuickSort.quickSort(input, 0, input.length -1);
		
		int[] expected = new int[] {10,30,40,50,70,80,90};
		
		assertArrayEquals(expected, input);
		
		int[] input2 = new int[]{9,8,7,6,5,4,3,2,1};
		int[] expected2 = new int[] {1,2,3,4,5,6,7,8,9};
		QuickSort.quickSort(input2, 0, input2.length -1);
		assertArrayEquals(expected2, input2);
		
		
	}

}
