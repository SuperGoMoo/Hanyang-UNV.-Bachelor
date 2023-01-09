package java_algorithm_100_24;

public class is_bigger_than_average {
	
	private int num;
	private int score[] = new int[num];
	
	public is_bigger_than_average(int num, int[] score) {
		this.num = num;
		this.score = score;
	}
	
	public int avg(int[] score) {
		int sum = 0;
		int avg = 0;
		
		for (int i = 0; i < score.length; i++) {
			sum = sum + score[i];
		}
		
		avg = sum / score.length;
		
		return avg;
	}
	
//	public float perc(int avg) {
//		
//	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int[] getScore() {
		return score;
	}

	public void setScore(int[] score) {
		this.score = score;
	}
}
