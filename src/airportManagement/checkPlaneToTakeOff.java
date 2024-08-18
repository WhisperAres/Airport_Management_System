package airportManagement;

public class checkPlaneToTakeOff {
	boolean isFuelEnough;
	boolean instrumentsCheck;
	boolean isBoardingDone;
	char runway;
	
	checkPlaneToTakeOff(boolean isFuelEnough, boolean instrumentsCheck, boolean isBoardingDone, char runway){
		this.instrumentsCheck=instrumentsCheck;
		this.isBoardingDone=isBoardingDone;
		this.isFuelEnough=isFuelEnough;
		this.runway=runway;
	}
	
	public void runwayAllotment() {
		if(this.instrumentsCheck && this.isBoardingDone && this.isFuelEnough) {
			System.out.println("You are ready to take off, please head to runway number"+runway);
		}
		else {
			System.out.println("You are not ready to take off!");
		}
	}

}
