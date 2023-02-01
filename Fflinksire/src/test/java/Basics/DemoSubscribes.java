package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoSubscribes {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("shriarun12@gmail.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("87456321");
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='newsletter-email']")).sendKeys("varu5487@gmail.com");
		driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']")).click();

	}

}
