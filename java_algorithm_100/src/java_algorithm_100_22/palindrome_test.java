package java_algorithm_100_22;

public class palindrome_test {

	public static void main(String[] args) {
		int n[] = new int[] {1, 2, 3, 5, 7,  5, 3, 2, 1};
		int len = n.length;
		boolean flag = true;
		
		for (int i = 0; i < len/2; i ++) {
			if (n[i] != n[len - i - 1]) {
				flag = false;
			}
		}
		
		if (flag == false) {
			System.out.println("결과 : False");
		}
		else {
			System.out.println("결과 : True");
		}
	}

}

