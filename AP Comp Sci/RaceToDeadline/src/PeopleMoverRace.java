
public class PeopleMoverRace implements VehicleInfo, RaceCourse{

	private int maxSpeed, maxP, fuel;
	private double mpg, distance, days, cost;
	private String vehicle;
	
	public PeopleMoverRace(double d, int ms, int mp, int f, String Vehicle){
		distance = d;
		maxSpeed = ms;
		maxP = mp;
		this.mpg = mpg;
		fuel = f;
		mpg = Math.pow(.94, Math.abs(ms-50)/10.0);
		vehicle = Vehicle;
		
		FuelPrice();
		calcDays();
		calcCosts();
	}
	
	public String VehicleType() {
		return vehicle;
	}

	
	public int MaxPassengers() {
		return maxP;
	}
	
	
	public int MaxSpeed() {
		return maxSpeed;
	}

	
	public double MilesPerGallon() {
		return mpg;
	}

	
	public int FuelCapacity() {
		return fuel;
	}

	
	public double Distance() {
		return distance;
	}
	
	public double totalDistance(){
		return distance*trips();
	}

	
	public String StartCity() {
		return "Randolph, Nj";
	}

	
	public String FinishCity() {
		return "Juneau, Alaska";
	}

	
	public double FuelPrice() {					//calculate all fuel prices			done
		int a = (int) (distance/1000);
		double sum=0, price=1.35;
		for(int i=0; i<a; i++){
			sum+=1000*price;
			price+=price*.1;
		}
		sum+=(distance%1000)*price;
		return sum*trips();
	}
	
	public double calcDays(){					//calculate total time in days		done
		double hours = totalDistance()/maxSpeed;
		days = hours/24;
		//find sleep time
		int temp = (trips()-1)/2;
		days += (Distance()/24*6*temp)/24.0;
		//15 minutes for every time tank hits 1/4th full
		days += ((totalDistance()/mpg)/fuel)*(15/1440);
		return days;
	}
	
	public double calcCosts(){					//calculate total costs				done
		double temp=0;
		temp += FuelPrice();
		temp += 6*((calcDays()*24)/4);			//find food cost
		//find lodging cost
		int tb = (trips()-1)/2;
		temp += (tb*Distance()/maxSpeed/24)*50;
		return temp;
	}
	
	public String toString(){					//this is it
		return vehicle+": \nDays: "+calcDays()+"\nCosts: "+calcCosts()+"\n";
	}
	
	private int trips(){						//this is for 1 trip to or back not and		done
		double t = 40/(maxP-1);
		if(t%1 > 0)
			t+=1;
		return ((int)t)*2-1;
	}
}
