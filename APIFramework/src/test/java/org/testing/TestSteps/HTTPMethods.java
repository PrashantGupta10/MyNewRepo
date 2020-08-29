package org.testing.TestSteps;

import java.util.Properties;
import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.*;
import com.jayway.restassured.http.ContentType;

public class HTTPMethods {
	Properties pr;
	public HTTPMethods(Properties pr)
	{
		this.pr=pr;		
	}
	
	public Response PostRequestTC(String bodyData, String URIName)
	{
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(bodyData)
		.when()
		.post(pr.getProperty(URIName));
		return res;
	}
	
	public Response GetRequestTC(String URIName, String idValue)
	{
		String getURI = pr.getProperty(URIName)+"/"+idValue;
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(getURI);		
		return res;		
	}
	public Response GetRequestAllTC(String URIName)
	{
		String getURI = pr.getProperty(URIName);
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(getURI);		
		return res;		
	}
	
	public Response UpdateRequest(String bodyData, String URIName, String idValue)
	{
		String putURI = pr.getProperty(URIName)+"/"+idValue;
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(bodyData)
		.when()
		.put(putURI);
		return res;
	}
	
	public Response DeleteRequest(String URIName, String keyValue)
	{
		String deleteURI = pr.getProperty(URIName)+"/"+keyValue;
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
				.delete(deleteURI);
				return res;		
	}	
}
