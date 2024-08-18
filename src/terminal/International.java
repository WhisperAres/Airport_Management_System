package terminal;

public class International extends typeOfPlane implements Terminal{

	public International(String type) {
		super(type);
	}
	
	public String getTerminal() {
		return "International";
	}
	
}
