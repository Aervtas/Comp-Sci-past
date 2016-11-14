
public class Hyppo {
	public int testS(String s1, String s2){
		int k;
		
		k = s1.compareTo(s2);
		
		return k;
	}
	
	public int testI(String s1, String s2){
		int n1, n2;
		
		n1 = Integer.parseInt(s1);
		n2 = Integer.parseInt(s2);
		
		return n1 - n2;
	}
}
