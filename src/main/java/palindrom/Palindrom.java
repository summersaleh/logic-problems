package palindrom;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word and i'll tell you if it's a palindrom or not:");
		String word = input.nextLine();
//		toCharArry() converts a string into a character array
//		It returns a newly created character array
		char[] wArray = word.toCharArray();
		System.out.println(isPalindrom(wArray));
	}

	// if input is Anna: i1 == 0 and i2 == 3
	// First loop iteration we will compare word[0] and word[3].
	// They are equal so we increment i1 and decrement i2
	// Then they are two and both equal so the condition for the while loop is
	// no longer true
	// So the loop terminates and we return true
	private static boolean isPalindrom(char[] word) {
		int i1 = 0;
		int i2 = word.length - 1;
		while (i2 > i1) {
			if (word[i1] != word[i2]) {
				return false;
			}
			++i1;
			--i2;
		}
		return true;
	}
}
