package crudOperationWithBddApproach;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class GetAllProject {
	
	
		@Test
		public void testGet() {
			
			JSONObject jobj= new JSONObject();
			
			
			//pre condition
			
			given().body(jobj).contentType(ContentType.JSON).when().get("http://rmgtestingserver:8084/project").then().statusCode(200).log().all();
			
			
		}
		

	}
