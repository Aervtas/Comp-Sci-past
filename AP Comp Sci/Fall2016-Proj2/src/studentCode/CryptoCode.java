package studentCode;

public class CryptoCode {
	//Handles ASCII 32 through ASCII 93
	static final char FIRST = ' ';
	static final char LAST = ']';

	static final int RANGE = LAST-FIRST+1;



	//YOUR CODE WILL BE DOWN HERE
	//AS YOU WORK ON EACH METHOD, DELETE THE "throw" LINE AND
	//   ADD YOUR CODE TO IMPLEMENT THE METHOD
	//TEST AS YOU GO TASK BY TASK

	public static boolean safeToUse(String plaintext) {
		plaintext = plaintext.toUpperCase();
		for(int i=0 ; i < plaintext.length() ; i++)
			if(plaintext.charAt(i)>93 || plaintext.charAt(i)<32)
				return false;
		return true;
	}

	public static String rot31(String message)
	{
		message = message.toUpperCase();
		String k = "";
		for(int i=0; i<message.length(); i++){
			if(93<(int)message.charAt(i)+ 31)
				k += (char)((int)message.charAt(i)+ 31-62);
			else
				k += (char)((int)message.charAt(i)+31);
		}
		return k;
	}


	public static String toCaesar(String plaintext, int shift)
	{
		plaintext = plaintext.toUpperCase();
		String k = "";
		for(int i=0; i<plaintext.length(); i++){
			if(93<(int)plaintext.charAt(i)+ shift)
				k += (char)((int)plaintext.charAt(i)+ shift-62);
			else
				k += (char)((int)plaintext.charAt(i)+shift);
		}
		return k;
	}

	public static String fromCaesar(String ciphertext, int shift)
	{
		String k = "";
		for(int i=0; i<ciphertext.length(); i++){
			if(32>(int)ciphertext.charAt(i)-shift)
				k += (char)((int)ciphertext.charAt(i)-shift+62);
			else
				k += (char)((int)ciphertext.charAt(i)-shift);
		}
		return k;
	}


	public static String toBellaso(String plaintext, String keyword){
		plaintext = plaintext.toUpperCase();
		keyword = keyword.toUpperCase();
		String key="";
		for(int i=0; i<plaintext.length();i++)
			key += keyword.charAt(i%keyword.length());
		String crypt="";
		for(int i=0; i<plaintext.length();i++){
			int shift = key.charAt(i)-32;
			if(plaintext.charAt(i)+shift > 93)
				crypt += (char)((plaintext.charAt(i)+shift)%93+31);
			else
				crypt += (char)(plaintext.charAt(i)+shift);
		}
		return crypt;
	}

	public static String fromBellaso(String ciphertext, String keyword){
		ciphertext = ciphertext.toUpperCase(); 
		keyword = keyword.toUpperCase();
		String key = "";
		String text = "";
		for(int i=0; i<ciphertext.length();i++)
			key += keyword.charAt(i%keyword.length());
		
		for(int i=0; i<ciphertext.length(); i++){
			int shift = key.charAt(i)-32;
			if(32 > (int)ciphertext.charAt(i)-shift)
				text += (char)(93-(31-((int)ciphertext.charAt(i)-shift)));
			else
				text += (char)((int)ciphertext.charAt(i)-shift);
		}
		return text;
	}


}


