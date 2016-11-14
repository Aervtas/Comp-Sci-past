
public class Names {
	public String convertName(String s){
		int comma = s.indexOf(',');
		
		return s.substring(comma+2)+" "+s.substring(0, comma);
	}
}
