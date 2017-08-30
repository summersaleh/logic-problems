package palindrom;

import java.util.Scanner;

public class palindrom {

	//public static void main(String[] args) {

		//Scanner input = new Scanner(System.in);
		
	//	System.out.println("Enter a word I will tell you if its a palindrom");
		
//		String word = input.nextLine();
//		char[] wArray = word.toCharArray();

	public static boolean isPalindrom(char[] word) {
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
