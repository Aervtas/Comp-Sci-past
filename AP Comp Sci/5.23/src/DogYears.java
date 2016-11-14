
public class DogYears {
	public int convertToHumanAge(int dogYears){
		int ratio = 3, hyears;
		
		hyears = ratio*(dogYears-1) + 13;
		return hyears;
	}
}
