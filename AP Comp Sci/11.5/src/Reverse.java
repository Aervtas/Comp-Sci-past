import java.util.ArrayList;

public class Reverse {
	private ArrayList<String> rev = new ArrayList<String>();
	
	public ArrayList<String> doIt(ArrayList<String> num){
		
		for(int i=num.size()-1; i>=0; i--){
			rev.add(num.get(i));
		}
		
		return rev;
	}
}
