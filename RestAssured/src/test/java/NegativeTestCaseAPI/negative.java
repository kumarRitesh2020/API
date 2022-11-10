package NegativeTestCaseAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class negative {
	
	@Test
	public void test_01() {
		Response response=RestAssured.get("https://reqres.in/api/users?page=");
		System.out.println(response.statusCode());
		System.out.println(response.asString());
		System.out.println(response.getTime());

		
	}

}
