package org.testing.TestScripts;

import org.testing.Utilities.Conversion;
import org.testng.annotations.Test;

public class TC8 {
	@Test
	public void TestCase8()
	{
		String xmlData = "<firstname>Prashant</firstname>";
		String jsonData=Conversion.XmltoJsonConversion(xmlData);
		System.out.println(jsonData);
		String xmlData1 = Conversion.JsontoXmlConversion(jsonData);
		System.out.println(xmlData1);
	}	
}
