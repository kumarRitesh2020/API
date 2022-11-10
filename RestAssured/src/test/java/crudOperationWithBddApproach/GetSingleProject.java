package crudOperationWithBddApproach;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;
public class GetSingleProject {

	
	@Test
	public void testGetSingle() {
		
		JSONObject jobj= new JSONObject();
		
		
		//pre condition
		
		given().body(jobj).contentType(ContentType.JSON).when().get("http://rmgtestingserver:8084/project/TY_PROJ_4274").then().statusCode(200).log().all();
		
		
	}
	

}


