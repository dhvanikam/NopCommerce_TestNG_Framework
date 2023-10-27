package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(xpath="//input[@id='Email']")
	//@FindBy(id="Email")
	WebElement userEmail;
	
	@FindBy(xpath="//input[@id='Password']")
	//@FindBy(id="Password")
	WebElement passwordEle;
	
	//@FindBy(xpath="*[contains(@class,'login-button')]")
	@FindBy(xpath="//button[@class='button-1 login-button']")
	WebElement submit;
	@FindBy(xpath="*[contains(@class,'message-error')]")
	WebElement errorMessage;

	public void loginApplication(String email, String password) {
		userEmail.sendKeys(email);
		passwordEle.sendKeys(password);
		submit.click();
		//ProductCatalogue productCatalogue = new ProductCatalogue(driver);
		//return productCatalogue;

	}

	public String getErrorMessage() {
		//waitForWebElementToAppear(errorMessage);
		return errorMessage.getText();
	}

	public void goTo() {
		//loginUrl=readconfig.getLoginUrl();
		//driver.get("https://rahulshettyacademy.com/client");
	}
}
