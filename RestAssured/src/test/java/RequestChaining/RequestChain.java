package RequestChaining;

import static io.restassured.RestAssured.given;

import java.util.Random;
import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import RandomNumber.RandomNum;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class RequestChain {
	
	
	@Test
	public void requestChaining() {
		baseURI="http://rmgtestingserver";
		port=8084;
		RandomNum ran=new RandomNum();
//		String act="SALES"+ran.random();
//		System.out.println(act);
		
		JSONObject jobj= new JSONObject();
		jobj.put("createdBy", "RIT");
		jobj.put("projectName", "SALES"+ran.random());
		jobj.put("status", "gy");
		jobj.put("teaamSize", 149);
		
		//pre condition
		
	Response req=given().body(jobj).contentType(ContentType.JSON).when().post("/addProject");
	
	String proid=req.jsonPath().get("proid");
	System.out.println(proid);
	req.then().assertThat().statusCode(201).log().all();
	
	//given().pathParam("rit", proid)
	when().get("/projects"+proid).then().assertThat().statusCode(200).log().all();
		
		
	}

}
