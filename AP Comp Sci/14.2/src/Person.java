import java.util.ArrayList;

public class Person implements Comparable<Person>{

	private String lastN, firstN;
	
	public Person(String f, String l){
		lastN = l;
		firstN = f;		
	}
	
	
	public String getFirstName(){
		return firstN;
	}
	
	public String getLastName(){
		return lastN;
	}

	@Override
	public int compareTo(Person o) {
		if(lastN.compareTo(o.lastN) == 0)
			return firstN.compareTo(o.firstN);
		return lastN.compareTo(o.lastN);
	}
	
	public String toString(){
		return firstN+" "+lastN;
	}
}
