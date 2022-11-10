package NegativeTestCaseAPI;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import RandomNumber.RandomNum;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class Negatie30 {
@Test
public void get()
{
	
	RandomNum r=new RandomNum();
    JSONObject ob=new JSONObject();
    ob.put("createdBy", "anu");
	ob.put("projectName", "Sales"+r.random());
	ob.put("Status", "pass");
	ob.put("teamSize", 5);
	given()
	.body(ob)
	.contentType(ContentType.JSON)

	.when()
	.put("http://rmgtestingserver:8084/projects")

	.then()
	.statusCode(300)
	.statusLine("HTTP/1.1201 ")
	
	.log().all();
	

}
}
