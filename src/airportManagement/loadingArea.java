package airportManagement;

public class loadingArea {
	int[] loadingGate = new int[5];

	loadingArea(int[] loadingGate)
	{
		this.loadingGate = loadingGate;
	}

		void showGate() {
			for(int i=0; i<5; i++)
			{
				if(loadingGate[i] == 0)
				{
					System.out.println("Loading of goods is to be done on Gate No.: "+(i+1)+". Thankyou.");
					loadingGate[i] = 1;
					break;
				}
			}
		}
}