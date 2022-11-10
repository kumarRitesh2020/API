package NegativeTestCaseAPI;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import RandomNumber.RandomNum;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class Negative23 {
	@Test
	public void createProject()
	{
JSONObject ob=new JSONObject();
RandomNum r=new RandomNum();
ob.put("createdBy", "RIT");
ob.put("projectName", "SMS"+r.random());
ob.put("Status", "Done");
ob.put("teamSize", 5);

given()
.body(ob)
.contentType(ContentType.JSON)

.when()
.put("http://rmgtestingserver:8084/projects/TY_PROJ_4234")

.then()
.statusCode(200)
.statusLine("http 201 ")
.log().all();





				
	}
	

		

	

}
