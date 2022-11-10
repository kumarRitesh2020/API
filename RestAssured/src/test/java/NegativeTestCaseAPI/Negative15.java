package NegativeTestCaseAPI;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class Negative15 {
	@Test
	public void asertion()
	{
		JSONObject ob=new JSONObject();
		ob.put("createdBy", "BABU");
		ob.put("projectName", "HMS");
		ob.put("TeamSize", 5);
		ob.put("Status", "Completed");
		given()
		.body(ob)
		.contentType(ContentType.JSON)
		.when()
		.post("http://rmgtestingserver:8084/addProject")
		.then()
		.assertThat()
	    .time(Matchers.lessThan(200L),TimeUnit.MILLISECONDS)
	   
		.log().all();
	}

}
