package pathParameterRestAssured;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.testng.annotations.Test;

public class GETQuery {
	
	@Test
	public void query() {
		
		baseURI="http://reqres.in";
		
		given().queryParam("id", 8)
		
		.when().get("/api/users")
		.then().assertThat().statusCode(200).log().all();
	}
		
	}


