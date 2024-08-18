package airportManagement;

public class Pilot {
	
	public String [] pilotName;
	public boolean isFlightAlloted;
	public String FlightID;
	
	public Pilot( boolean isFlightAlloted, String FlightID,String...pilotName) {
		this.isFlightAlloted=isFlightAlloted;
	    this.pilotName=pilotName;
		this.FlightID=FlightID;
	}
	public Pilot() {
		this.isFlightAlloted=false;
		this.FlightID=null;
		this.pilotName=null;
	//	pilotName= {null,null};
	}

}
