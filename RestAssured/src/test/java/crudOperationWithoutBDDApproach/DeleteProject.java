package crudOperationWithoutBDDApproach;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteProject {
	
	@Test
	
	public void getProjectTest() {
			
			//As we are using DELETE Method-->No body
			
			//preconditions
			
			RequestSpecification reqSpec=RestAssured.given();
			
			//actions
			
			//Response res=reqSpec.post("http://localhost:8084/addProject");
			Response res=reqSpec.delete("https://reqres.in/api/users/2");
			
			//validation
			int code=res.getStatusCode();
			Assert.assertEquals(code, 204);
		}

	}






