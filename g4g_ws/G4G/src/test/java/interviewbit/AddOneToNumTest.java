package interviewbit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class AddOneToNumTest {
	
	@Test
	public void testAddOne() {
		int[] nine99 = new int[]{9,9,9};
		
		int[] oneK = AddOneToNumber.addOneToNumber(nine99);
		
		assertEquals("1000",Arrays.stream(oneK).mapToObj(String::valueOf).reduce("", (l,r)-> l + r));
		
		int[] fortyFive = AddOneToNumber.addOneToNumber(new int[] {4,4});
		
		assertEquals("45",Arrays.stream(fortyFive).mapToObj(String::valueOf).reduce("", (l,r)-> l + r));
		
        int[] zero45 = AddOneToNumber.addOneToNumber(new int[] {0,4,4});
		
		assertEquals("45",Arrays.stream(zero45).mapToObj(String::valueOf).reduce("", (l,r)-> l + r));
		
		
		
		
		
	}

}
