import java.util.ArrayList;

public class Buckets {

	public ArrayList<ArrayList<String>> wut(ArrayList<String> words){
		
		ArrayList<ArrayList<String>> buckets = new ArrayList<>();
		ArrayList<String> a = new ArrayList<>();
		ArrayList<String> b = new ArrayList<>();
		ArrayList<String> c = new ArrayList<>();
		ArrayList<String> d = new ArrayList<>();
		ArrayList<String> e = new ArrayList<>();
		ArrayList<String> f = new ArrayList<>();
		ArrayList<String> g = new ArrayList<>();
		ArrayList<String> h = new ArrayList<>();
		ArrayList<String> i = new ArrayList<>();
		ArrayList<String> j = new ArrayList<>();
		ArrayList<String> k = new ArrayList<>();
		ArrayList<String> l = new ArrayList<>();
		ArrayList<String> m = new ArrayList<>();
		ArrayList<String> n = new ArrayList<>();
		ArrayList<String> o = new ArrayList<>();
		ArrayList<String> p = new ArrayList<>();
		ArrayList<String> q = new ArrayList<>();
		ArrayList<String> r = new ArrayList<>();
		ArrayList<String> s = new ArrayList<>();
		ArrayList<String> t = new ArrayList<>();
		ArrayList<String> u = new ArrayList<>();
		ArrayList<String> v = new ArrayList<>();
		ArrayList<String> w = new ArrayList<>();
		ArrayList<String> x = new ArrayList<>();
		ArrayList<String> y = new ArrayList<>();
		ArrayList<String> z = new ArrayList<>();
		buckets.add(a);
		buckets.add(b);
		buckets.add(c);
		buckets.add(d);
		buckets.add(e);
		buckets.add(f);
		buckets.add(g);
		buckets.add(h);
		buckets.add(i);
		buckets.add(j);
		buckets.add(k);
		buckets.add(l);
		buckets.add(m);
		buckets.add(n);
		buckets.add(o);
		buckets.add(p);
		buckets.add(q);
		buckets.add(r);
		buckets.add(s);
		buckets.add(t);
		buckets.add(u);
		buckets.add(v);
		buckets.add(w);
		buckets.add(x);
		buckets.add(y);
		buckets.add(z);
		int pnum = words.size();
		
		for(int inum=0; inum<pnum; inum++){
			for(int jnum=0; jnum<26; jnum++){
				if(words.get(inum).charAt(0) == ((char)(jnum+97)) || words.get(inum).charAt(0) == ((char)(jnum+65))){
					buckets.get(jnum).add(words.get(inum));
				}
			}
		}
		
		
		
		return buckets;
	}
}
