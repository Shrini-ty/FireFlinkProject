package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingAlertTest {
	@Test
	public void test1() {
		 WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.automationtesting.in/Alerts.html");
			driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
//			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		  driver.switchTo().alert().dismiss();
		  
		
	}
 
}
