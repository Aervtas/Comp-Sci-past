
public class perfSq {
	public static boolean isPerfectSquare(int n){
		boolean so = false;
		int max = 1, hey=0;
		
		if(n == 1)
			return true;
		else if(n < 0)
			return false;
		
		while(hey < n){
			hey += max;
			max += 2;
		}
		if(hey == n)
			return true;
		return so;
	}
}
