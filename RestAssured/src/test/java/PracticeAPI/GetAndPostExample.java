package PracticeAPI;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

public class GetAndPostExample<V> {
	
//	@Test
//	public void testGet() {
//		
//		baseURI= "https://reqres.in/api";
//		given().get("/users?page=2").then().statusCode(200);
//		
//	}
		@Test
		public void testPost() {
			
			Map<String, Object>map=new HashMap<String, Object>();
			JSONObject request=new JSONObject();
			request.put("job", "Teacher");
			request.put("name", "Raghav");
			System.out.println(request.toJSONString());
			
			
			baseURI="https://reqres.in/api";
			
			given().body(request.toJSONString()).when().post("/users").then().statusCode(201).log().all();
			
		}
	}


