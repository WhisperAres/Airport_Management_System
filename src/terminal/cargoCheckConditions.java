package terminal;

public class cargoCheckConditions {
	
	double maxAllowableWeight;
	String [] bannedItem;
	boolean isReadyForShipment;
	
	
	public cargoCheckConditions(double maxAllowableWeight, String [] bannedItem) {
		this.maxAllowableWeight=maxAllowableWeight;
		this.bannedItem=bannedItem;
		this.isReadyForShipment = false;
	}
	
	boolean CheckI = true;
	boolean CheckW = true;
	
	public void checkBannedItem(String[] cargoContent) {
		
		for(int i=0;i<cargoContent.length;i++) {
			for(int j=0;j<bannedItem.length;j++) {
				if(cargoContent[i]==bannedItem[j]) {
				
				System.out.println("This cargo has content which isnt allowed in the flight.");
				CheckI = false;
				i = cargoContent.length;
				break;
				}

			}
		}
		
	}
	
	public void checkWeight(double cargoWeight) {
		
		if(cargoWeight > maxAllowableWeight) {
			System.out.println("The cargo exceeds the max allowable Weight limit.");
			CheckW = false;
		}
		else {
			System.out.println("The cargo weight is in limit");
			
		}
	}
	
	public void SetisReadyForShipment() {
		if(CheckW && CheckI) {
			this.isReadyForShipment = true;
		}
	}

}


