package n1exercici2;

public class PresentialEmployee extends Employee{

	//ATTRIBUTES
	private static int fuelPrice;
	
	static {
		fuelPrice = 120;
	}
	
	//CONSTRUCTOR
	public PresentialEmployee(String name, String surname, int pricePerHour) {
		super(name, surname, pricePerHour);
	}

	@Override
	public int getSalary(int hours) {
		
		return (hours*pricePerHour)+fuelPrice;
	}
}
