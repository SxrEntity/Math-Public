package mathandstuff;

public class Fibbonacci {
	public static int FibbonacciSequence(int input) {
		int a = 0, b = 1, c, i; 
	    if( input == 0) 
	        return a; 
	    for(i = 2; i <= input; i++) 
	    { 
	       c = a + b; 
	       a = b; 
	       b = c; 
	    } 
	    return b; 
	}
}
