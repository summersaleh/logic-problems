package swappingValues;

public class SwappingValuesUsingMultiplication {

	public static void main(String[] args) {

		int x = 10, y = 5;

		x = x * y; // x become 50
		y = x / y; // y becomes 10
		x = x / y; // x become 5

		System.out.println("x is now equal to : " + x + " y is now equal to: " + y);

		int a = 5, b = 7;
		
		a = a * b; // a becomes 35
		b = a / b; // b becomes 5
		b = a / b; // a becomes 7;
	}

}
