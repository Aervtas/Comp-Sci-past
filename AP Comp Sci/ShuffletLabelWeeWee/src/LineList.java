import java.util.ArrayList;

public class LineList {

	ArrayList<String> list;

	public LineList(){
		list = new ArrayList<String>();
	}

	public int size() {
		return list.size();
	}

	public String get(int k) {
		return list.get(k);
	}

	public void add(String line) {
		list.add(line);
	}

	public String remove(int k) {
		list.remove(k);
		return list.get(k);
	}

	public void move(int index, int newIndex) {
		String temp = list.get(index);
		if(index>newIndex){
			list.remove(index);
			list.add(newIndex, temp);
		}
		else{
			list.add(newIndex, temp);
			list.remove(index);
		}
	}

	public void shuffle() {
		int n = list.size();
		for(int i=n;i>=2;i--){
			move(((int)(n*Math.random())), (int)(n*Math.random()));
		}
	}

}
