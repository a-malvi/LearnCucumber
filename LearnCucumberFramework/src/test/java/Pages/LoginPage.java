package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private static WebElement element = null;
	
	public static WebElement username_button(WebDriver D)
	{
	 element = D.findElement(By.name("userName"));
	 
	return element;
	}
	
	
	public static WebElement enterpassword(WebDriver D)
	{
		 element = D.findElement(By.name("password"));
		return element;
	}
	
	public static WebElement pressSubit(WebDriver D)
	{
		element = D.findElement(By.name("submit"));
		return element;
	}
}
