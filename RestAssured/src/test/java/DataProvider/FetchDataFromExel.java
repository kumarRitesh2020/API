package DataProvider;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ExcelUtility.ExcelUtility;

import static io.restassured.RestAssured.*;

import java.io.IOException;

import Pojo.PostRequestInPojo;
import RandomNumber.RandomNum;
import io.restassured.http.ContentType;

public class FetchDataFromExel {
	
	@Test(dataProvider="getDataFromExcel")
	public void dataTest(String createdBy,String projectName, String status,int teamSize) {
		RandomNum ran=new RandomNum();
		PostRequestInPojo data1 = new PostRequestInPojo(createdBy,projectName+ran.random(),status,teamSize);
		given().body(data1).contentType(ContentType.JSON)
		.when().post("http://rmgtestingserver:8084/addProject")
		.then().assertThat().statusCode(201).log().all();
	}

	@DataProvider(name="getDataFromExcel")
	public Object[][] getDataByExcel() throws EncryptedDocumentException, IOException
	{
		ExcelUtility eu=new ExcelUtility();
		
		Object[][] data = eu.readMultipleFromExcel("Sheet1");
		return data;
	}
	
}


