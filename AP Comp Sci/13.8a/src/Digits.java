
public class Digits {
	public int sumDigits(int n){
		if((n/10)==0)
			return n;
		else
			return sumDigits(n/10)+(n%10);
	}
}
