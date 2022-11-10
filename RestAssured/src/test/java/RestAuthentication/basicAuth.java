package RestAuthentication;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class basicAuth {
	@Test
	public void basicVerify() {
		

				baseURI = "http://rmgtestingserver";
				port = 8084;
				
				given()
				 .auth().basic("rmgyantra", "rmgy@9999")
				 
				.when()
				 .get("/login")
				 
				.then()
				 .assertThat().statusCode(202).log().all();
			}
	}
	
	

