
public class ReFibon {
	public static long fibonacci(int n){
		int a=0, b=1;
		for(int i=0; i<n; i++){
			if(i%2==1)
				a = a+b;
			else
				b = a+b;
		}
		if(a>b)
			return a;
		else
			return b;
	}
}
