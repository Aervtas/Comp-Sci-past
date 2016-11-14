
public class CountingStars {
	public String printTriangle(int n){
		if(n==1)
			return "\n*";
		else{
			String p = new String(new char[n]).replace("\0", "*");
			String s = "\n"+p+printTriangle(n-1);
			return s;
		}
	}
}
