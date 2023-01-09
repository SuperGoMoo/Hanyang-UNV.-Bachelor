package java_algorithm_100_14;

public class Main {

	public static void main(String[] args) {

		int num = 421014210;
		
		int arr[] = new int[10];
		
		while (num > 0) {
			arr[num % 10]++;
			num /= 10;
			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + ": " + arr[i]);
		}

	}

}
