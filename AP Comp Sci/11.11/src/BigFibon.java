import java.math.BigInteger;
import java.util.ArrayList;

public class BigFibon {
	
	public ArrayList<BigInteger> fibTime(int n){
		
		ArrayList<BigInteger> fib = new ArrayList<BigInteger>();
		
		if(n==0)
			return fib;
		fib.add(BigInteger.valueOf(0));
		if(n == 1)
			return fib;
		fib.add(BigInteger.valueOf(1));
		if(n == 2)
			return fib;
		
		for(int i=2; i<n; i++){
			fib.add(fib.get(i-1).add(fib.get(i-2)));
		}
		
		return fib;
	}
}
