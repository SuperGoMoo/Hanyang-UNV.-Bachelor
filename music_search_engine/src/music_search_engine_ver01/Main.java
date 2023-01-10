package music_search_engine_ver01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Engine_ver01 eng = new Engine_ver01();
		Scanner sc = new Scanner(System.in);

		System.out.println("드림 씨어터의 노래 이름을 한글 또는 영어로 입력하세요. (대소문자, 띄어쓰기는 무시해도 됨.)");
		String song_name = eng.setName(sc.nextLine());
		
		eng.info(song_name);
		
		sc.close();
	}

}
