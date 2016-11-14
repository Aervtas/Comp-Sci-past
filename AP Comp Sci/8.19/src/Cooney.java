
public class Cooney {
	public boolean likey(String s){
		boolean so = false;
		
		for(int i=1; i<s.length(); i++){
			if(s.charAt(i) == s.charAt(i-1))
					so = true;
				
		}
		
		
		return so;
	}
}
