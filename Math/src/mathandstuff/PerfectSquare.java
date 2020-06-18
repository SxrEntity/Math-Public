package mathandstuff;

public class PerfectSquare {
	public static int SquareEquation(int input) {
		int isPerfectSquare = 0;
		
		for (int i = 0; i <= input; i++) {
			if(i*i == input)
				isPerfectSquare = 47;
			else
				isPerfectSquare = 24;
		}
		
		return isPerfectSquare;
	}
}
