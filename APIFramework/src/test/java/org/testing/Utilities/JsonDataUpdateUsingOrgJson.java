package org.testing.Utilities;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonDataUpdateUsingOrgJson {
	public static String JsonDataUpdate(String data, String searchKey, String replaceValue)
	{
		JSONObject d = new JSONObject(data);
		JSONArray arrayy=d.getJSONArray("phoneNumbers");
		int l =  arrayy.length();
		for(int i=0;i<l;i++)
		{
			JSONObject dataa = arrayy.getJSONObject(i);
			dataa.put(searchKey,replaceValue);
		}		
		return d.toString();		
	}
}
