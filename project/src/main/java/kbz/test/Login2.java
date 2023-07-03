package kbz.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login2 {

	 WebDriver driver;
	 @BeforeClass
	 public void start() {
		 
		 WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		 driver.get("https://paymentcards.kbzbank.com/kbz/prod/kbzportal/web/user-login.jsp");
		 
	 }
	 
@Test(enabled=true)
public void test01() {
	driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("sethuraman123456@gmail.com");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Abc123!");

	driver.findElement(By.xpath("//input[@name='submit1']")).click();
	
}

@Test(enabled=true)
public void test02() {
	driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("thurAbc123!");

	driver.findElement(By.xpath("//input[@name='submit1']")).click();
	
}

@Test(enabled=true)
public void test03() {
	driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("sethuraman123456@gmail.com");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("thurAbc124!");

	driver.findElement(By.xpath("//input[@name='submit1']")).click();
	
}
}
