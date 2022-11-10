package NegativeTestCaseAPI;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static  io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class Negative18 {
	@Test
	public void Negative()
	{
		JSONObject o=new JSONObject();
		o.put("createdBy", "PREM");
		o.put("projectName", "SALE");
		o.put("teamSize", 5);
		o.put("status", "done");
		
   given()
   .body(o)
   .contentType(ContentType.JSON)
   .when()
   .post("http://rmgtestingserver:8084/AddProject")
   .then()
   .statusCode(201)
   .time(Matchers.lessThan(2000L),TimeUnit.MILLISECONDS)
   .log().all();
   
   
	}

}
