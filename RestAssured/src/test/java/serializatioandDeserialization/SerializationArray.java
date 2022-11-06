package serializatioandDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import Pojo.EmployeeDetailsWithArray;

public class SerializationArray {
	
	@Test
	public void employeeDetailsArray() throws JsonGenerationException, JsonMappingException, IOException {
		int[] phoneNo= {7895245,678};
		
		EmployeeDetailsWithArray er=new EmployeeDetailsWithArray("RS","WS",phoneNo,456);
		ObjectMapper obji= new ObjectMapper();
		obji.writeValue(new File("employeeDetailsArray.json"), er);
		
		
	}

}
