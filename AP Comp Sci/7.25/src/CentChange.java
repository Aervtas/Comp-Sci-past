
public class CentChange {
	public void hello(int c){
		int q, d, n, p;
		
		p = c%5;					
		n = c%10 - p;
		d = c%25 - n - p;
		q = c - d - n - p;
		
		System.out.println(c+" cents = "+q/25+" quarters "+d/10+" dimes "+n/5+" nickels "+p+" pennies");
	}
	
	public void jello(int c){
		int q=0, d=0, n=0, p=0;
		
		p = c;
		
		System.out.println(c+" cents = "+q/25+" quarters "+d/10+" dimes "+n/5+" nickels "+p+" pennies");
	}
	
	public void cello(int c){
		int q=0, d, n, p;
		
		p = c%5;					
		n = c%10 - p;
		d = c - n - p;
		
		System.out.println(c+" cents = "+q/25+" quarters "+d/10+" dimes "+n/5+" nickels "+p+" pennies");
	}
	}
