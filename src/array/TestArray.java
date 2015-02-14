package array;

import java.util.Arrays;

public class TestArray {
	public static void main(String[] args) {
		int a [] = {1,2,3};
		int sum = 0;
		for (int i : a) {
			sum += i * 3; // conflicts resolved
		}
		System.out.println("sum = "+ sum);
		
		/*
		 * this shows the difference of null array, and empty array
		 */
		int [] b = null;
		System.out.println(b);
		
		int [] c = {};
		System.out.println(Arrays.toString(c));
		
		int [] d = new int[0];
		System.out.println(Arrays.toString(d));
	}
}
