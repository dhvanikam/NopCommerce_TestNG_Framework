package com.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseClass.BaseClass;
import com.pages.LoginPage;
import com.pages.Page;
import com.utility.Log;

public class LoginTest extends BaseClass {
	LoginPage loginPage;

	@BeforeMethod
	public void setup() {
		loginPage = new LoginPage();
	}

	@Test(dataProvider = "getData", groups = { "Login" })
	public void loginTest(HashMap<String, String> input) {

		loginPage.loginApplication(input.get("email"), input.get("password"));
		String errorMsg = loginPage.getErrorMessage();
		if (errorMsg == "")
			Log.logInfo("Success full Login");
		else
			Log.logInfo(errorMsg);

	}

	@DataProvider
	public Object[][] getData() throws IOException {
		List<HashMap<String, String>> data = getJsonDataToMap(
				System.getProperty("user.dir") + "//src//test//resources//Data//LoginCredentials.json");
		return new Object[][] { { data.get(0) }, { data.get(1) } };

	}
}
