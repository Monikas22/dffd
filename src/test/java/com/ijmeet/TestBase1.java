package com.ijmeet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class TestBase1 {
	public static WebDriver driver;
	public static ChromeOptions option;
	@BeforeClass
	public void setup() throws Exception {
		 option= new ChromeOptions();
		driver= new ChromeDriver(option);
	}
	//@AfterMethod
	//public void teardown() throws Exception {
		//Thread.sleep(10000);
		//driver.quit();
	//}
}
