package NegativeTestCaseAPI;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Negative10 {
	@Test
	public void Get()
	{
		when()
		.get("http://rmgtestingserver:8084/projects/TY_PRO")
		.then()
		.statusCode(300)
		.log().all();


	}

}
