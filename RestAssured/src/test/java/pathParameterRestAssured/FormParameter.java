package pathParameterRestAssured;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;

public class FormParameter {
	
	@Test
public void queryUpdate() {
	
		baseURI="http://reqres.in";
			given()
			.formParam("name", "Anup")
			.contentType(ContentType.JSON);
	}
		
	}


