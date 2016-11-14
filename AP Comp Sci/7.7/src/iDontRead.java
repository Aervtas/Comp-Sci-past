
public class iDontRead {
	public int month, year=0;
	
	public void letsRead(){
		double num=100;
		for(month=0;num>=5;month++){
			num = num - (num*.1);
		}
		year = month/12;
		month = month%12;
	}
}
