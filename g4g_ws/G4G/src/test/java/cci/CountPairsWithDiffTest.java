package cci;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class CountPairsWithDiffTest {
	
	@Test
	public void countPairsWithDiffTest() {
		List<Integer> input = Arrays.asList(1,4,6,2, 7, 10, 8);
		int count = CountPairWithDiffK.countPairsWithDiffK(2, input);
		assertEquals(4, count);
	} 

}
