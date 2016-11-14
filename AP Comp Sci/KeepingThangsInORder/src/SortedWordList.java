import java.util.ArrayList;

public class SortedWordList {

	ArrayList<String> list;

	public SortedWordList(int i) {
		list = new ArrayList<>(i);
	}

	public SortedWordList() {
		list = new ArrayList<>();
	}

	public boolean add(String string) {
		if(contains(string)){
			return false;
		}
		if(list.size()==0){
			return list.add(string);
		}
		int z=0;
		while(z<list.size()){
			if(list.get(z).compareTo(string)>0){
				list.add(z, string);
				return true;
			}
			z++;
		}
		return list.add(string);
	}

	public void add(int i, String string) {
		if(list.size()<i)
			throw new IllegalArgumentException("word="+string+" i="+i);

		if(i == list.size() && list.get(i-1).compareTo(string)<0)
			add(string);
		else if(i>=1 && list.get(i-1).compareTo(string)<0 && list.get(i).compareTo(string)>0)
			list.add(i, string);
		else if(i==0 && list.get(i).compareTo(string)>0)
			list.add(i, string);
		else
			throw new IllegalArgumentException("word="+string+" i="+i);
	}

	public String set(int i, String string) {
		if(list.size()<=i)
			throw new IllegalArgumentException("word="+string+" i="+i);

		String prev = string;

		if(i==0 && list.get(i).compareTo(string)<0)
			prev = list.set(i, string);
		else if(list.get(i-1).compareTo(string)<0 && list.get(i+1).compareTo(string)>0){
			prev = list.set(i, string);
		}
		else if(contains(string))
			prev = string;
		else
			throw new IllegalArgumentException("word="+string+" i="+i);
		return prev;
	}

	public boolean contains(String string) {
		if(list.size()==0)
			return false;
		if(list.size()==1)
			return string.equals(list.get(0));

		int begin=0, end=list.size(), mid=(int)((begin+end)/2), t=0;
		while(t==0){
			if(string.compareTo(list.get(mid))>0){
				begin = mid;
				mid=(int)((begin+end)/2);
			}
			else if(string.compareTo(list.get(mid))<0){
				end = mid;
				mid=(int)((begin+end)/2);
			}
			else if(string.compareTo(list.get(mid))==0){
				return true;
			}
			if(begin==mid || mid==end){
				t=1;
			}
		}
		return false;
	}

	public int indexOf(String string) {
		if(!contains(string))
			return -1;
		if(list.size()==1)
			return 1;
		int begin=0, end=list.size(), mid=(begin+end)/2, t=-1;
		while(t==-1){
			if(string.compareTo(list.get(mid))>0){
				begin = mid;
				mid=(int)((begin+end)/2.0+.5);
			}
			else if(string.compareTo(list.get(mid))<0){
				end = mid;
				mid=(int)((begin+end)/2.0+.5);
			}
			else if(string.compareTo(list.get(mid))==0){
				t=mid;
			}
			if(begin==mid || mid==end){
				break;
			}
		}
		return t;
	}



	public String toString(){
		return list.toString();
	}
}