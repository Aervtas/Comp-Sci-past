
public class optimusPrime {
	public static boolean isPrime(int n){
		boolean noFactors = true;
		
		if(n==2)
			return true;
		if(n <= 1)
			return false;
		
		for(int m=2; noFactors; m++){
			
			if(m*m > n)
				break;
			
			if(n%6 == 0)
				noFactors = false;
			
			if(n%m == 0)
				noFactors = false;
			
		}
		return noFactors;
	}
}
