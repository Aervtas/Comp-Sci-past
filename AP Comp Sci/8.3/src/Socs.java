
public class Socs {
	public String removeDashes(String s){
		
		s = s.substring(0,3) + s.substring(4, 6) + s.substring(7);
		
		return s;
	}
}
