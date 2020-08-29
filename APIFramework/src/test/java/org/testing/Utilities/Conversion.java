package org.testing.Utilities;

import org.json.JSONObject;
import org.json.XML;

public class Conversion {
	public static String XmltoJsonConversion(String xmlData)
	{
		JSONObject js = XML.toJSONObject(xmlData);
		//System.out.println(js.toString());
		return js.toString();
	}
	public static String JsontoXmlConversion(String jsonData)
	{
		JSONObject js = new JSONObject(jsonData);
		String xmlData = XML.toString(js);
		//System.out.println(xmlData);
		return xmlData;
	}

}
