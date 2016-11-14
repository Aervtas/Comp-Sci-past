
public class Time {
	
	private int hours, mins;
	
	public Time(int h1, int m1) {
		if((h1>24 || h1<0)||(m1>59 || m1<0))
			throw new IllegalArgumentException();
		hours = h1;
		mins = m1;
	}
	
	private int toMins(){
		return hours*60 + mins;
	}

	public boolean lessThan(Time t) {
		if(t.toMins()<toMins())
			return false;
		else
			return true;
	}

	public int elapsedSince(Time t) {
		if(t.toMins()<toMins())
			return toMins()-t.toMins();
		else
			return ((24*60)-t.toMins())+toMins();
	}
	
	public String toString(){
		return hours+":"+mins;
	}
}
