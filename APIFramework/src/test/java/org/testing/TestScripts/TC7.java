package org.testing.TestScripts;

import java.io.FileNotFoundException;

import org.testing.Utilities.JsonDataUpdateUsingOrgJson;
import org.testing.Utilities.JsonFileLoad;
import org.testng.annotations.Test;

public class TC7 {

	/*Inserting new keyValue into JSON file*/
	@Test
	public void TestCase7() throws FileNotFoundException
	{
		String s = JsonFileLoad.jsonData("../APIFramework/src/test/java/org/testing/Resources/dummyJson.json");
		s=JsonDataUpdateUsingOrgJson.JsonDataUpdate(s, "Tool", "Selenium");
		s=JsonDataUpdateUsingOrgJson.JsonDataUpdate(s, "Automation", "API");
		System.out.println(s);
	}
}
