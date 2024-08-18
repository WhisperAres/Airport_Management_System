package terminal;

public class Domestic extends typeOfPlane implements Terminal{
	
	Domestic(String type){
		super(type);
	}
	
	public String getTerminal() {
		return "Domestic";
	}
}
