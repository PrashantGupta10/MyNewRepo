package ResponseValidation;

import org.testng.Assert;

import com.jayway.restassured.response.Response;

public class ResponseDataValidationUsingJsonPath {
	public static void responseData(String expectedData, Response res, String jsonPath)
	{
		String actualData = res.jsonPath().get(jsonPath);
		Assert.assertEquals(actualData,expectedData,"Data is not matching");
	}
}
