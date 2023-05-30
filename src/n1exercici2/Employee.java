package n1exercici2;

public class Employee {

	//ATTRIBUTES
	protected String name;
	protected String surname;
	protected int pricePerHour;
	
	//CONSTRUCTOR
	public Employee(String name, String surname, int pricePerHour) {
		super();
		this.name = name;
		this.surname = surname;
		this.pricePerHour = pricePerHour;
	}
	
	//GETTERS & SETTERS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getPricePerHour() {
		return pricePerHour;
	}
	public void setPricePerHour(int pricePerHour) {
		this.pricePerHour = pricePerHour;
	}
	
	//METHODS
	
	protected int getSalary(int hours) {
		
		return hours*pricePerHour;
	}
}
