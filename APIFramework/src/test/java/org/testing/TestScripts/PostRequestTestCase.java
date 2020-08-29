package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.JsonFileLoad;
import org.testing.Utilities.JsonVariableReplacement;
import org.testing.Utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

import ResponseValidation.ResponseDataValidationUsingJsonPath;
import ResponseValidation.ResponseStatusCodeValidation;

public class PostRequestTestCase {
	static String idValue;
	@Test
	
	public void TestCase1() throws IOException
	{
		Properties p= PropertiesFileLoad.propertiesLoad("../APIFramework/URIs.properties");
		String body= JsonFileLoad.jsonData("../APIFramework/src/test/java/org/testing/Resources/BodyData.json");
		System.out.println("body data is "+body);
		Random r = new Random();
		Integer randomIdValue = r.nextInt();
		String bodayDataAfterGivingValue =JsonVariableReplacement.JsonValueToVariable(body, "id", randomIdValue.toString());
		System.out.println("body data after giving id value "+bodayDataAfterGivingValue);
		HTTPMethods http = new HTTPMethods(p);
		Response res = http.PostRequestTC(bodayDataAfterGivingValue, "QA_URI");
		ResponseStatusCodeValidation.ResponseStatusValidate(201, res);
		ResponseDataValidationUsingJsonPath.responseData("Prashant", res, "firstname");
		idValue = res.jsonPath().get("id");
		System.out.println("id value is "+idValue);
		System.out.println("Status code of Test Case is "+res.statusCode());
		
	}
}
