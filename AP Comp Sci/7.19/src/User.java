
public class User {

	public static void main(String[] args) {
		Tables hoi = new Tables();
		
		
		System.out.println("\t"+1+"\t"+2+"\t"+3+"\t"+4+"\t"+5+"\t"+6+"\t"+7+"\t"+8+"\t"+9+"\t"+10+"\t"+11+"\t"+12+"\t");
		
		for(int i=1; i<13; i++){
			System.out.print(i);
			hoi.multTable(i);
		}
	}

}
