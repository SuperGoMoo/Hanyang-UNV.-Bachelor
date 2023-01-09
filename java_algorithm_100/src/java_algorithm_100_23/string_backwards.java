package java_algorithm_100_23;

public class string_backwards {

	public static void main(String[] args) {
		String str = "ADEFH";
		char cha[] = str.toCharArray();
		char tmp;
		int len = str.length();
		
		for (int i = 0; i < len/2; i++) {
			tmp = cha[i];
			cha[i] = cha[len-i-1];
			cha[len-i-1] = tmp;
		}
		
		str = new String(cha);
		System.out.println(str);
		}
	}
