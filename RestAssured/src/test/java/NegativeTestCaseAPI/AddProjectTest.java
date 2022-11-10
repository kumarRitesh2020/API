package NegativeTestCaseAPI;


import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class AddProjectTest {
	@Test
	public void addProjectTest() {
		
		//As we are using POST Method-->creating the body
		
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "Sonam");
		jobj.put("projectName", "Rmgyantra-tyss");
		jobj.put("status", "created");
		jobj.put("teamsize", 412);
		
		jobj.put("name", "morpheus");
		jobj.put("job", "leader");
		
		
		//preconditions
		
		RequestSpecification reqSpec=RestAssured.given();
		reqSpec.body(jobj);
		reqSpec.contentType(ContentType.JSON);
		//actions
		
		Response res=reqSpec.post("http://rmgtestingserver:8084/addProject");
		//Response res=reqSpec.post("https://reqres.in/api/users");
		
		//validation
		res.getContentType();
		ValidatableResponse valResponse=res.then();
		valResponse.assertThat().contentType(ContentType.JSON);
		valResponse.assertThat().statusCode(200);
		valResponse.log().all();
		
	}

}
