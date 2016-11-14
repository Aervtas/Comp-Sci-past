
public class CountingStars {
	public String printTriangle(int n){
		if(n==0)
			return "";
		else{
			String s = printTriangle(n-1)+"*";
			System.out.println(s);
			return s;
		}
	}
}
