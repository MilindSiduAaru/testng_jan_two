package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginObject {
	public WebDriver driver;
	By userName=By.xpath("//input[@id=\"username\"]");
	By Password=By.xpath("//input[@id=\"password\"]");
	By Login=By.xpath("//input[@id=\"Login\"]");
	
	public LoginObject(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement EnterUserName() {
		return driver.findElement(userName);
	}
	public WebElement EnterUserPassword() {
		return driver.findElement(Password);
	}
	public WebElement ClickLogin() {
		return driver.findElement(Login);
	}

}
