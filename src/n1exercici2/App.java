package n1exercici2;

public class App {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Employee e1 = new Employee("Juan", "Gonzalez", 17);
		RemoteEmployee e2 = new RemoteEmployee("Alberto", "Smith", 17);
		PresentialEmployee e3 = new PresentialEmployee("Ana", "Paredes", 17);
		
		System.out.println(e1.getSalary(160));
		System.out.println(e2.getSalary(160));
		System.out.println(e3.getSalary(160));
		
		System.out.println(e3.calculateFuel(2, 35));
		
		System.out.println(e2.getInternetPrice("Vodafone"));
			
	}
}
