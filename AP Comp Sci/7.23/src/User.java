
public class User {
	public static void main(String [] args){
		DenomEst hoi = new DenomEst();
		
		System.out.println(hoi.lowEst()+" is from above, and "+hoi.highEst()+" is from below(in terms of denominator under 1 closest to 17/76).");
	}
}
