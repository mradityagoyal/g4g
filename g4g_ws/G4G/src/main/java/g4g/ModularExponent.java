package g4g;

public class ModularExponent {
	
	
	public static void main(String[] args) {
		
		
		
	}
	
	static int modExp(int x, int y , int p) {
		int xToy = powIter(x,y);
		return xToy % p;
	}
	
	static int pow(int x, int y, int acc) {
		if(y < 1) throw new RuntimeException("Invalid power");
		if(y > 1) {
			if((y & 1) == 1) { //y is odd. 
				return pow(x * x, y /2, x);
			}else { //y is even. 
				return acc * pow(x * x, y / 2, 1);
			}
		}else {
			return acc * x;
		}
	}
	
	static int powIter(int x, int y ) {
		if(y == 1) return x;
		int result = 1;
		while(y > 0) {
			if((y & 1) == 1) {
				result *= x;
			}
			x = x * x;
			y =y >>1;
		}
		return result;
	}
	
	

}
