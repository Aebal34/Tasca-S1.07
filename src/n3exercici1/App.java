package n3exercici1;

import java.io.IOException;

public class App {

	public static void main(String[] args) {
		Customer cust1 = new Customer ("Pepe", "44444444F", 33);
		Customer cust2 = new Customer ("Ana", "33333333E", 35);
		
		cust1.setPassword("1234abcd+-");
		
		//We write cust1 in a json file
		try {
			SerializeJson.serializeToJson(cust1, "\\Customer.json");
		}catch(IOException e) {
			e.getMessage();
		}
		
		//We read Customer.json and we store it in cust2
		try {
			cust2 = SerializeJson.deserializeCustomerFromJson("\\Customer.json");
			System.out.println(cust2);
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
