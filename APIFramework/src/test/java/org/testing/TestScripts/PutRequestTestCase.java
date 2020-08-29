package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

import ResponseValidation.ResponseStatusCodeValidation;

public class PutRequestTestCase {
	@Test
	public void TestCase4() throws IOException
	{
		Properties p= PropertiesFileLoad.propertiesLoad("../APIFramework/URIs.properties");
		String idValueForGet = PostRequestTestCase.idValue;
		HTTPMethods http = new HTTPMethods(p);
		
		Response res = http.GetRequestTC("QA_URI", idValueForGet);
		ResponseStatusCodeValidation.ResponseStatusValidate(200, res);
		System.out.println("Data before replacement\n" +res.asString());	
		String returnData = res.asString();
		returnData = returnData.replace("Manager", "TL");
		returnData = returnData.replace("ABC", "XYZ");		
		System.out.println("Data after value replacement\n"+returnData);
		res=http.UpdateRequest(returnData, "QA_URI", idValueForGet);		
		ResponseStatusCodeValidation.ResponseStatusValidate(200, res);
		//http.GetRequestAllTC("QA_URI");
		
	}

}
