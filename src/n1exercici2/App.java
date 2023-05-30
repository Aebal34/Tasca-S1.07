package n1exercici2;

public class App {

	public static void main(String[] args) {

		Employee e1 = new Employee("Juan", "Gonzalez", 17);
		Employee e2 = new RemoteEmployee("Alberto", "Smith", 17);
		Employee e3 = new PresentialEmployee("Ana", "Paredes", 17);
		
		System.out.println(e1.getSalary(160));
		System.out.println(e2.getSalary(160));
		System.out.println(e3.getSalary(160));
	}
}
