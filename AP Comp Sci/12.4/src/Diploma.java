
public class Diploma {
	
	private String p, name;
	
	Diploma(String n, String s) {
		p = s;
		name = n;
	}
	
	public String toString(){
		return "This certifies that "+name+"\nhas completed a MOOC in "+p;
	}
}
