
public class Coins {
	
	private int q, n, d, p;
	
	public Coins(int c){
		q = c/25;
		d = (c-(q*25))/10;
		n = (c-(q*25)-(d*10))/5;
		p = (c-(q*25)-(d*10)-(n*5));
	}
	
	public int getQuarters(){
		return q;
	}
	public int getNickels(){
		return n;
	}
	public int getDimes(){
		return d;
	}
	public int getPennies(){
		return p;
	}
}
