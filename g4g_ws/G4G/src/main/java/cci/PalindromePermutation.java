package cci;

import java.util.HashMap;
import java.util.Map;

/*
 * 1.4
I Arrays and Strings
Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palin-
drome. A palindrome is a word or phrase that is the same forwards and backwards. A permutation
is a rea rrangement of letters. The palindrome does not need to be limited to just dictionary words.
EXAMPLE
Input: Tact Coa
Output: True (permutations: "taco cat". "atco cta". etc.)
Hints: # 106, #121, #134, #136
 */
public class PalindromePermutation {

	
	static boolean isPalindromePermutation(String S) {
		
		if(S.isEmpty() || S.length() == 1) return true;
		
		Map<Character, Integer> mapping = new HashMap<>();
		
		for(char c: S.toCharArray()) {
			if(mapping.containsKey(c)) {
				mapping.put(c, mapping.get(c)+1);
			}else mapping.put(c, 1);
		}
		
		return mapping.entrySet().stream().filter(entry -> entry.getValue() % 2 ==1).count() < 2;
	}
}
