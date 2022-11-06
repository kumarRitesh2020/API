package serializatioandDeserialization;


import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import Pojo.EmployeeDetails;


public class SerializationofEmployeeDetails {
	
	@Test
	public void employeeDetails() throws JsonGenerationException, JsonMappingException, IOException {
		EmployeeDetails emp=new EmployeeDetails("rs", "tyss", 1234, "bangalore", "khg@gmail.com");
		ObjectMapper obj= new ObjectMapper();
		obj.writeValue(new File("employeeDetails.json"), emp);
		
		
		
	}

}
