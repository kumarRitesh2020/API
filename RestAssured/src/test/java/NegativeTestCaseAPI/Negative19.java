package NegativeTestCaseAPI;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static  io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class Negative19 {
	@Test
	public void Negative()
	{
		JSONObject o=new JSONObject();
		o.put("createdBy", "PAWAN");
		o.put("projectName", "SALES");
		o.put("teamSize", 5);
		o.put("status", "done");
		
   given()
   .body(o)
   .contentType(ContentType.HTML)
   .when()
   .post("http://rmgtestingserver:8084/projects")
   .then()
   .statusCode(201)
   .time(Matchers.lessThan(2000L),TimeUnit.MILLISECONDS)
   .log().all();
   
   
	}

}
