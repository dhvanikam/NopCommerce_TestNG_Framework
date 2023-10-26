package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.BaseClass;
import com.baseClass.BaseController;

import com.utility.Log;

public class Page extends BaseClass {

	@FindBy(xpath = "//ul[@class='top-menu notmobile']//li//a[@href='/computers']")
	WebElement menu_computers;

	public Page() {
		PageFactory.initElements(driver, this);
	}

	public void getURL() {
		driver.get(baseURL);
		Log.logInfo("Get Base URL" + baseURL);
	}

	public void clickComputerTab() throws InterruptedException {
		driver.get(baseURL);
		Log.logInfo("Get Base URL" + baseURL);
		//Thread.sleep(2000);
		click(driver, menu_computers);
		//menu_computers.click();
		//Thread.sleep(2000);
		Log.logInfo("Click on Menu Computers");
		Log.logInfo(driver.getCurrentUrl());
	}
}
