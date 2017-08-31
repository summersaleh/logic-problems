package recursion;

import java.util.Scanner;

public class FactorialRecursion {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		System.out.println(Factorial(number));

	}

	private static long Factorial(int n) {
		if(n == 1) {
			return 1;
		} else {
			return n * Factorial(n -1);
		}
		
	}

}
