package terminal;


public class ticketCancel extends ticketBooking  {
	
	public ticketCancel(String passengerInput, String passengerDestination, boolean isDestinationInternational, String passengerDateOfDeparture, String passengerName, String passengerAge, String passengerGender,String passengerID, String passengerContactNumber, FlightInfo[] flightInfo, String passengerFlightInput, String passengerFlightInputCargo) {
		super(passengerInput, passengerDestination, isDestinationInternational, passengerDateOfDeparture, passengerName,passengerAge, passengerGender, passengerID, passengerContactNumber, passengerFlightInput, passengerFlightInputCargo, flightInfo);
	}

	public void ticketCancelled() {
		if(isSuccessful) {
			System.out.println("Your ticket has been cancelled.");
			isSuccessful=false;
			flightInfo[i1].MaxCapacity++;
			}
		else {
			System.out.println("Sorry, You haven't booked the ticket.");
		}
	}

}