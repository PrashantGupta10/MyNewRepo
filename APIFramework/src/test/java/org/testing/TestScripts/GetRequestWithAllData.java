package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.ParsingJsonUsingOrgJson;
import org.testing.Utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;
import ResponseValidation.ResponseStatusCodeValidation;

public class GetRequestWithAllData {
	@Test
	public void TestCase3() throws IOException
	{
		Properties p= PropertiesFileLoad.propertiesLoad("../APIFramework/URIs.properties");
		HTTPMethods http = new HTTPMethods(p);
		Response res = http.GetRequestAllTC("QA_URI");
		ResponseStatusCodeValidation.ResponseStatusValidate(200, res);
		System.out.println("******Third test case data*****\n"+res.asString());
		ParsingJsonUsingOrgJson.JsonExtract(res.asString(), "id");
		ParsingJsonUsingOrgJson.JsonExtract(res.asString(), "firstname");
		
	}
}
