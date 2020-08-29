
package org.testing.TestScripts;

import java.io.FileNotFoundException;

import org.testing.Utilities.JsonDataUpdateUsingOrgJson;
import org.testing.Utilities.JsonFileLoad;
import org.testng.annotations.Test;

public class TC6 {
	/*Replacing the keyValue with newKeyValue in JSON file*/
	@Test
	public void TestCase6() throws FileNotFoundException
	{
		String s = JsonFileLoad.jsonData("../APIFramework/src/test/java/org/testing/Resources/dummyJson.json");
		s=JsonDataUpdateUsingOrgJson.JsonDataUpdate(s, "type", "Model");
		s=JsonDataUpdateUsingOrgJson.JsonDataUpdate(s, "number", "pg");
		System.out.println(s);
	}

}
