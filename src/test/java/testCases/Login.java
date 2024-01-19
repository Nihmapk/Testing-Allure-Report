package testCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPO;


public class Login extends LoginPO
{
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest()
	{
		driver=new SafariDriver();
		
	}
	@Test
	public void login_test()
	{
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.saucedemo.com");
	driver.manage().window().maximize();
	driver.findElement(user_name).sendKeys("standard_user");
	driver.findElement(pass_wrd).sendKeys("secret_sauce");
	driver.findElement(login).click();//click on login btn
	String actualTitle=driver.getTitle();
	String expectedTitle="Swag Labs";
	System.out.println("Title of page"  +actualTitle);
	Assert.assertEquals(actualTitle,expectedTitle);
	//WebElement bagText=driver.findElement(bagLink);
	WebElement bagText1=driver.findElement(bagLink1);//click on bag link in home page
	String text=bagText1.getText();
	System.out.println(text);//getting text of link
	bagText1.click();
	
	}
	@AfterTest
	public void afterTest()
	{
		driver.quit();
	}

}
 