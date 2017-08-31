package stringReverse;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word and i'll reverse it:");
		String word = input.nextLine();
		System.out.println(Reverse(word));

	}

	private static String Reverse(String word) {
		String reverse = "";
		int length = word.length();
		for(int i = length -1; i >=0; i--) {
			reverse = reverse + word.charAt(i);
		}
		
		return reverse;
	}

}
