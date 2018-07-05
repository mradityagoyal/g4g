package cci;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromePermutationTest {
	
	@Test
	public void test() {
		String input = "aacc";
		assertTrue(PalindromePermutation.isPalindromePermutation(input));
		
		assertTrue(PalindromePermutation.isPalindromePermutation("aabcc"));
		
		assertFalse(PalindromePermutation.isPalindromePermutation("ab"));
		
		assertFalse(PalindromePermutation.isPalindromePermutation("aabccd"));
		
		assertTrue(PalindromePermutation.isPalindromePermutation("zbbzz"));
	}

}
