package pageObjects;

import org.openqa.selenium.By;

import testCases.Login;

public class LoginPO 
{
	public By user_name=By.xpath("//input[@name='user-name']//ancestor::div/input[@placeholder='Username']");//username
	protected By pass_wrd=By.xpath("//input[@name='password']//ancestor::div/input[@placeholder='Password']");//password
	protected By login=By.xpath("//input[@id='login-button']");//login
	protected By bagLink=By.xpath("//div[@class='inventory_item_name']/parent::a[@id='item_4_title_link']/descendant::div");//bag item link
	protected By bagLink1=By.xpath("//div[text()=\"Sauce Labs Backpack\"]");
	
}
