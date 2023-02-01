package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		 driver.get("https://demowebshop.tricentis.com/");
		 String s = driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.selenium.dev/");
		String m = driver.getWindowHandle();
		driver.switchTo().window(s);
		driver.switchTo().window(m)
		
		;
		driver.manage().window().maximize();
		driver.manage().window().minimize();

	}

}
//By using webdrivermanager without setting a path