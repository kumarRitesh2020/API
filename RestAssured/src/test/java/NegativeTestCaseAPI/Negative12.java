package NegativeTestCaseAPI;


import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import RandomNumber.RandomNum;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class Negative12 {
	@Test
	public void createProject()
	{
JSONObject ob=new JSONObject();
RandomNum r=new RandomNum();
ob.put("createdBy", "Suresh");
ob.put("projectName", "Z"+r.random());
ob.put("Status", "pass");
ob.put("teamSize", 5);
when()
.put("http://rmgtestingserver:8084/projects/TY_PROJ_4234")

.then()
.statusCode(200)
.log().all();





				
	}
	

		

	

}
