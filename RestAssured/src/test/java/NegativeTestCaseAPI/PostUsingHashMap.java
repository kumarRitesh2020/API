package NegativeTestCaseAPI;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import RandomNumber.RandomNum;
import io.restassured.http.ContentType;

public class PostUsingHashMap {
	RandomNum ran=new RandomNum();
	
	
	@Test
	public void testPost() {
		
		Map map=new HashMap();
		
		map.put("createdBy", "ankur");
		map.put("projectName", "asd"+ran.random());
		map.put("status", "gjj");
		map.put("teaamSize", 144);		
		
		given().body(map).contentType(ContentType.JSON)
		
		
		.when().post("http://rmgtestingserver:8084/addProject")
		.then().statusCode(200).log().all();
		
	}
}


