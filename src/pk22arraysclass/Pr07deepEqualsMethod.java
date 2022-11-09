package pk22arraysclass;

import java.util.Arrays;

public class Pr07deepEqualsMethod {

public static void main(String[] args) {
		
		int[][] marr1 = {{1, 8, 2, 6, 3, 4, 9, 5}, {8, 6, 3, 9, 5}};
		int[][] marr2 = {{1, 8, 2, 6, 3, 4, 9, 5}, {8, 6, 3, 9, 5}};
		
		System.out.println(Arrays.deepEquals(marr1, marr2));
	}

}
