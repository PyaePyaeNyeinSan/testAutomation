package kbz.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session4 {

	WebDriver driver;

	@BeforeClass
	public void dragdrop() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");

		driver.manage().window().maximize();
	}

	@Test(enabled = true)

	public void test001() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement From = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement To = driver.findElement(By.xpath("(//h3[@class='ui-widget-header'])[2]"));
		action.dragAndDrop(From, To).perform();

		System.out.println("Pass");
		WebElement From0 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement To0 = driver.findElement(By.xpath("(//h3[@class='ui-widget-header'])[3]"));
		action.dragAndDrop(From0, To0).perform();

		System.out.println("Pass0");
		WebElement From1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement To1 = driver.findElement(By.xpath("(//h3[@class='ui-widget-header'])[2]"));
		action.dragAndDrop(From1, To1).perform();

		System.out.println("Pass1");

		// driver.findElement(By.xpath("//button[@id='save']")).click();
		WebElement From2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement To2 = driver.findElement(By.xpath("(//h3[@class='ui-widget-header'])[3]"));
		action.dragAndDrop(From2, To2).perform();

		System.out.println("Pass2");

		WebElement From3 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[7]"));
		WebElement To3 = driver.findElement(By.xpath("(//h3[@class='ui-widget-header'])[5]"));
		action.dragAndDrop(From3, To3).perform();

		System.out.println("Pass3");

		WebElement From4 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[1]"));
		WebElement To4 = driver.findElement(By.xpath("(//h3[@class='ui-widget-header'])[6]"));
		action.dragAndDrop(From4, To4).perform();

		System.out.println("Pass4");

		WebElement From5 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[8]"));
		WebElement To5 = driver.findElement(By.xpath("(//h3[@class='ui-widget-header'])[5]"));
		action.dragAndDrop(From5, To5).perform();

		System.out.println("Pass5");

		WebElement From6 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[3]"));
		WebElement To6 = driver.findElement(By.xpath("(//h3[@class='ui-widget-header'])[6]"));
		action.dragAndDrop(From6, To6).perform();

		System.out.println("Pass6");

		System.out.println("test001 SUCCESS");
		Thread.sleep(5000);
		driver.quit();
	}

	@BeforeClass
	public void start1() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");

		driver.manage().window().maximize();
	}

	@Test(enabled = true)
	public void test002() {
		
		Actions action = new Actions(driver);
		WebElement doubleclick=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		action.doubleClick(doubleclick).build().perform();
		System.out.println("Double Click");
		
		WebElement rightclick=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		action.contextClick(rightclick).perform();
		System.out.println("Right Click");
		System.out.println("test002 SUCCESS");
		driver.quit();
	}
		
	

}
