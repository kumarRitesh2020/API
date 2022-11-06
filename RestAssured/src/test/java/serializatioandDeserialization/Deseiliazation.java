package serializatioandDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import Pojo.EmployeeDetails;

public class Deseiliazation {
	
	@Test
	
	public void deserializationofEmployeeDetails() throws JsonParseException, JsonMappingException, IOException{
		
		ObjectMapper objo= new ObjectMapper();
		EmployeeDetails value=objo.readValue(new File("./employeeDetails.json"), EmployeeDetails.class);
		value.geteName();
		System.out.println(value.geteName());
		
		
	}

	
}
