package music_search_engine_ver01;

class Engine_ver01 {
	String song_name;
	
	public String setName(String song_name) {
		this.song_name = song_name;
		return song_name;
	}
	
	public void info(String song_name) {
		if (song_name.replaceAll(" ", "").equalsIgnoreCase("pullmeunder") || song_name.replaceAll(" ", "").equals("Ǯ�̾��")) {
//		if (song_name.equalsIgnoreCase("pull me under") || song_name.equalsIgnoreCase("pullmeunder")|| song_name.equals("Ǯ �� ���") || song_name.equals("Ǯ�̾��")) {
			System.out.println("Album : Images and Words\n"
					               + "Released : 1992\n"
					               + "Songwriter(s) : James LaBrie, Kevin Moore, John Myung, John Petrucci, Mike Portnoy\n"
					               + "Producer(s) : David Prater");
		}
	}
}
