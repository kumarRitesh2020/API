package DifferentWaysToPostRequest;

import static io.restassured.RestAssured.given;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import RandomNumber.RandomNum;
import io.restassured.http.ContentType;

public class PostUsingJsonObject {
	
RandomNum ran=new RandomNum();
	
	@Test
	public void postObject() {
		
		Random rand=new Random();
		int r=rand.nextInt(1000);
		JSONObject jobj= new JSONObject();
		jobj.put("createdBy", "q1");
		jobj.put("projectName", "o"+ran);
		jobj.put("status", "gy");
		jobj.put("teaamSize", 149);
		
		//pre condition
		
		given()
		.body(jobj)
		.contentType(ContentType.JSON)
		.when()
		.post("http://rmgtestingserver:8084/addProject")
		.then()
		.statusCode(201).log().all();
		
		
	}
	

}



