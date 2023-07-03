package kbz.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gmail {

	WebDriver driver;

	@BeforeClass
	public void start() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/");
		
	}

	@Test(enabled = true) // blank mandatory fields
	private void test001() throws InterruptedException {

		driver.findElement(By.xpath("(//a[@data-label='header'])[3]")).click();
		// click on Get Gmail Button

		driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[1]")).click();
		// click on Continue button

		String usernamenull = driver.findElement(By.xpath("//div[@jsname='B34EJ']")).getText();
		System.out.println("Invalid Username : " + usernamenull);
		// Show mandatory field error message

		String gmailnull = driver.findElement(By.xpath("(//div[@jsname='B34EJ'])[2]")).getText();
		System.out.println("Invalid Gmail:" + gmailnull);
		// Show mandatory field error message

		String passwordnull = driver.findElement(By.xpath("(//div[@jsname='B34EJ'])[3]")).getText();
		System.out.println("Invalid Gmail:" + passwordnull);
		// Show mandatory field error message
		System.out.println("Testing Click");
		Thread.sleep(1000);
		 

		System.out.println("test001 SUCCESS");

	}

	@Test(enabled = true) // change mm language to English
	private void test002() throws InterruptedException {

		driver.findElement(By.xpath("//div[@class='TquXA']")).click();
		// select language
		driver.findElement(By.xpath("//div[@class='MocG8c B9IrJb LMgvRb KKjvXb']")).click();
		// select language
		System.out.println("Change language into Eng");
		System.out.println("test002 SUCCESS");
		Thread.sleep(1000);
		 
	}

	@Test(enabled = true) // show password
	private void test003() throws InterruptedException {

		driver.findElement(By.xpath("//div[@class='TquXA']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Gro");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Gu");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("grogu222022");
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("22082022");
		driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("22082022");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
		System.out.println("Show Password");
		driver.findElement(By.xpath("//span[@jsname='V67aGc']")).click();
		System.out.println("test003 SUCCESS");
		Thread.sleep(3000);
		
	}

	@Test(enabled = true) // Empty Phone Number
	private void test004() throws InterruptedException {

		/*driver.findElement(By.xpath("//div[@class='TquXA']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Gro");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Gu");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("grogu222022");
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("22082022");
		driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("22082022");*/
		//driver.findElement(By.xpath("//span[@jsname='V67aGc']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@type='button']")).click();
		String emptyphone = driver.findElement(By.xpath("//div[@jsname='B34EJ']")).getText();
		System.out.println("empty phone number:" + emptyphone);
		System.out.println("test004 SUCCESS");

		 
	}

	@Test(enabled = true) // 
	private void test005() throws InterruptedException {
		Actions action=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//div[@class='VfPpkd-TkwUic']"));
		action.doubleClick(ele).perform();
		driver.findElement(By.xpath("(//span[@jsname='K4r5Ff'])[143]")).click();
		driver.findElement(By.xpath("//input[@id='phoneNumberId']")).sendKeys("9795644996");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(3000);
		//Verification code screen will appear
		System.out.println("test005 SUCCESS");
	}

	@Test(enabled = true) // 
	private void test006() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@id='code']")).sendKeys("000111");
		//enter wrong code
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(3000);
		//Verification code screen will appear
		String wrongcode = driver.findElement(By.xpath("//div[@class='o6cuMc']")).getText();
		System.out.println("Invalid Code Number:" + wrongcode);
		System.out.println("test006 SUCCESS");
		driver.quit();
	}
	
	
	@Test(enabled = false) // 
	private void test007() throws InterruptedException {
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		
		
	}
	@Test(enabled = false)
	public void test0006() throws InterruptedException {

		driver.findElement(By.xpath("//li[@id='item-3']")).click();
		driver.findElement(By.xpath("//button[@id='addNewRecordButton']")).click();

		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Pikachu");

		WebElement webElement = driver.findElement(By.xpath("//input[@id='firstName']"));
		System.out.println("First Name : " + webElement.getAttribute("value"));

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

		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("pyaepyae1122@gmail.com");

		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("San Chaung Township,Yangon,Myanmar");
		driver.findElement(By.xpath("//textarea[@id='permanentAddress']"))
				.sendKeys("San Chaung Township,Yangon,Myanmar");
		driver.findElement(By.xpath("//button[@id='submit']")).click();

		driver.findElement(By.xpath("//span[@class='rct-checkbox']")).click();

		driver.findElement(By.xpath("//span[@class='rct-checkbox']")).isSelected();

		System.out.println("Selected Checkbox");

		System.out.println("test003 SUCCESS");

		Thread.sleep(1000);
		driver.quit();
	}

}
