package music_search_engine_ver01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Engine_ver01 eng = new Engine_ver01();
		Scanner sc = new Scanner(System.in);

		System.out.println("�帲 �������� �뷡 �̸��� �ѱ� �Ǵ� ����� �Է��ϼ���. (��ҹ���, ����� �����ص� ��.)");
		String song_name = eng.setName(sc.nextLine());
		
		eng.info(song_name);
		
		sc.close();
	}

}
