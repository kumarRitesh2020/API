package crudOperationWithBddApproach;

import static io.restassured.RestAssured.given;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class ValidateUsingHamcrestPost {
	
	@Test
	public void createProject() {
		
		Random rand=new Random();
		int r=rand.nextInt(1000);
		JSONObject jobj= new JSONObject();
		jobj.put("createdBy", "q");
		jobj.put("projectName", "u"+r);
		jobj.put("status", "g");
		jobj.put("teaamSize", 142);
		
		//pre condition
		
		given().body(jobj).contentType(ContentType.JSON).when().post("http://rmgtestingserver:8084/addProject").then().assertThat().time(Matchers.lessThan(5000L),TimeUnit.MILLISECONDS).log().all();
		
		
	}
	

}



