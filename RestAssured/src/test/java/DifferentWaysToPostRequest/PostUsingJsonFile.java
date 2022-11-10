package DifferentWaysToPostRequest;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostUsingJsonFile {
	
	@Test
	public void createProject() {
		File file = new File("./src/test/resources/postfile.json");
		given()
		.body(file)
		.contentType(ContentType.JSON)
		.when()
		.post("http://rmgtestingserver:8084/addProject").then().statusCode(201).log().all();
		
	}
	
	}


