package NegativeTestCaseAPI;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import RandomNumber.RandomNum;
import io.restassured.http.ContentType;

public class negative7 {
	
	@Test
	public void Negative1()
	{
		RandomNum ran=new RandomNum();
		JSONObject ob=new JSONObject();
		ob.put("createdBy","Mahesh");
		ob.put("projectName","tms"+ran.random());
		ob.put("status","completed");
		ob.put("teamSize",5);
		given()
		.body(ob)
		.contentType(ContentType.ANY)
		.when()
		.post("http://rmgtestingserver:8084/addProject")
		.then()
		.assertThat().statusCode(201)
		
		.log().all();
	}

}
