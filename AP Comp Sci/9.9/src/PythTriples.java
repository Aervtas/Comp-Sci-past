
public class PythTriples {
	public int[] makePythagoreanTriple(int m, int n){
		int[] triple = new int[3];
		
		triple[0] = (int) (Math.pow(m, 2) - Math.pow(n, 2));
		triple[1] = 2 * m * n;
		triple[2] = (int) (Math.pow(m, 2) + Math.pow(n, 2));
		
		return triple;
	}
}
