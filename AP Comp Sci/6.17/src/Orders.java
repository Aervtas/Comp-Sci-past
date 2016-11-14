
public class Orders {
	
	private final static double BCONST=20.95;
	private final static double NCONST=21.95;
	
	public static double getOrderTotal(int bp, int nb){
		int total = bp + nb;
		
		if(bp==1 && nb==1)
			return 39.95;
		else if(total>2)
			return total*16.95;
		else if(total>11)
			return total*16;
		else
			return bp*BCONST + nb*NCONST;
	}
}
