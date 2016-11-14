
public class WhyComment {
	public String doIt(String s){
		int firstPos = s.indexOf("/*"), secondPos = s.indexOf("*/");
		
		if(firstPos> secondPos)
			return "The comments were not places correctly: "+s;
		else if(firstPos != -1 && secondPos != -1){
			return s.substring(0, firstPos)+s.substring(secondPos+2);
		}
		else
			return s;
		
	}
}
