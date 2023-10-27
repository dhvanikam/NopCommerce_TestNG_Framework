package com.baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AbstractComponents {
	WebDriver driver;

	public AbstractComponents(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	

}
