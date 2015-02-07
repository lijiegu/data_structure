package array;

public class TestArray {
	public static void main(String[] args) {
		int a [] = {1,2,3};
		int sum = 0;
		for (int i : a) {
			sum += i * 2;
		}
		System.out.println("sum = "+ sum);
	}
}
