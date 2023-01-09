package java_algorithm_100_15;

public class Main {

	public static void main(String[] args) {
		
		int s = 2;
		int f = 6;
		
		int arr[] = new int[9];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		while (s <= f) {
			for (int i = 1; i <= arr.length; i++) {
				System.out.println(arr[s-1] + " * " + i + " = " + arr[s-1] * i);
			}
			s++;

		}

	}

}
