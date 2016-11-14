
public class ArrayManip {
	public static double positiveMax(double[][] m){
		double biggest=0;
		
		
		for(int i=0; i<m.length; i++)
			for(int j=0; j<m[i].length; j++)
				if(m[i][j]>biggest)
					biggest = m[i][j];
		
		return biggest;
	}
	
	public static boolean covers(double[][] m1, double[][] m2){
		boolean test = false;
		int wins=0, loss=0;
		
		for(int i=0; i<m1.length; i++)
			for(int j=0; j<m1[i].length; j++){
				if(m1[i][j] > m2[i][j])
					wins++;
				else
					loss++;
			}
		if(wins >= loss)
			test = true;
		return test;
	}
	
	public double average(int[] scores){
		double a=0;
		
		for(int i=0; i<scores.length; i++)
			a += scores[i];
		
		a /= scores.length;
		return a;
	}
	
	public boolean isMedian(double[] sample, double m){
		boolean test = false;
		int lower=0, higher=0;
		
		for(int i=0; i<sample.length; i++){
			if(sample[i]>m)
				higher++;
			if(sample[i]<m)
				lower++;
		}
		System.out.println(higher+"    "+lower);
		if(higher == lower)
			test = true;
		return test;
	}
}
