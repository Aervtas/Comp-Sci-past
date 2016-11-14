
public class DogYears {
	public int convertToHumanAge(int dogYears){
		int ratio = 3, hyears;
		
		hyears = ratio*(dogYears-1) + 13;
		return hyears;
	}
	public int convertToDogAge(int hYears){
		int ratio = 3, dyears;
		
		dyears = (hYears-13)/ratio+1;
		return dyears;
	}
}
