package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public WebDriver driver;
	public WebDriver initializeDriver() throws IOException {
		FileInputStream f1=new FileInputStream("D:\\Selenium\\TestNg\\src\\main\\java\\Resources\\Data.properties");
		Properties prop=new Properties();
		prop.load(f1);
		String BowserName=prop.getProperty("Browser");
		if(BowserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Milind\\Desktop\\Selenium jars\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		return driver;
	}

}
