package com.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseClass.BaseClass;

public class LoginTest extends BaseClass{
	@Test(dataProvider="getData",groups= {"Login"})
	public void loginTest(HashMap<String,String> input)
	{
		//loginPage.loginApplication(input.get("email"), input.get("password"));
		
	}
	//@DataProvider
	//public Object[][] getData() throws IOException
	//{
		//List<HashMap<String,String>> data = getJsonDataToMap(System.getProperty("user.dir")+"//src//test//resources//Data//LoginCredentials.json");
		//return new Object[][]  {{data.get(0)}, {data.get(1) } };
		
	//}
}
