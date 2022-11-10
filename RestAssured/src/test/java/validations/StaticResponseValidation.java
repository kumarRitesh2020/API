package validations;
import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class StaticResponseValidation {
	
	@Test
	public void staticTest() {
		
		String expData="TY_PROJ_1005";
		baseURI="http://rmgtestingserver";
		port=8084;
		
		//action
		Response resp=when()
				      .get("/projects");
		
		//validations
		
		String actData=resp.jsonPath().get("[0].projectId");
		Assert.assertEquals(actData, expData);
		System.out.println("data verified");
		resp.then().log().all();
		
	}

}
