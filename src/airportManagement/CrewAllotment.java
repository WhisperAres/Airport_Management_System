package airportManagement;
import terminal.*;

public class CrewAllotment {
	
	Pilot [] pilotsInternational;
	airCrew [] airCrewDomestic;
	
	public CrewAllotment(Pilot [] pilotsInternational, airCrew [] airCrewDomestic) 
	{
		
		this.airCrewDomestic=airCrewDomestic;
		this.pilotsInternational=pilotsInternational;
	}
	
	public void CrewAllotmentDomestic(FlightInfo flightInfo, Pilot...pilotsDomestic) {
	    try {
	        for (int i = 0; i < pilotsDomestic.length; i++) {
	            if (pilotsDomestic[i].isFlightAlloted) {
	                continue;
	            } else {
	                pilotsDomestic[i].FlightID = flightInfo.FlightID;
	                pilotsDomestic[i].isFlightAlloted = true;
	            }
	        }

	        for (int i = 0; i < airCrewDomestic.length; i++) {
	            if (airCrewDomestic[i].isFlightAlloted) {
	                continue;
	            } else {
	                airCrewDomestic[i].FlightID = flightInfo.FlightID;
	                airCrewDomestic[i].isFlightAlloted = true;
	            }
	        }
	    } catch (Exception e1) {
	        System.out.println("Exception caught: " + e1.getMessage());
	    }
	}

	public void CrewAllotmentInternational(FlightInfo flightInfo,airCrew...airCrewInternational) {
	    try {
	        for (int i = 0; i < pilotsInternational.length; i++) {
	            if (pilotsInternational[i].isFlightAlloted) {
	                continue;
	            } else {
	                pilotsInternational[i].FlightID = flightInfo.FlightID;
	                pilotsInternational[i].isFlightAlloted = true;
	            }
	        }

	        for (int i = 0; i < airCrewInternational.length; i++) {
	            if (airCrewInternational[i].isFlightAlloted) {
	                continue;
	            } else {
	                airCrewInternational[i].FlightID = flightInfo.FlightID;
	                airCrewInternational[i].isFlightAlloted = true;
	            }
	        }
	    } catch (Exception e2) {
	        System.out.println("Exception caught: " + e2.getMessage());
	    }
	}


}