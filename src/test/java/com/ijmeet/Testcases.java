package com.ijmeet;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcases extends TestBase1 {
	 private static final Object[][] String = null;

	@Test(dataProvider="loginDetails", dataProviderClass = Dataproijmeet.class)
	public void verifySignIn() throws InterruptedException, EncryptedDocumentException, IOException {
		driver.get("https://ijmeet.com/");
		String msg1= "Congratulations! Your login was successful.";
		driver.findElement(By.xpath("//a[contains(text(),' Sign In ')]")).click();
		
		/*String b=a.getRow(0).getCell(0).getStringCellValue();
		String b1=a.getRow(0).getCell(1).getStringCellValue();*/
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys(b);
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(b1);
		driver.findElement(By.xpath("//div[@class=\"my-2\"]/child::button")).click();
		driver.findElement(By.xpath("//input[@type=\"email\"]")).clear();
		driver.findElement(By.xpath("//input[@type=\"password\"]")).clear();
		/*String c=a.getRow(1).getCell(0).getStringCellValue();
		String c1=a.getRow(1).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys(c);
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(c1);*/
		//driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("msuganawar@gmail.com");
		//driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Ashoksunila@183022");
		
		String msg= driver.findElement(By.xpath("//div[contains(text(),' Congratulations! Your login was successful. ')]")).getText();
		Assert.assertEquals(msg, msg1);
		Thread.sleep(3000);
	}
	
	
	/*@Test
	public void verifySignUp() throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		String errmsg1="User already registerd with this email please login";
		driver.get("https://ijmeet.com/");
		driver.findElement(By.xpath("//a[contains(text(),' Sign Up ')]")).click();
		driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys("monika");
		driver.findElement(By.xpath("//input[@name=\"company_name\"]")).sendKeys("chiparikar");
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("msuganawar@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"contact\"]")).sendKeys("8087419335");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Ashoksunila@183022");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//div[@role=\"presentation\"][1])[1]")).click();
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		JavascriptExecutor jse=  (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),' Sign Up ')]")).click();
		Thread.sleep(3000);
		String errmsg=driver.findElement(By.xpath("//label[contains(text(),'User already registerd with this email please login')]")).getText();
		Assert.assertEquals(errmsg, errmsg1);
	}*/
	
	/*@Test
	public void verifyschedulemeeting() throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://ijmeet.com/");
		driver.findElement(By.xpath("//a[contains(text(),' Sign In ')]")).click();
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("msuganawar@gmail.com");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Ashoksunila@183022");
		driver.findElement(By.xpath("//div[@class=\"my-2\"]/child::button")).click();
		driver.findElement(By.xpath("//div[contains(text(),' Congratulations! Your login was successful. ')]")).getText();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id=\"mview-common-Meeting_tab\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"topic\"]")).sendKeys("Data provider");
		driver.findElement(By.xpath("//textarea[@name=\"description_1\"]")).sendKeys("need to discuss about Data provider Database, excel, csv");
		driver.findElement(By.xpath("//input[@list=\"browsers\"]")).sendKeys("chetanchiparikar@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"edit_start_end_date\"]")).clear();
		driver.findElement(By.xpath("//input[@id=\"edit_start_end_date\"]")).sendKeys("01/19/2023");
		driver.findElement(By.xpath("//input[@name=\"start_time_new\"]")).clear();
		driver.findElement(By.xpath("//input[@name=\"start_time_new\"]")).sendKeys("1:37 PM");
		WebElement list1= driver.findElement(By.xpath("//select[@id=\"edit_hour\"]"));
		Select select1= new Select(list1);
		select1.selectByIndex(3);
		Thread.sleep(3000);
		WebElement list2= driver.findElement(By.xpath("//select[@name=\"minute\"]"));
		Select select2= new Select(list2);
		select2.selectByIndex(3);
		WebElement list3= driver.findElement(By.xpath("//select[@name=\"timezone\"]"));
		Select select3=new Select(list3);
		select3.selectByIndex(8);
		Actions action = new Actions(driver);
		action.moveByOffset(200, 300).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[@class=\"form-check-label\"])[2]")).click();
		driver.findElement(By.xpath("(//span[@class=\"slider round\"])[1]")).click();
		driver.findElement(By.xpath("//input[@id=\"submitmeeting\"]")).click();
		Thread.sleep(2000);
		String msg1=driver.findElement(By.xpath("//h2[contains(text(),'Error')]")).getText();
		String msg2=driver.findElement(By.xpath("//div[contains(text(),'Meetings already present')]")).getText();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
		Assert.assertEquals(msg1, "Error");
		Assert.assertEquals(msg2, "Meetings already present");
	}*/
	
	/*@Test
	public void verifyschedulemeeting() throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://ijmeet.com/");
		driver.findElement(By.xpath("//a[contains(text(),' Sign In ')]")).click();
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("msuganawar@gmail.com");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Ashoksunila@183022");
		driver.findElement(By.xpath("//div[@class=\"my-2\"]/child::button")).click();
		driver.findElement(By.xpath("//div[contains(text(),' Congratulations! Your login was successful. ')]")).getText();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id=\"mview-common-Meeting_tab\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"topic\"]")).sendKeys("Data provider");
		driver.findElement(By.xpath("//textarea[@name=\"description_1\"]")).sendKeys("need to discuss about Data provider Database, excel, csv");
		driver.findElement(By.xpath("//input[@list=\"browsers\"]")).sendKeys("chetanchiparikar@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"edit_start_end_date\"]")).clear();
		driver.findElement(By.xpath("//input[@id=\"edit_start_end_date\"]")).sendKeys("01/5/2023");
		driver.findElement(By.xpath("//input[@name=\"start_time_new\"]")).clear();
		driver.findElement(By.xpath("//input[@name=\"start_time_new\"]")).sendKeys("1:37 PM");
		Actions action = new Actions(driver);
		action.moveByOffset(200, 300).perform();
		WebElement list1= driver.findElement(By.xpath("//select[@id=\"edit_hour\"]"));
		Select select1= new Select(list1);
		select1.selectByIndex(3);
		Thread.sleep(3000);
		WebElement list2= driver.findElement(By.xpath("//select[@name=\"minute\"]"));
		Select select2= new Select(list2);
		select2.selectByIndex(3);
		WebElement list3= driver.findElement(By.xpath("//select[@name=\"timezone\"]"));
		Select select3=new Select(list3);
		select3.selectByIndex(8);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[@class=\"form-check-label\"])[2]")).click();
		driver.findElement(By.xpath("(//span[@class=\"slider round\"])[1]")).click();
		driver.findElement(By.xpath("//input[@id=\"submitmeeting\"]")).click();
		
	}*/
		/*@Test
		public void verifyjoinmeeting() throws InterruptedException {
				ChromeOptions option= new ChromeOptions();
				
				
				ChromeDriver driver= new ChromeDriver(option);
				driver.get("https://ijmeet.com/conf");
				driver.findElement(By.xpath("//a[contains(text(),' Sign In ')]")).click();
				driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("msuganawar@gmail.com");
				driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Ashoksunila@183022");
				driver.findElement(By.xpath("//div[@class=\"my-2\"]/child::button")).click();
				driver.findElement(By.xpath("//div[@id=\"My_Meetingsapps_tab\"]")).click();
				driver.findElement(By.xpath("//div[@class=\"project-meetings-dates\"]")).click();
				String meetingid=driver.findElement(By.xpath("//span[contains(text(),' 5e4fcc6 ')]")).getText();
				driver.findElement(By.xpath("//div[@id=\"j_meeting_tab\"]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@name=\"meetingid\"]")).sendKeys(meetingid);
				driver.findElement(By.xpath("(//button[contains(text(),'Join Meeting')])[1]")).click();
				Thread.sleep(45000);
				option.addArguments("use-fake-device-for-media-stream");
				option.addArguments("use-fake-device-for-media-stream");
				
				 
		}*/
	/*@Test
	public void quickmeeting() throws InterruptedException {
		driver.get("https://ijmeet.com/");
		driver.findElement(By.xpath("//a[contains(text(),' Sign In ')]")).click();
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("msuganawar@gmail.com");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Ashoksunila@183022");
		driver.findElement(By.xpath("//div[@class=\"my-2\"]/child::button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=\"quick_meeting_tab\"]")).click();
		Thread.sleep(40000);
		driver.switchTo().frame(0);
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//span[@id=\"close\"]")).click();
																																							
		
	}*/


}
