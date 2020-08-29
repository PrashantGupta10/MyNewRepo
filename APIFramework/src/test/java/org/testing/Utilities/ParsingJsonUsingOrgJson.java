package org.testing.Utilities;

import org.json.JSONArray;

public class ParsingJsonUsingOrgJson {

	public static void JsonExtract(String responseData, String searchValue)
	{
		JSONArray  js = new JSONArray(responseData);
		
		//String id = js.getJSONObject(0).getString(searchValue);				
		//System.out.println(" id value is "+id);
		
		int len=js.length();
		
		for(int i=0;i<len;i++)
		{
			try {
			String keyValue = js.getJSONObject(i).getString(searchValue);				
			System.out.println(" value is "+keyValue);
			}
			catch (Exception e) {
				System.out.println("Inside catch block");				
			}
		}
		//String name = js.getJSONObject(1).getString("firstname");
		//System.out.println(" 2nd record first name value is "+name);
		
	}
}
