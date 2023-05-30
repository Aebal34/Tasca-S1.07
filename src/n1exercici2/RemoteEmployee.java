package n1exercici2;

public class RemoteEmployee extends Employee {

	//ATTRIBUTES
	final private static int INTERNET_FEE = 40;
	
	//CONSTRUCTOR
	public RemoteEmployee(String name, String surname, int pricePerHour) {
		super(name, surname, pricePerHour);
	}

	
	@Override
	public int getSalary(int hours) {
		
		return (hours * pricePerHour)+INTERNET_FEE;
	}
}
