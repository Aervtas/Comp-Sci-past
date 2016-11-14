
public class Numbers {
	public int gcf(int n, int k){
		if(n==k)
			return n;
		else if(n>k)
			return gcf(n-k, k);
		else
			return gcf(n, k-n);
	}
}
