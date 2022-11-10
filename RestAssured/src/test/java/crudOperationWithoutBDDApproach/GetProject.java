package crudOperationWithoutBDDApproach;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetProject {
	
	@Test
	
public void getProjectTest() {
		
		//As we are using GET Method-->No body
		
		//preconditions
		
		//RequestSpecification reqSpec=RestAssured.given();
		
		//actions
		
		//Response res=reqSpec.post("http://localhost:8084/addProject");
	//	Response res=reqSpec.get("https://reqres.in/api/users/2");
		
		baseURI="http://reqres.in";
		JSONObject jobj= new JSONObject();
		
		
		//pre condition
		
		given().body(jobj).contentType(ContentType.JSON).when().get("http://reqres.in/api/users/2").then().statusCode(200).log().all();
		
		
	}
	

}





