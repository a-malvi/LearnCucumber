package stepDefination;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.io.File;
import java.sql.Driver;

import javax.imageio.ImageIO;

import org.apache.tools.ant.filters.TokenFilter.ContainsString;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import static org.junit.Assert.*;

public class LoginwithCucumberSD {
	public WebDriver D = null;
	@Given("Open browser")
	public void open_browser() {
		System.setProperty("webdriver.chrome.driver","E:\\SeleniumFramework-master\\SeleniumJavaFraework\\Driver\\ChromeDriver\\chromedriver.exe");	
		D = new ChromeDriver();
		D.manage().window().maximize();
	}

	@When("Enter the url")
	public void enter_the_url() {
		String URL = "http://demo.guru99.com/test/newtours/";
		D.get(URL); 
	}

//	@When("Enter registered username and password")
//	public void enter_registered_username_and_password(String uname, String pwd) {
//		LoginPage.username_button(D).sendKeys(uname);
//		LoginPage.enterpassword(D).sendKeys(pwd);
//	}
	
	@When("Enter registered username {string} and password {string}")
	public void enter_registered_username_and_password(String uname, String pwd) {
	
		LoginPage.username_button(D).sendKeys(uname);
		LoginPage.enterpassword(D).sendKeys(pwd);
	}

	@When("Click on Login button")
	public void click_on_login_button() {
		LoginPage.pressSubit(D).click();
		System.out.println("Pressed submit");
	}

	@Then("User must succesfully login to the webpage")
	public void user_must_succesfully_login_to_the_webpage() {
		System.out.println("ALl done");
		String Succe = D.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3")).getText();
	    String ExpectedString = "Login Successfully";
	    assertArreyEquals("Pass", Succe, ExpectedString);
				D.close();
				System.out.println(Succe);
	}
	
//	@Then("verify Login")
//	public void verify_login() {
//	    // Write code here that turns the phrase above into concrete actions
//	    String Succe = D.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3")).getText();
//	    String ExpectedString = "Login Successfully";
//	    assertArreyEquals("Pass", Succe, ExpectedString);
//	
//		
//	}

	private void assertArreyEquals(String string, String succe, String expectedString) {
		// TODO Auto-generated method stub
		
	}

	

}
