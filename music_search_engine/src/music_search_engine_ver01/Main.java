package music_search_engine_ver01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Engine_ver01 eng = new Engine_ver01();
		Scanner sc = new Scanner(System.in);
		String answer;
		
		 try {
	            System.out.println("Welcome to music search engine!");
	            Thread.sleep(2000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

		 System.out.println("Do you know the name of the song you're looking for? (y / n)");
		 
		 answer = sc.nextLine();
		 
		 if (answer.equals("y")) {
			System.out.println("Type a name of a song of Dream Theater. (Ignore upper/lower cases and spacing.)");
			String song_name = eng.setName(sc.nextLine());
			eng.info(song_name);
			
		 } else {
			System.out.println("Type a number of the album that the song belongs to.\n"
		                           + "1 : 1st\n"
		                           + "2 : 2nd\n"
		                           + "3 : 3rd\n"
		                           + "4 : 4th");
			int album = eng.setAlbum(sc.nextInt()); 
		 }
		 
//		System.out.println("Type a name of a song of Dream Theater. (Ignore upper/lower cases and spacing.)\n"
//				               + "Or if you don't remember the name, type a number of the album that the song belongs to.\n"
//				               + "1 : 1st\n"
//				               + "2 : 2nd\n"
//				               + "3 : 3rd\n"
//				               + "4 : 4th\n");
//		
//		String song_name = eng.setName(sc.nextLine());
		
//		eng.info(song_name);
		
		sc.close();
	}

}
