package music_search_engine_ver01;

class Engine_ver01 {
	String song_name;
	int album;
	
	public String setName(String song_name) {
		this.song_name = song_name;
		return song_name;
	}
	
	public Integer setAlbum(int album) {
		this.album = album;
		return album;
	}
	
	public void album(String song_name) {
		
	}
	
	public void info(String song_name) {
		if (song_name.replaceAll(" ", "").equalsIgnoreCase("pullmeunder") || song_name.replaceAll(" ", "").equals("풀미언더")) {
			System.out.println("Name : Pull Me Under\n"
					               + "Album : Images and Words\n"
					               + "Released : 1992\n"
					               + "Songwriter(s) : James LaBrie, Kevin Moore, John Myung, John Petrucci, Mike Portnoy\n"
					               + "Producer(s) : David Prater");
		}
	}
}
