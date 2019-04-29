
public class DnaStrand {
	
	public static String makeComplement(String dna) {
		
		String ans = "";
		
		for(int i=0; i<dna.length(); i++){
			char c = dna.charAt(i);
			
			if(c=='A')
				ans += 'T';
			if(c=='T')
				ans += 'A';
			if(c=='G')
				ans += 'C';
			if(c=='C')
				ans += 'G';
		}
      
      return ans;
  }
}