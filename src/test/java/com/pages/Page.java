package com.pages;

import org.openqa.selenium.support.PageFactory;

import com.baseClass.BaseClass;
import com.controller.Controller;

public class Page extends BaseClass {
	//Controller control = new Controller();

	public Page() {
		PageFactory.initElements(driver, this);
	}

	public void getURL() {
		driver.get(baseURL);
	}
}
