package org.testing.Utilities;

import java.util.regex.Pattern;

public class JsonVariableReplacement {
	public static String JsonValueToVariable(String jsonData, String variableName, String insertedValue )
	{
		String returnData = jsonData.replaceAll(Pattern.quote("{{"+variableName+"}}"), insertedValue);
		return returnData;		
	}
}
