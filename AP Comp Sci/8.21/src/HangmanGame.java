
public class HangmanGame {
	private String word="", tried="";
	private StringBuffer guessed;
	
	HangmanGame(String s){
		word = s;
		guessed = new StringBuffer(s.length());
		for(int i=0; i<s.length(); i++){
			guessed.append("-");
		}
	}
	
	public String getTried(){
		return tried;
	}
	
	public String getGuessed(){
		return guessed.toString();
	}
	
	public String getWord(){
		return word;
	}
	
	public int tryLetter(char c){
		String p=""+c;
		if(tried.contains(p))
			return 0;
		if(word.contains(p)){
			tried += " "+p;
			for(int i=0;i<word.length();i++){
				if(word.substring(i,i+1).equals(p))
					guessed.setCharAt(i, c);
			}
			return 1;
		}
		else{
			tried += " "+p;
			return -1;
		}
	}
}
