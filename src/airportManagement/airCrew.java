package airportManagement;

public class airCrew {
	
	public String airCrewName;
	public boolean isFlightAlloted;
	public String FlightID;
	
	public airCrew( String airCrewName, boolean isFlightAlloted, String FlightID) {
		this.isFlightAlloted=isFlightAlloted;
		this.airCrewName=airCrewName;
		this.FlightID=FlightID;
	}
	public airCrew() {
		this.isFlightAlloted=false;
		this.FlightID=null;
		this.airCrewName=null;
	}

}
