package com.shray.automation.cucumber.stepdefinitions;

import java.util.List;
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

public class LoginStepDefinitionDataTable {
	
	public WebDriver driver;
			
	@Given("^MyUser is already on the account page$")
	public void myUser_is_already_on_the_account_page() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://store.demoqa.com/products-page/your-account/");
		String title = driver.getTitle();
		Assert.assertEquals("Your Account | ONLINE STORE", title);
	}
	
	
	@Then("^MyUser clicks on Login link$")
	public void myUser_clicks_on_the_login_link() {
		
		WebElement logInLink = driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
		logInLink.click();		
		
	}
	
	@Then("^MyUser is on Login page$")
	public void myUser_is_on_login_page() {
		
		String pageTitle = driver.getTitle();
		Assert.assertEquals("ONLINE STORE ‹ Log In", pageTitle);
	}
	
	@Then("^MyUser enters username and password$")
	public void myUser_enters_MyUsername(DataTable dataTable) {
		
		List<List<String>> data = dataTable.raw();		
		
		//  *** When there is only one row of data in the step
		//WebElement MyUsernameInputBox = driver.findElement(By.xpath("//input[@name='log']"));
		//MyUsernameInputBox.sendKeys(data.get(0).get(0));
		//WebElement passwordInputBox = driver.findElement(By.xpath("//input[@name='pwd']"));
		//passwordInputBox.sendKeys(data.get(0).get(1));
		
		// *** When there is multiple rows of data in the step
		// *** Although it is not recommended to use data table with lists procedure for more than one row of data sets
		int numberOfRowsOfData = data.size();
		for (int i=0; i<numberOfRowsOfData; i++) {
			WebElement MyUsernameInputBox = driver.findElement(By.xpath("//input[@name='log']"));
			MyUsernameInputBox.sendKeys(data.get(i).get(0));
			WebElement passwordInputBox = driver.findElement(By.xpath("//input[@name='pwd']"));
			passwordInputBox.sendKeys(data.get(i).get(1));
		}
		
	}
	

	@And("^MyUser clicks on the Login button$")
	public void myUser_clicks_on_the_login_button() {
		
		WebElement logInButton = driver.findElement(By.xpath("//input[@value='Log In']"));
		logInButton.click();
		
	}
	
	@Then("^MyUser lands on the user own profile page$")
	public void myUser_lands_on_the_profile_page(DataTable dataTable) {
		
		List<List<String>> data = dataTable.raw();
		String user = data.get(0).get(0);
			
		List<WebElement> MyUserElements = driver.findElements(By.xpath("//span[contains(text(),'"+user+"')]"));
		int sizeOfList = MyUserElements.size();
		if (sizeOfList==0)
			Assert.fail("The login was not successfull");
	
	}
	
	@And("^MyUser logs out$")
	public void myUser_logs_out() {
		
		WebElement MyUserNameElement = driver.findElement(By.xpath("//a[contains(text(),'Howdy, ')]"));
		WebElement MyUserLogOutElement = driver.findElement(By.xpath("//a[contains(text(),'Log Out')]"));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(MyUserNameElement).build().perform();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		builder.moveToElement(MyUserLogOutElement).build().perform();
		

		MyUserLogOutElement.click();
		
		List<WebElement> logOutMessage = driver.findElements(By.xpath("//p[contains(text(),'You are now logged out.')]"));
		if (logOutMessage.size()==0) {
			Assert.fail("The log out is failed");
			}
	}
	
	
	@Then("^MyUser closes the browser$")
	public void myUser_closes_the_browser() {
		
		driver.close();
	}
}