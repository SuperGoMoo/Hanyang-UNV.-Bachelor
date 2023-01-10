package music_search_engine_ver01;

class Engine_ver01 {
	String song_name;
	
	public String setName(String song_name) {
		this.song_name = song_name;
		return song_name;
	}
	
	public void info(String song_name) {
		if (song_name.replaceAll(" ", "").equalsIgnoreCase("pullmeunder") || song_name.replaceAll(" ", "").equals("풀미언더")) {
//		if (song_name.equalsIgnoreCase("pull me under") || song_name.equalsIgnoreCase("pullmeunder")|| song_name.equals("풀 미 언더") || song_name.equals("풀미언더")) {
			System.out.println("Album : Images and Words\n"
					               + "Released : 1992\n"
					               + "Songwriter(s) : James LaBrie, Kevin Moore, John Myung, John Petrucci, Mike Portnoy\n"
					               + "Producer(s) : David Prater");
		}
	}
}
