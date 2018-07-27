package com.shray.automation.cucumber.stepdefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginStepDefinitionDataTableMaps {
	
	public WebDriver driver;
			
	@Given("^GoodUser is already on the account page$")
	public void GoodUser_is_already_on_the_account_page() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://store.demoqa.com/products-page/your-account/");
		String title = driver.getTitle();
		Assert.assertEquals("Your Account | ONLINE STORE", title);
	}
	
	
	@Then("^GoodUser clicks on Login link$")
	public void GoodUser_clicks_on_the_login_link() {
		
		WebElement logInLink = driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
		logInLink.click();		
		
	}
	
	@Then("^GoodUser is on Login page$")
	public void GoodUser_is_on_login_page() {
		
		String pageTitle = driver.getTitle();
		Assert.assertEquals("ONLINE STORE ‹ Log In", pageTitle);
	}
	
	@Then("^GoodUser enters username and password$")
	public void GoodUser_enters_GoodUsername(DataTable dataTable) {
		
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		
		//  *** When there is only one row of data in the step
		WebElement GoodUsernameInputBox = driver.findElement(By.xpath("//input[@name='log']"));
		GoodUsernameInputBox.sendKeys(data.get(0).get("Username"));
		WebElement passwordInputBox = driver.findElement(By.xpath("//input[@name='pwd']"));
		passwordInputBox.sendKeys(data.get(0).get("Password"));
		
		// *** When there is multiple rows of data in the step
		// *** Although it is not recommended to use data table with lists procedure for more than one row of data sets
		for (Map<String,String> myData : data) {
			WebElement GoodUsernameInputBox1 = driver.findElement(By.xpath("//input[@name='log']"));
			GoodUsernameInputBox.sendKeys(myData.get("Username"));
			WebElement passwordInputBox1 = driver.findElement(By.xpath("//input[@name='pwd']"));
			passwordInputBox.sendKeys(myData.get("Password"));
		}
		
	}
	

	@And("^GoodUser clicks on the Login button$")
	public void GoodUser_clicks_on_the_login_button() {
		
		WebElement logInButton = driver.findElement(By.xpath("//input[@value='Log In']"));
		logInButton.click();
		
	}
	
	@Then("^GoodUser lands on the user own profile page$")
	public void GoodUser_lands_on_the_profile_page(DataTable dataTable) {
		
		List<Map<String,String>> data = dataTable.asMaps(String.class, String.class);
		String user = data.get(0).get("user");
			
		List<WebElement> GoodUserElements = driver.findElements(By.xpath("//span[contains(text(),'"+user+"')]"));
		int sizeOfList = GoodUserElements.size();
		if (sizeOfList==0)
			Assert.fail("The login was not successfull");
	
	}
	
	@And("^GoodUser logs out$")
	public void GoodUser_logs_out() {
		
		WebElement GoodUserNameElement = driver.findElement(By.xpath("//a[contains(text(),'Howdy, ')]"));
		WebElement GoodUserLogOutElement = driver.findElement(By.xpath("//a[contains(text(),'Log Out')]"));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(GoodUserNameElement).build().perform();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		builder.moveToElement(GoodUserLogOutElement).build().perform();
		

		GoodUserLogOutElement.click();
		
		List<WebElement> logOutMessage = driver.findElements(By.xpath("//p[contains(text(),'You are now logged out.')]"));
		if (logOutMessage.size()==0) {
			Assert.fail("The log out is failed");
			}
	}
	
	
	@Then("^GoodUser closes the browser$")
	public void GoodUser_closes_the_browser() {
		
		driver.close();
	}
}