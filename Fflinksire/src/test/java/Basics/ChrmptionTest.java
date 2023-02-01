package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class ChrmptionTest {

	@Test
	public void test() {
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--start maximized");
		//options.addArguments("--incognito");
		WebDriverManager.chromedriver().setup();
		
		//options.addArguments("--headless");
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.easemytrip.com/");
		System.out.println("Done");
	    

	}

}
