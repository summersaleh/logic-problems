package randomPermutation;

import java.util.Random;

public class RandomPermutation {

	public static void main(String[] args) {

		int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 1};
		
		int x = 0;
		int y = 0;
		Random r = new Random();
		
		while(x < list.length) {
			y = x + r.nextInt(list.length -x);
			System.out.println(list[y]);
			
			int temp = list[x];
			list[x] = list[y];
			list[y] = temp;
			
			x++;
		}
	}

}
