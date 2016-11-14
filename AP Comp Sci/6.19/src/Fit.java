
public class Fit {
	
	public int findBestFit(int size1, int size2, int space){
		
		if(size1+size2<=space)
			return 3;
		else if(size1<=space || size2<=space){
			if(size1<=space){
				if(size2>space)
					return 1;
				else if(size1>=size2)
					return 1;
			}
			else if(size2<=space){
				if(size1>space)
					return 2;
				else if(size2>=size1)
					return 2;
			}
		}
		return 0;
	}
}
