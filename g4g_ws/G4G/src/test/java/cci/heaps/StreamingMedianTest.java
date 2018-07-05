package cci.heaps;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StreamingMedianTest {
	
	@Test
	public void streamingMedianTst() {
		StreamingMedian stream = new StreamingMedian();
		
		stream.addElement(1);
		
		assertTrue("median is 1", stream.getMedian() == 1);
		
		stream.addElement(2);
		
		assertTrue("median is 1.5", stream.getMedian() == 1.5f);
		
		stream.addElement(3);
		
		assertTrue("median is 2", stream.getMedian() == 2);
		
		stream.addElement(1);
		
		assertTrue("median is 1.5", stream.getMedian() == 1.5f);
		
		stream.addElement(5);
		
		assertTrue("Median is 2", stream.getMedian() == 2);
		
		stream.addElement(7);
		
		assertTrue("Median is 3", stream.getMedian() == 2.5f);
		
	}

}
