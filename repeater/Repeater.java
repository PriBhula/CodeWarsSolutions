
public class Repeater {
	
	 public static String repeat(String string,long n){
		    String ans = "";
		    n = (int) n;
		    for (int i=0; i<n; i++){
		      ans = ans + string;
		      //System.out.println(i+". "+ ans);
		    }
		    return ans;
		  }

}
