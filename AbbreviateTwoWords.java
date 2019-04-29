
public class AbbreviateTwoWords {

  public static String abbrevName(String name) {
    String ans = "";
    //System.out.print(name);
    int surname = 1; //going to count the places in the array
    
    for(int i=0; i<name.length(); i++){
      if (Character.isWhitespace(name.charAt(i))){
        surname = i+1;//pick the spot after the space
        }
    } 
    //System.out.println(ans);
    ans = name.charAt(0) + "." + name.charAt(surname);
    ans = ans.toUpperCase();
    return ans;
  }
}