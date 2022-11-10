package validations;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class dynamicResponceValidation {
	
	
	@Test
	public void dynamicValidation() {
		String actData="TY_PROJ_1005";
		baseURI="http://rmgtestingserver";
		port=8084;
		
		Response res=when().get("/projects");
		boolean flag=false;
		List<String> pid=res.jsonPath().get("projectId");
		for(String project:pid) {
			if(project.equalsIgnoreCase(actData)) {
				flag=true;
			}
		}
		Assert.assertTrue(flag);
		System.out.println("TC Pass");
		res.then().assertThat().statusCode(200).log().all();
		
	}

}

