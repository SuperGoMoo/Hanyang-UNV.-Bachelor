package java_algorithm_100_19;

public class Main {

	public static void main(String[] args) {
		int n = 5;
		int m = 7;
		int answer = 1;

		for (int i = 0; i < m; i++) {
			answer *= n;
		}
		System.out.println(answer);

	}

}
