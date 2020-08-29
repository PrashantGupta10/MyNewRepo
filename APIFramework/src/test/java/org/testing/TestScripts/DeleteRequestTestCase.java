package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

import ResponseValidation.ResponseStatusCodeValidation;

public class DeleteRequestTestCase {
	@Test
	public void TestCase5() throws IOException
	{
		Properties p= PropertiesFileLoad.propertiesLoad("../APIFramework/URIs.properties");
		String idValueForGet = PostRequestTestCase.idValue;
		HTTPMethods http = new HTTPMethods(p);
		Response res = http.DeleteRequest("QA_URI",idValueForGet);	
		ResponseStatusCodeValidation.ResponseStatusValidate(200, res);
	}
}
