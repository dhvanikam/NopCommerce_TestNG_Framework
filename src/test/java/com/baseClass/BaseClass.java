package com.baseClass;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.utility.Readconfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	static Readconfig readconfig = new Readconfig();
	public static String baseURL = readconfig.getApplicationURL();
	public static WebDriver driver;
	public static String browserName = readconfig.getbrowser();
	static Properties pro;

	@BeforeTest
	public void Initialization() {

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println("Initilizing chrome driver");
		}

		else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		else if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if (driver==null) {
			File src = new File("./src/test/resources/Configuration/Config.properties");

			try {
				FileInputStream fis = new FileInputStream(src);
				pro = new Properties();
				pro.load(fis);
			} catch (Exception e) {
				System.out.println("Exception is " + e.getMessage());
			}
		}
		

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}
}