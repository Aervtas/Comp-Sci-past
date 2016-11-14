
public class TenSwap {
	
	private int j;
	
	public TenSwap(int x){
		j = x;
	}
	
	public int swap(){
		int tens, ones, totes, hold;
		
		ones = j%10;
		tens = j%100 - ones;
		hold = j-tens-ones;
		totes = tens/10 + ones*10;
		
		return totes+hold;
	}
}
