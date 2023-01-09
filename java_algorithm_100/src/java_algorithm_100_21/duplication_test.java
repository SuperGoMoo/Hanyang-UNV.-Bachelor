package java_algorithm_100_21;

public class duplication_test {

	public static void main(String[] args) {
		int n[] = new int[] {1, 2, 3, 1, 1, 2, 3, 4, 5, 5, 7, 15};
		boolean once[] = new boolean[1];
		
		for (int i = 0; i < 100; i++) {
			once[n[i]] = true;
		}
		for (int i = 1; i < 100; i ++) {
			if (once[i]) {
				System.out.print(i + " ");
			}

		}
	}

}
