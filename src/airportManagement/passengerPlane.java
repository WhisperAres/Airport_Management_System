package airportManagement;
import terminal.*;

public class passengerPlane extends typeOfPlane {
	public String typeOfPlane;
	
	passengerPlane(String typeOfPlane){
		super(typeOfPlane);
	}
	public void PlaneType() {
		typeOfPlane="Standard Passenger Plane";
		System.out.println("The Type of Plane is: "+typeOfPlane);
	}

}
