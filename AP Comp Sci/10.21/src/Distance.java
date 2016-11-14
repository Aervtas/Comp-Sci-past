
public class Distance {
	public static int distance(Location loc1, Location loc2){
		int total=0, temp;
		if(Math.abs(loc1.getRow()-loc2.getRow())>Math.abs(loc2.getCol()-loc1.getCol())){
			total += Math.abs(loc2.getCol()-loc1.getCol());
			temp = total;
			total += Math.abs(loc1.getRow()-loc2.getRow()) - temp;
		}
		else{
			total += Math.abs(loc2.getRow()-loc1.getRow());
			temp = total;
			total += Math.abs(loc1.getCol()-loc2.getCol()) - temp;
		}
		return total;
	}
}
