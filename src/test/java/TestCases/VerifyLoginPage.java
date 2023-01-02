package TestCases;
//Adding for git demo purpose

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModel.LoginObject;
import Resources.BaseClass;

public class VerifyLoginPage extends BaseClass {
	@Test(dataProvider="getData")
	public void launchBrowser( String a,String b) throws IOException, InterruptedException {
		driver=initializeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		LoginObject LO=new LoginObject(driver);
		LO.EnterUserName().sendKeys(a);
		Thread.sleep(2000);
		LO.EnterUserPassword().sendKeys(b);
		Thread.sleep(2000);
		LO.ClickLogin().click();
		System.out.println("Passed");
	}
	@DataProvider
	public Object[][]getData(){
		Object[][]a1=new Object[2][2];
		a1[0][0]="Test123";
		a1[0][1]="Pass123";
		a1[1][0]="Test456";
		a1[1][1]="Pass123";
		return a1;
	}
	

}
