
public class TwinPrimes {
	public boolean isPrime(int n){
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
	
	public void printPrime(){
		int c=0, p1, p2;
		
		for(int i=1; c!=20; i+=2){
			if(isPrime(i)){
				p1 = i;
				if(isPrime(i+2)){
					p2 = i+2;
					System.out.println(p1+"\t"+p2);
					c++;
				}
			}
			
		}
	}
}
