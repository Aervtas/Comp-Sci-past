
public class Meethods {
	public int sum(int[] n){
		int sum=0;
		
		for(int i=0; i<n.length; i++)
			sum += n[i];
		
		return sum;
	}
	
	public int[] sum2(int[][] k){
		int sum[] = new int[k.length];
		
		for(int i=0; i<k.length; i++){
			for(int j=0; j<k[i].length; j++){
				sum[i] += k[i][j];
			}
		}
		return sum;
	}
}
