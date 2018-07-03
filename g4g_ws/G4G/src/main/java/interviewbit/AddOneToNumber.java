package interviewbit;

import java.util.Arrays;

public class AddOneToNumber {
	
	
	static int[] addOneToNumber(int[] A){
		
		if(A.length == 0) return new int[]{1};
		if(A[0]==0) return addOneToNumber(Arrays.copyOfRange(A, 1, A.length));
		
		int carry = 1;
		int idx = A.length -1;
		while(carry > 0 && idx >= 0 ) {
			int current = A[idx];
			current += 1;
			if(current < 10) {
				A[idx] = current;
				carry -= 1;
			}else {
				A[idx]= 0;
			}
			idx -=1;
		}
		
		if(carry == 0) return A;
		else {
			int[] result = new int[A.length + 1];
			result[0] = 1;
			for(int i = 1 ; i < result.length; i ++) {
				result[i] = A[i-1];
			}
			return result;
		}
	}

}
