package NegativeTestCaseAPI;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import RandomNumber.RandomNum;
import io.restassured.http.ContentType;

public class Negative3 {
	RandomNum ran=new RandomNum();
	@Test
	public void Negative3Test()
	{
		JSONObject ob=new JSONObject();
		ob.put("CreatedBy","Sachi");
		ob.put("ProjectName","tms"+ran.random());
		ob.put("Status","completed");
		ob.put("TeamSize",5);
		given()
		.body(ob)
		.contentType(ContentType.JSON)
		.when()
		.post("http://rmgtestingserver:8084/addProject")
		.then()
		.assertThat().statusCode(201)
		.log().all();
	}

}
