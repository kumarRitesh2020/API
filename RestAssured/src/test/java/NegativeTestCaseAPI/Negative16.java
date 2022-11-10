package NegativeTestCaseAPI;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Negative16 {
	@Test
	public void Get()
	{
		when()
	 .get("http://rmgtestingserver:8085/projects")
.then()
.statusCode(201)
.log().all();
	 
	 
	 
	}

}
