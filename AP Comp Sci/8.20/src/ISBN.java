import java.lang.Number;

public class ISBN {
	public static boolean isValidISBN(String ISBN){
		boolean so = false;
		int sum=0;
		
		for(int i=0; i<ISBN.length()-1; i++){
		if(i%2 == 0)
			sum += Integer.parseInt(ISBN.substring(i, i+1));
		else
			sum += 3 * Integer.parseInt(ISBN.substring(i, i+1));
		}
		
		if(sum%10 == 0)
			so = true;
		
		if(ISBN.length() != 13)
			so = false;
		
		return so;
	}
}
