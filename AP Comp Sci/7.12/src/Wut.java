
public class Wut {
	public int sumDigits(int n){
		int h=0;
		while(n != 0){
			h += n % 10;
			n /= 10;
		}
		return h;
	}
}