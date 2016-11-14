
public class Mellow {
	public int melCount(String sub, String s){
		int slen = sub.length(), count=0;
		for(int i=s.length()-1-slen; i>0; i--)
			if(sub.equals(s.substring(i, i+slen)))
				count++;
		return count;
	}
}
