package java_algorithm_100_5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "helloWorlD";
		char []after = new char[str.length()];
		
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				after[i] = Character.toLowerCase(str.charAt(i));
			}
			else if (Character.isLowerCase(str.charAt(i))) {
				after[i] = Character.toUpperCase(str.charAt(i));
			}

		}
		
		for (int i = 0; i < str.length(); i++) {
			
			System.out.print(after[i]);
		}

	}
}
