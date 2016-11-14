
public class WutDate {
	public String dmChange(String s){
		String n="Date is not in correct format.";
		char k = '/', p = '-'; 
		
		if(s.indexOf(k) != (-1)){
			int firstPos = s.indexOf(k);
			int secondPos = s.indexOf(k, firstPos+1);
			
			return s.substring(firstPos+1, secondPos)+"-"+s.substring(0, firstPos)+"-"+s.substring(secondPos+1, s.length());
		}
		else if(s.indexOf(p) != (-1)){
			int firstPos = s.indexOf(p);
			int secondPos = s.indexOf(p, firstPos+1);
			
			return s.substring(firstPos+1, secondPos)+"-"+s.substring(0, firstPos)+"-"+s.substring(secondPos+1, s.length());
		}
		else
			return n;
		
		
		
	}
}
