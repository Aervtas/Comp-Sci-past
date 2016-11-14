
public class Mellow {
	public int melCount(String sub, String s){
		if(s.length()<sub.length())
			return 0;
		if(sub.equals(s.substring( 0, sub.length()))){
			return melCount(sub, s.substring(1))+1;
		}
		else
			return melCount(sub, s.substring(1))+0;
			
	}
}
