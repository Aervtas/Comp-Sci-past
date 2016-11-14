
public class Palindrome {
	public boolean isPalindrome(String word){
		boolean so = false;
		String drow="";
		word = word.replace(',', ' ');
		word = word.replace('~', ' ');
		word = word.replace('`', ' ');
		word = word.replace('"', ' ');
		word = word.replace('.', ' ');
		word = word.replace('?', ' ');
		word = word.replace('<', ' ');
		word = word.replace('>', ' ');
		word = word.replace('[', ' ');
		word = word.replace(']', ' ');
		word = word.replace('{', ' ');
		word = word.replace('}', ' ');
		word = word.replace('|', ' ');
		word = word.replace(':', ' ');
		word = word.replace(';', ' ');
		word = word.replace('\'', ' ');
		word = word.replace('/', ' ');
		word = word.replace('!', ' ');
		word = word.replace('@', ' ');
		word = word.replace('#', ' ');
		word = word.replace('$', ' ');
		word = word.replace('%', ' ');
		word = word.replace('^', ' ');
		word = word.replace('&', ' ');
		word = word.replace('*', ' ');
		word = word.replace('(', ' ');
		word = word.replace(')', ' ');
		word = word.replace('-', ' ');
		word = word.replace('_', ' ');
		word = word.replace('+', ' ');
		word = word.replace('=', ' ');
		word = word.toLowerCase();
		word = word.replaceAll(" ", "");
		
		
		for(int i=word.length()-1;i>=0;i--){
			drow = drow + word.charAt(i);
		}
		
		if(drow.equals(word))
			so = true;
		
		return so;
	}
	}
