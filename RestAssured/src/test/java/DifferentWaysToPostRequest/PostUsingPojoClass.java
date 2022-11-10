package DifferentWaysToPostRequest;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import Pojo.PostRequestInPojo;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostUsingPojoClass {
	
	@Test
	public void pojo() throws JsonGenerationException, JsonMappingException, IOException {
		PostRequestInPojo pj=new PostRequestInPojo("RAJ1235", "TATA1238", "PASS1293", 18700);
		ObjectMapper obj= new ObjectMapper();
		obj.writeValue(new File("./PostUsingPojoClass.json"), pj);
		
		given()
		.body(pj)
		.contentType(ContentType.JSON)
		.when()
		.post("http://rmgtestingserver:8084/addProject").then().statusCode(201).log().all();
		
	}
	
	

}
