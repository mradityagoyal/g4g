package cci.heaps;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinHeapTest {
	
	@Test
	public void minHeapTest(){
		
		MinHeap minHeap = new MinHeap();
		minHeap.push(4);
		minHeap.push(3);
		minHeap.push(1);
		minHeap.push(6);
		minHeap.push(15);
		
		assertEquals(1, minHeap.min());
		
		assertEquals(1, minHeap.popMin());
		assertEquals(3, minHeap.popMin());
		assertEquals(4, minHeap.popMin());
		assertEquals(6, minHeap.popMin());
		assertEquals(15, minHeap.popMin());
	}

}
