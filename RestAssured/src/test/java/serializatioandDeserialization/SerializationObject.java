package serializatioandDeserialization;

import org.testng.annotations.Test;

import Pojo.EmployeeDetailsWithStringArray;
import Pojo.spouse;

public class SerializationObject {
	
	spouse sp=new spouse("s","d",123);
	@Test
	public void employeeObject() {

		
		
		EmployeeDetailsWithStringArray em=new EmployeeDetailsWithStringArray("sra","des",1233);
		
	}

}
