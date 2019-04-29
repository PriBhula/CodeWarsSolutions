
public class Dubstep {

	public static String SongDecoder (String song)
	  {
	    String ans = song.replaceAll("(WUB)+", " ").trim();    
	    return ans;
	   }
}
