package org.testing.Utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonFileLoad {
	public static String jsonData(String path) throws FileNotFoundException
	{
		File f = new File(path);
		FileReader fr = new FileReader(f);
		JSONTokener js = new JSONTokener(fr);
		JSONObject data =  new JSONObject(js);
		return data.toString();
	}
}
