package com.shray.automation.cucumber.stepdefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginStepDefinition {
	
	public WebDriver driver;
	
	/*@Before(order=0)
	public void pre_condition() {
		System.out.println("Before Scenario in different feature file");
	}

	
	@After(order=0)
	public void post_condition() {
		System.out.println("After Scenario in different feature file");
	}*/
			
	@Given("^User is already on the account page$")
	public void user_is_already_on_the_account_page() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://store.demoqa.com/products-page/your-account/");
		String title = driver.getTitle();
		Assert.assertEquals("Your Account | ONLINE STORE", title);
	}
	
	
	@Then("^User clicks on Login link$")
	public void user_clicks_on_the_login_link() {
		
		WebElement logInLink = driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
		logInLink.click();		
		
	}
	
	@Then("^User is on Login page$")
	public void user_is_on_login_page() {
		
		String pageTitle = driver.getTitle();
		Assert.assertEquals("ONLINE STORE ‹ Log In", pageTitle);
	}
	
	@Then("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username(String username, String password) {
		
		WebElement usernameInputBox = driver.findElement(By.xpath("//input[@name='log']"));
		usernameInputBox.sendKeys(username);
		WebElement passwordInputBox = driver.findElement(By.xpath("//input[@name='pwd']"));
		passwordInputBox.sendKeys(password);
		
	}
	

	@And("^User clicks on the Login button$")
	public void user_clicks_on_the_login_button() {
		
		WebElement logInButton = driver.findElement(By.xpath("//input[@value='Log In']"));
		logInButton.click();
		
	}
	
	@Then("^User lands on the \"(.*)\" user profile page$")
	public void user_lands_on_the_profile_page(String user) {
		
		List<WebElement> userElements = driver.findElements(By.xpath("//span[contains(text(),'"+user+"')]"));
		int sizeOfList = userElements.size();
		System.out.println(sizeOfList);
		if (sizeOfList==0)
			Assert.fail("The login was not successfull");
	
	}
	
	@And("^User logs out$")
	public void user_logs_out() {
		
		WebElement userNameElement = driver.findElement(By.xpath("//a[contains(text(),'Howdy, ')]"));
		WebElement userLogOutElement = driver.findElement(By.xpath("//a[contains(text(),'Log Out')]"));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(userNameElement).build().perform();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		builder.moveToElement(userLogOutElement).build().perform();
		

		userLogOutElement.click();
		
		List<WebElement> logOutMessage = driver.findElements(By.xpath("//p[contains(text(),'You are now logged out.')]"));
		if (logOutMessage.size()==0) {
			Assert.fail("The log out is failed");
			}
	}
	
	
	@Then("^User closes the browser$")
	public void user_closes_the_browser() {
		
		driver.close();
	}
}