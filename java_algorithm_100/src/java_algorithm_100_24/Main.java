package java_algorithm_100_24;

public class Main {

	public static void main(String[] args) {
		int in[] = new int[] {7, 100, 95, 90, 80, 70, 60, 50};
		
		int sum = 0;
		
		for (int i = 1; i < in.length; i ++) {
			sum += in[i];
		}
		
		double avg = (double)sum / in[0];
		
		System.out.println(avg);
		
		int cnt = 0;
		
		for (int i = 1; i < in.length; i ++) {
			if (in[i] > avg) {
				cnt++;
			}
		}
		
		double perc = cnt / (double)in[0];
		
		System.out.println(perc*100);
	}
}
