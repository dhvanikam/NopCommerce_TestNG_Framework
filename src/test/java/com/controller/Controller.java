package com.controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.baseClass.BaseClass;
import com.controllerInterface.ControllerInterface;

public class Controller extends BaseClass implements ControllerInterface{


	Actions action = new Actions(driver);
	Select select;

	@Override
	public void click(WebDriver driver, WebElement element) {
		try {
			action.moveToElement(element).click().build().perform();
		} catch (Exception e) {
			System.out.println(e);
		}
	}


	@Override
	public boolean type(WebElement element, String text) {
		boolean flag = false;
		try {
			if (element.isDisplayed()) {

				element.clear();
				element.sendKeys(text);
				flag = true;
				System.out.println("Successfully entered value");

			} else {
				flag = false;
				System.out.println("Unable to enter value");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return flag;
	}



	@Override
	public boolean isDisplayed(WebDriver driver, WebElement element) {
		boolean flag = false;
		try {
			if (element.isDisplayed()) {				
				flag = true;
				System.out.println("The element is Displayed"+element);

			} else {
				flag = false;
				System.out.println("The element is not Displayed"+element);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return flag;
	}



	@Override
	public boolean isSelected(WebDriver driver, WebElement element) {
		boolean flag = false;
		try {
			if (element.isSelected()) {				
				flag = true;
				System.out.println("The element is Selected");

			} else {
				flag = false;
				System.out.println("The element is not Selected");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return flag;
	}


	@Override
	public boolean isEnabled(WebDriver driver, WebElement element) {
		boolean flag = false;
		try {
			if (element.isEnabled()) {				
				flag = true;
				System.out.println("The element is Enabled");

			} else {
				flag = false;
				System.out.println("The element is not Enabled");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return flag;
	}



	@Override
	public boolean selectByIndex(WebElement element, int index) {
		boolean flag = false;
		try {
			if (element.isDisplayed()) {

				select = new Select(element);
				select.selectByIndex(index);
				flag = true;
				System.out.println("Option selected by Index");

			} else {
				flag = false;
				System.out.println("Option not selected by Index");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return flag;
	}


	@Override
	public boolean selectByValue(WebElement element, String value) {
		boolean flag = false;
		try {
			if (element.isDisplayed()) {

				select = new Select(element);
				select.selectByValue(value);
				flag = true;
				System.out.println("Option selected by value");

			} else {
				flag = false;
				System.out.println("Option not selected by value");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return flag;
	}



	@Override
	public boolean selectByVisibleText(String visibletext, WebElement element) {
		boolean flag = false;
		try {
			if (element.isDisplayed()) {

				select = new Select(element);
				select.selectByVisibleText(visibletext);
				flag = true;
				System.out.println("Option selected by visibletext");

			} else {
				flag = false;
				System.out.println("Option not selected by visibletext");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return flag;
	}



	@Override
	public boolean switchToFrameByIndex(WebDriver driver, int index) {
		boolean flag = false;
		try {
			driver.switchTo().frame(index);
			flag = true;

			if (flag) {
				System.out.println("Frame is selected");
			} else {
				System.out.println("Frame is not selected");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return flag;
	}



	@Override
	public boolean switchToFrameById(WebDriver driver, String idValue) {
		boolean flag = false;
		try {
			driver.switchTo().frame(idValue);
			flag = true;

			if (flag) {
				System.out.println("Frame is selected");
			} else {
				System.out.println("Frame is not selected");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return flag;
	}



	@Override
	public boolean switchToFrameByName(WebDriver driver, String nameValue) {
		boolean flag = false;
		try {
			driver.switchTo().frame(nameValue);
			flag = true;

			if (flag) {
				System.out.println("Frame is selected");
			} else {
				System.out.println("Frame is not selected");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return flag;
	}



	@Override
	public boolean switchToDefaultFrame(WebDriver driver) {
		boolean flag = false;
		try {
			driver.switchTo().defaultContent();
			flag = true;

			if (flag) {
				System.out.println("Frame is selected");
			} else {
				System.out.println("Frame is not selected");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return flag;
	}


	@Override
	public void moveToElement(WebDriver driver, WebElement element) {
		try {
			action.moveToElement(element).click().build().perform();	
		} catch (Exception e) {
			System.out.println(e);
		}
	}


	@Override
	public void rightclick(WebDriver driver, WebElement element) {
		try {
			action.contextClick(element).perform();
		} catch (Exception e) {
			System.out.println(e);
		}
	}


	@Override
	public void Alert(WebDriver driver) {
		try {
			driver.switchTo().alert();
		} catch (Exception e) {
			System.out.println(e);
		}
	}


	@Override
	public String getTitle(WebDriver driver) {
		return driver.getTitle();
	}

	@Override
	public String getCurrentURL(WebDriver driver)  {
		return driver.getCurrentUrl();

	}

	@Override
	public String getText(WebElement element) {
		String textValue = "";
		try {
		if(element.isDisplayed()) {
			textValue=element.getText();
			System.out.println("Text value:- "+textValue);
		}
		else {
			System.out.println("Element is not visible");
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return textValue;
	}



}

