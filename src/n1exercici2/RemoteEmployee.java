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
	
	@Deprecated
	public int getInternetPrice(String company) {
		
		int price = 0;
		switch(company) {
		
			case "Lowi":
				price = 35;
				break;
			case "Vodafone":
				price = 75;
				break;
			case "Movistar":
				price = 90;
				break;
			case "Orange":
				price = 55;
				break;
			default:
				price = 45;
				break;
		}
		return price;
	}
}
