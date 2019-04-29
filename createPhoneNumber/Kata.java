
public class Kata {
	
	public static String createPhoneNumber(int[] numbers) {
	    String number = "(";
	    for(int i=0;i<3;i++){
	       number = number + numbers[i];
	     }
	     number = number + ") ";
	    for (int i= 3;i<6;i++){
	      number = number + numbers[i];
	    }
	    number = number + "-";
	    for (int i = 6;i<numbers.length;i++){
	      number = number + numbers[i];
	    }
	    return number;
	  }

}
