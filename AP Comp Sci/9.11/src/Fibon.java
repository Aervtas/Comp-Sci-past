
public class Fibon {
	public int[] fibonacci(int n){
		int[] num = new int[n];
		
		num[0] = 0;
		num[1] = 1;
		
		for(int i=2; i<n; i++){
			num[i] = num[i-1] + num[i-2];
		}
		
		return num;
	}
}
