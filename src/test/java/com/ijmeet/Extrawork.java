package com.ijmeet;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Extrawork {
	/*@Test
	public void verifytest() throws InterruptedException, MalformedURLException {
		final String name="monika";
		final String id=  "Ashoksunila@183022";
		final String URL= "http://"+ name+":"+id+"@hub-cloud.browserstack.com/wd/hub";
		DesiredCapabilities caps= new DesiredCapabilities(); 
		caps.setCapability("browser", "chrome");
		caps.setCapability("browser_version", "75.0");
		caps.setCapability("os","windows");
		caps.setCapability("os_version", "10");
		ChromeOptions option= new ChromeOptions();
		
		HashMap<String,Integer> contentSettings = new HashMap<String,Integer>();
		HashMap<String,Object> profile = new HashMap<String,Object>();
		HashMap<String,Object> prefs = new HashMap<String,Object>();
		contentSettings.put("notifications", 0);
		profile.put("managed_default_content_settings",contentSettings );
		prefs.put("profile", profile);
		option.setExperimentalOption("prefs", prefs);
		caps.setCapability(ChromeOptions.CAPABILITY, option);
		
		WebDriver driver= new RemoteWebDriver( 	new URL (URL) , caps);
		driver.get("https://ijmeet.com/conf");
		driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys();
		driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys();
		driver.findElement(By.xpath("//button[@class=\"btn btn-default\"]")).click();
		
		
	}*/
}
