package n2exercici1;

import java.io.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@JsonSerialization(directory = "D:\\eclipse-workspace\\S1_07\\src\\n2exercici1")
public class Customer implements Serializable{

	//ATTRIBUTES
	private String name;
	private String DNI;
	private int age;
	@JsonIgnore
	private String password;	
	
	//CONSTRUCTORS
	public Customer(String name, String dNI, int age) {
		this.name = name;
		DNI = dNI;
		this.age = age;
	}
	public Customer() {
		
	}
	
	//GETTERS & SETTERS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", DNI=" + DNI + ", age=" + age + ", password=" + password + "]";
	}
}
