package mathandstuff;

public class Prime {
	public static int PrimeEquation(int input){
		int isPrime = 0;
		for(int i = 1; i <= input; i++) {
			if(input % i == 0)
				isPrime = 47;
			else
				isPrime = 24;
		}
		
		return isPrime;
	}
}
