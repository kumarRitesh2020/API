package NegativeTestCaseAPI;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import RandomNumber.RandomNum;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class PostwithBdd {
	
	RandomNum ran=new RandomNum();
	
	@Test
	public void createProject() {
		
		Random rand=new Random();
		int r=rand.nextInt(1000);
		JSONObject jobj= new JSONObject();
		jobj.put("createdBy", "q");
		jobj.put("projectName", "u"+ran);
		jobj.put("status", "g");
		jobj.put("teaamSize", 142);
		
		//pre condition
		
		given().body(jobj).contentType(ContentType.JSON).when().post("http://rmgtestingserver:8084/addProject").then().statusCode(201).log().all();
		
		
	}
	

}
