package linkedList;

import java.util.Scanner;

public class LinkedList {

	public static void main(String[] args) {
		int first;
		int second;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number:");

		first = input.nextInt();
		
		System.out.print("Enter second number:");

		second = input.nextInt();
		
		
		
		System.out.println(first + " + " + second + " = " + (first+second));
		
		System.out.println((first+second)/2);
	}

}
