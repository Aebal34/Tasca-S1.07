package n3exercici1;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

public class  SerializeJson { 

	public static void serializeToJson(Object object, String fileName) throws StreamWriteException, DatabindException, IOException {
		
		ObjectMapper om = new ObjectMapper();
		
		JsonSerialization anotation = object.getClass().getAnnotation(JsonSerialization.class);
		
		om.writeValue(new File(anotation.directory()+fileName), object);
	}
	
	public static Customer deserializeCustomerFromJson(String fileName) throws StreamReadException, DatabindException, IOException {
		
		ObjectMapper om = new ObjectMapper();
		
		JsonSerialization anotation = Customer.class.getAnnotation(JsonSerialization.class);
		
		return om.readValue(new File(anotation.directory()+fileName), Customer.class);
	}
}
