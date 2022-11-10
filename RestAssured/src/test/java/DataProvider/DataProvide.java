package DataProvider;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.util.Random;

import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pojo.PostRequestInPojo;
import RandomNumber.RandomNum;
import io.restassured.http.ContentType;

public class DataProvide {

	
	@Test(dataProvider="getData")
	public void dataTest(String createdBy,String projectName,String status,int teamSize) {
		
	
		RandomNum ran=new RandomNum();
		PostRequestInPojo pjo=new PostRequestInPojo(createdBy,projectName+ran.random(),status,teamSize);
		given()
		.body(pjo)
		.contentType(ContentType.JSON)
		.when()
		.post("http://rmgtestingserver:8084/addProject").then().statusCode(201).log().all();
		
		
	}
	
	@DataProvider(name="getData")
	public Object[][] data(){
		Object[][] data=new Object[3][4];
		
		data[0][0]="Ritesh";
		data[0][1]="Sales & IInventory";
		data[0][2]="Complete";
		data[0][3]=5;
		
		data[1][0]="Vinod";
		data[1][1]="food";
		data[1][2]="pass";
		data[1][3]=6;
		
		data[2][0]="Anup";
		data[2][1]="Travel";
		data[2][2]="50";
		data[2][3]=4;
		return data;	
	}	
	}


