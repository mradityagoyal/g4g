package cci;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindNumCommonInSortedArraysTest {
	
	@Test
	public void test() {
		int[] a1 = new int[] {1,2,3,4,5};
		int[] a2 = new int[] {2,5};
		
		assertEquals(2,  FindNumCommonInSortedArrays.numberOfCommonElements(a1, a2));
		
		assertEquals(0,  FindNumCommonInSortedArrays.numberOfCommonElements(a1, new int[] {}));
		
		assertEquals(0,  FindNumCommonInSortedArrays.numberOfCommonElements(a1, new int[] {6}));
	}

}
