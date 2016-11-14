
public class BuncoGame {
	private int point[] = {0, 0, 0};
	private int rnum=1, twithd=1, rwin[]={0, 0, 0};
	private boolean turnC=false, fdie=false;
	EasySound hoi = new EasySound("C:/Users/Kevin Lin/Documents/C++ and Java/AP Comp Sci/BuncoBench/donkey_x.wav");

	public int processRoll(int[] die, int rnum, int turn)
	{
		int result=0;
		int fIndicator=0;

		for(int i=0; i<3; i++){
			if(die[i] == rnum)
				result++;
			if((die[i]==1 || die[i]==3 || die[i]==5)&&(die[0]!=die[1] && die[0]!=die[2] && die[1]!=die[2]))		//checks if the dies match and are different
				fIndicator++;
		}
		point[turn]+=result;

		if(fIndicator == 3)
			fdie = true;

		if(result == 3)
			return 700;

		if(fdie){
			result += twithd;
			twithd++;
		}

		if(result == 0)
			turnC = true;

		if(fdie==true && twithd==1)
			turnC = false;

		if(die[0] == die[1] && die[1]==die[2])
			result += 3;
		
		return result;
	}

	public boolean fuzzdice(){
		return fdie;
	}

	public int getWins(int turn){
		return rwin[turn];
	}

	public void roundOver(){
		for(int i=0; i<3; i++)
			point[i] = 0;
		rnum++;
		sound();
	}

	public int Round(){
		return rnum;
	}

	public boolean turn(){
		if(turnC == true){
			turnC = false;
			return true;
		}
		else
			return turnC;
	}

	/**
	 * Returns the saved point
	 */
	public int getPoint(int turn)
	{
		return point[turn];
	}

	public void sound(){
		hoi.play();
	}
}