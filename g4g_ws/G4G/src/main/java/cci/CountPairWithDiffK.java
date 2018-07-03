package cci;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountPairWithDiffK {
	
	// 1, 4, 6, 2 
	//K = 3
	
	static int countPairsWithDiffK(int K, List<Integer> input) {
		Set<Integer> hash = new HashSet<>();
		int count = 0;
		for(int element : input) {
			if(hash.contains(element + K)) count++;
			if(hash.contains(element - K )) count++;
			hash.add(element);
		}
		return count;
	}

}
