package NegativeTestCaseAPI;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Negative21 {
	@Test
	public void postNegativeTest()
	{
		JSONObject jso=new JSONObject();
		when()
		.get("http://rmgtestingserver:8084/projects")
		.then()
		.statusCode(200)
		.log().all();
		
		
	}

}
