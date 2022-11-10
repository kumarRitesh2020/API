package pathParameterRestAssured;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import RandomNumber.RandomNum;
import io.restassured.http.ContentType;

public class pathParameterPost {
	
@Test
	
	public void pathPostTest() {
	
	RandomNum ran=new RandomNum();
	
	JSONObject jobj= new JSONObject();
	jobj.put("createdBy", "Goa");
	jobj.put("projectName", "P"+ran.random());
	jobj.put("status", "Mumbai");
	jobj.put("teaamSize", 150);
		baseURI="http://rmgtestingserver";
		port=8084;
		given()
		.body(jobj)
		.contentType(ContentType.JSON)
		.pathParam("rit", "TY_PROJ_5530" )
		
		.when().put("/projects/{rit}")
		.then().assertThat().statusCode(200).log().all();
		
		
	
	}

}


