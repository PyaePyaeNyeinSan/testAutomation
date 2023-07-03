package kbz.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Launch_Browsing {
	 WebDriver driver;

	    @BeforeClass
	    public void start() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.get("https://www.saucedemo.com/");

	    }

	    @Test(enabled = true)
	    public void test01() {
	        driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
	        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");

	        driver.findElement(By.xpath("//input[@name='login-button']")).click();
	        //Thread.sleep(10);  
	        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

	        // driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt']")).click();

	        // driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();

	        driver.findElement(By.id("shopping_cart_container")).click();

	        driver.findElement(By.id("checkout")).click();

	        // driver.findElement(By.xpath("//input[@class='checkout']")).click();

	        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("PP");
	        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("One");
	        driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("226");

	        driver.findElement(By.id("continue")).click();
	        System.out.println( "Test Passed") ;
	        driver.close() ;
	    }

}
