package org.testing.Trigger;

import java.io.IOException;

import org.testing.TestScripts.DeleteRequestTestCase;
import org.testing.TestScripts.GetRequest;
import org.testing.TestScripts.GetRequestWithAllData;
import org.testing.TestScripts.PostRequestTestCase;
import org.testing.TestScripts.PutRequestTestCase;
import org.testing.TestScripts.TC6;
import org.testing.TestScripts.TC7;
import org.testing.TestScripts.TC8;

public class TriggerClass {

	public static void main(String[] args) throws IOException {
		PostRequestTestCase post =  new PostRequestTestCase();
		post.TestCase1();
		
		GetRequest get = new GetRequest();
		get.TestCase2();	
		
		GetRequestWithAllData getall = new GetRequestWithAllData();
		getall.TestCase3();
		
		PutRequestTestCase put =  new PutRequestTestCase();
		put.TestCase4();	
		
		DeleteRequestTestCase del =  new DeleteRequestTestCase();
		del.TestCase5();	
		
		TC6 t6 = new TC6();
		t6.TestCase6();
		
		TC7 t7 = new TC7();
		t7.TestCase7();
		
		TC8 t8 = new TC8();
		t8.TestCase8();
	}	
}
