package cci;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ACubePlusBCube {
	
	//prints a,b,c,d where a^3 + b^3 = c ^3 = d ^3.
	//upto 1000. 
	static void printABCD() {
		
		Map<Double, List<String>> cache = new HashMap<>();
		
		for(int a = 1 ; a <= 1_000; a ++) {
			for (int b = a+1; b < 1_000; b++ ) {
				Double sum = Double.valueOf(Math.pow(a, 3) + Math.pow(b, 3));
				if(cache.containsKey(sum)) {
					cache.get(sum).add(a+","+b);
				}else {
					List<String> val = new ArrayList<>();
					val.add(a + ","+ b);
					cache.put(sum, val);
				}
			}
		}
		
		List<List<String>> results = cache.values().stream().filter(pairs -> pairs.size() > 1).collect(Collectors.toList());
		
		for(List<String> r: results ) {
			System.out.println(r.stream().collect(Collectors.joining(",")));
		}
		
		
		
		
		
	}

}
