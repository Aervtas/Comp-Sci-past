
public class LunchTime {
	
	static int minutesUntilLunch(int hour, int min){
		int mins, i;
		
		i = 12 - hour;
		mins = 60 - min;
		min = i*60 + mins;
		return min;
		
	}
}
