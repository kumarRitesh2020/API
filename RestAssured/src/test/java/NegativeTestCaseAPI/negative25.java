package NegativeTestCaseAPI;


import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import RandomNumber.RandomNum;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class negative25 {
@Test
public void get()
{
	
	RandomNum r=new RandomNum();
    JSONObject ob=new JSONObject();
    ob.put("createdBy", "Bhanu");
	ob.put("projectName", "SMS"+r.random());
	ob.put("Status", "Completed");
	ob.put("teamSize", 5);
//	given()
//	.body(ob)
//	.contentType(ContentType.JSON)

	when()
	.post("http://rmgtestingserver:8084/addProject")

	.then()
	.statusCode(201)
	.statusLine("HTTP/1.1 201 ")
	
	.log().all();
	

}
}
