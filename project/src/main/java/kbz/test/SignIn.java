package kbz.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignIn {

	WebDriver driver;

	@BeforeClass
	public void signin() {
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/");

		// driver.manage().window().maximize();
	}

	@Test(enabled = false) // blank mandatory fields
	private void test001() throws InterruptedException {

		driver.findElement(By.xpath("(//a[@data-label='header'])[2]")).click();
		// click on Sign in Button

		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		// click on Continue button

		String emptyemail = driver.findElement(By.xpath("//div[@class='o6cuMc']")).getText();
		System.out.println("Invalid Username : " + emptyemail);
		// Show mandatory field error message

		Thread.sleep(1000);

		System.out.println("test001 SUCCESS");
		driver.quit();
	}

	@Test(enabled = true) // forget Email
	private void test002() throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/");

		Thread.sleep(1000);

		driver.findElement(By.xpath("(//a[@data-label='header'])[2]")).click();
		// click on Sign in Button

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ppns111122@gmail.com");
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@jsname='YRMmle']")).sendKeys("ppns1122@gmail.com");
		driver.findElement(By.xpath("//button[@jsname='LgbsSe']")).click();

		// click on Continue button

		// String emptyemail =
		// driver.findElement(By.xpath("//div[@class='o6cuMc']")).getText();
		// System.out.println("Invalid Username : " + emptyemail);
		// Show mandatory field error message

		Thread.sleep(1000);

		System.out.println("test002 SUCCESS");
		driver.quit();
	}

	@Test(enabled = false)
	private void test003() throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/");

		driver.findElement(By.xpath("(//a[@data-label='header'])[2]")).click();
		// click on Sign in Button

		// click on Continue button

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("potatos1122@gmail.com");

		driver.findElement(By.xpath("//button[@type='button']")).click();
		// String emptyemail =
		// driver.findElement(By.xpath("//div[@class='o6cuMc']")).getText();
		// System.out.println("Invalid Username : " + emptyemail);
		// Show mandatory field error message

		Thread.sleep(1000);

		System.out.println("test003 SUCCESS");
		// driver.quit();
	}

	@Test(enabled = false)
	private void test004() throws InterruptedException {

		driver.findElement(By.xpath("//button[@type='button']")).click();
		// String emptyemail =
		// driver.findElement(By.xpath("//div[@class='o6cuMc']")).getText();
		// System.out.println("Invalid Username : " + emptyemail);
		// Show mandatory field error message

		Thread.sleep(1000);

		System.out.println("test004 SUCCESS");
		driver.quit();
	}

}