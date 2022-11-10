package crudOperationWithBddApproach;


	
	import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class deleteProject {
	
	@Test
	public void deleteProject() {
			
			
				
			
				
				
				//pre condition
				
				when()
				.delete("http://rmgtestingserver:8084/projects/TY_PROJ_4261").then().statusCode(204).log().all();
				
				
			
			

		}}



