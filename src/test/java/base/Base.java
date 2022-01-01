package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
public static WebDriver driver;
	
	@BeforeSuite
	public WebDriver setup() {
	
		WebDriverManager.chromedriver().setup();
		
		//Starting Maximize Window
	
		ChromeOptions coptions = new ChromeOptions();
		coptions.addArguments("--start-maximized");

		
		driver = new ChromeDriver(coptions);
		
		return driver;
		
	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
		
	}	

}
