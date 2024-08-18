package airportManagement;
import terminal.*;
public class cargoPlane extends typeOfPlane{
	
	public String typeOfPlane;
	static String std="Standard";
	static String prm="Premium";
	
	cargoPlane(String typeOfPlane){
		super(typeOfPlane);
	}
	
	
	public void PlaneType() {
		if(ticketBooking.typeOfGood.equals("Premium")) {
			typeOfPlane=prm;
		}
		else {
			typeOfPlane=std;
		}

	}
	
	public String getTypeofPlane() {
		return this.typeOfPlane;
	}

}
