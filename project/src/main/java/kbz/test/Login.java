package kbz.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	WebDriver driver;

	@BeforeClass
	public void start() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");

		String verifyURL = driver.getCurrentUrl();
		if (verifyURL.equals("https://demoqa.com/text-box")) {
			System.out.println(driver.getCurrentUrl());

		} else {
			System.out.println("URL Verification Fail");
		}

		System.out.println(driver.getTitle());

		// driver.manage().window().maximize();
	}

	@Test(enabled = true)
	public void test001() {

		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Pyae Pyae Nyein San");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("pyaepyae1122@gmail.com");

		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("San Chaung Township,Yangon,Myanmar");
		driver.findElement(By.xpath("//textarea[@id='permanentAddress']"))
				.sendKeys("San Chaung Township,Yangon,Myanmar");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		System.out.println("test001 SUCCESS");

	}

	@Test(enabled = true)
	public void test002() {
		driver.findElement(By.xpath("//li[@id='item-1']")).click();
		driver.findElement(By.xpath("//span[@class='rct-checkbox']")).click();

		driver.findElement(By.xpath("//span[@class='rct-checkbox']")).isSelected();

		System.out.println("Selected Checkbox");

		System.out.println("test002 SUCCESS");
	}

	@Test(enabled = true)
	public void test003() throws InterruptedException {

		driver.findElement(By.xpath("//li[@id='item-3']")).click();
		driver.findElement(By.xpath("//button[@id='addNewRecordButton']")).click();

		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Pikachu");

		WebElement webElement = driver.findElement(By.xpath("//input[@id='firstName']"));
		System.out.println("First Name : "+webElement.getAttribute("value"));

		String header = driver.findElement(By.xpath("//div[@id='registration-form-modal']")).getText();
		System.out.println("Page Header : " + header);

		String firstNameLabel = driver.findElement(By.xpath("//label[@id='firstName-label']")).getText();
		System.out.println("First Name Label : " + firstNameLabel);

		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("GroGu");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("pikachu22@gmail.com");
		driver.findElement(By.xpath("//input[@id='age']")).sendKeys("23");
		driver.findElement(By.xpath("//input[@id='salary']")).sendKeys("500$$");
		driver.findElement(By.xpath("//input[@id='department']")).sendKeys("IT");
		driver.findElement(By.xpath("//button[@id='submit']")).isSelected();
		driver.findElement(By.xpath("//button[@id='submit']")).isDisplayed();

		System.out.println("test003 SUCCESS");

		Thread.sleep(1000);
		driver.quit();
	}

}
