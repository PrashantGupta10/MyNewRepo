package ResponseValidation;

import org.testng.Assert;

import com.jayway.restassured.response.Response;

public class ResponseStatusCodeValidation {
	public static void ResponseStatusValidate(int expectedStausCode, Response res)
	{
		Assert.assertEquals(expectedStausCode,res.statusCode(),"Status code is not valid");
	}
}
