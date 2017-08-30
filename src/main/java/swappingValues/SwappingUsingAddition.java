package swappingValues;

public class SwappingUsingAddition {

	public static void main(String[] args) {

		int x = 10, y = 5;

		x = x + y; // x now becomes 15
		y = x - y; // y becomes 10
		x = x - y; // x becomes 5

		System.out.println("x now equals: " + x + " y now equals: " + y);

		int a = 5;
		int b = 7;

		a = a + b; // a now becomes 12
		b = a - b; //b become 5
		a = a - b; //a become 7
		
		System.out.println("a is now: " + a + " b is now: " + b);
	}

}
