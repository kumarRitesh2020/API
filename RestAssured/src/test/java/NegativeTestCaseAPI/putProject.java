package NegativeTestCaseAPI;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;

public class putProject {
	
	@Test
	public void updateProject() {
		JSONObject jobj= new JSONObject();
		jobj.put("createdBy", "roshan");
		jobj.put("projectName", "aeroindia");
		jobj.put("status", "done");
		jobj.put("teaamSize", 670);
		
		//pre condition
		
		given().body(jobj).contentType(ContentType.JSON).when().put("http://rmgtestingserver:8084/projects/TY_PROJ_4243").then().statusCode(200).log().all();
		
		
	}
	

}


