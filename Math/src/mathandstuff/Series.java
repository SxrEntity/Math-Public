package mathandstuff;
import java.util.Scanner;

public interface Series {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		Scanner operation = new Scanner(System.in);
		
		System.out.println("Enter an integer");
		System.out.println();
		int input = keyboard.nextInt();
		System.out.println();
		System.out.println("Your integer is " + input);
		
		System.out.println("Enter an operation (\"Fibbonacci\", \"Prime\", or \"Square\")");
		System.out.println();
		String operationInput = operation.nextLine();
		System.out.println();
		System.out.println("Your operation is " + operation);
		
		int answer = getValues(input, operationInput);
		System.out.println();
		
		if(answer == 24 && operationInput.equals("Square")) 
			System.out.println("This integer is not a perfect square");
		else if(answer == 47 && operationInput.equals("Square"))
			System.out.println("This integer is a perfect square");
		else if(answer == 24 && operationInput.equals("Prime"))
			System.out.println("This integer is prime");
		else if(answer == 47 && operationInput.equals("Prime"))
			System.out.println("This integer is not prime");
		
		else
			System.out.println(answer);
	}
	
	public static int getValues(int depth, String operator) {
		int answer = 0;
		
		if(operator.equals("Fibbonacci")) {
			answer = Fibbonacci.FibbonacciSequence(depth);
		}
		
		else if(operator.equals("Prime")) {
			answer = Prime.PrimeEquation(depth);
		}
		
		else if(operator.equals("Square")) {
			answer = PerfectSquare.SquareEquation(depth);
		}
		
		else
			answer = 420;
		
		return answer;
	}
}
