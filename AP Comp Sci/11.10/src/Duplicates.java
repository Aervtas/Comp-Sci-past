import java.util.ArrayList;

public class Duplicates {
	
	private ArrayList<String> list = new ArrayList<String>();
	
	public void removeConsecutiveDuplicates(ArrayList<String> lst){
		for(int i=lst.size()-1; i>0; i--)
			if(lst.get(i).equals(lst.get(i-1)))
				lst.remove(i);
		
		list = lst;
	}
	
	public ArrayList<String> getLst(){
		return list;
	}
}
