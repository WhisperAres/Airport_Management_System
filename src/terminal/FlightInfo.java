package terminal;

public class FlightInfo{
	
	public String FlightID;
	String date_arrival;
	String date_departure;
	String time_arrival;
	String time_departure;
	String departure;
	String arrival;
	int MaxCapacity;
	int CurrentSeats;
	double price;
	boolean delay;
	
	
	FlightInfo(String FlightID,String date_arrival,String date_departure, String time_arrival,String time_departure, String departure, String arrival,int MaxCapacity,double price){
		
		
		this.FlightID = FlightID;
		this.date_arrival = date_arrival;
		this.date_departure = date_departure;
		this.time_arrival = time_arrival;
		this.time_departure = time_departure;
		this.departure = departure;
		this.arrival = arrival;
		this.MaxCapacity = MaxCapacity;
		this.CurrentSeats = 0;
		this.price = price;
		delay = false;
		
	}
	
	boolean OfferFood(boolean OfferFood) {
		return OfferFood;
	}
	
	boolean CanBook() {
		if(this.CurrentSeats < this.MaxCapacity)
			return true;
		
		else
			return false;
	}
	
	void setDelay(boolean delay){
		this.delay = delay;
	
	}
	
	String revisedTime(String revisedTime) {
		if(delay) {
			
			this.time_departure = revisedTime;
			return "Flight has been delayed. The revised time is: "+revisedTime+ ". Sorry for the inconvenience";
		}
		
		else {
			return "Flight is on time. Enjoy your trip.";
		}
	}
	
	

	public String ID() {
	return FlightID;
	}
	
	public String getTimeArrival() {
		return this.time_arrival;
	}
	
public double cost() {
	return this.cost();
}
public String getTimeDep() {
	return this.time_departure;
}

	
	
	
}
