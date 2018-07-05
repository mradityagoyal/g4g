package cci.heaps;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxHeapsTest {
	
	@Test
	public void maxHeaptest1() {
		
		MaxHeap heap = new MaxHeap();
		heap.push(1);
		heap.push(2);
		heap.push(5);
		heap.push(7);
		heap.push(11);
		heap.push(18);
		
		assertEquals(6, heap.size());
		assertEquals(18, heap.max());
		
		assertEquals(18,  heap.popMax());
		assertEquals(11,  heap.popMax());
		assertEquals(7,  heap.popMax());
		assertEquals(5,  heap.popMax());
		
		assertEquals(2,  heap.popMax());
	}

}
