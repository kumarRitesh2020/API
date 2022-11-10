package pathParameterRestAssured;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

public class DeleteProject {
	
	public void delete() {
		
	
	baseURI="http://rmgtestingserver";
	port=8084;
	given().pathParam("del", "TY_PROJ_5530")
	
	.when().delete("/projects/{del}")
	.then().assertThat().statusCode(204).log().all();
}

}


