package airportManagement;

public class gate{
public int[] isGateFree = new int[30];

gate(int[] isGateFree)
{
	this.isGateFree = isGateFree;
}

void showGate() {
	for(int i=0; i<30; i++)
	{
		if(isGateFree[i] == 0)
		{
			System.out.println("Your boarding will start 30 minutes prior to your flight departure time at Gate No.: "+(i+1)+". Thankyou.");
			isGateFree[i] = 1;
			break;
		}
	}
}
}