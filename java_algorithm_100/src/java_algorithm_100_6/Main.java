package java_algorithm_100_6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int big = 0;
		int small = 0;
		
		if (num1 > num2) {
			big = num1;
			small = num2;
		}
		else {
			big = num2;
			small = num1;
		}
		
		int gcd = 1;
		
		for (int i = 1; i <= small; i++) {
			if (big % i == 0 && small % i == 0) {
				gcd = i;
			}
		}
		System.out.println(gcd);
	}

}
