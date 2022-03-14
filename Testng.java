package Greens.MavenProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Testng {

	public WebDriver driver;

//	public String url = "https://www.amazon.in/";

	@Test
	public void setUp() throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\All Files\\Software\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("The setup process is completed");
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println("The Url setup process is completed");
	
		WebElement findElement = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]"));	
		
		Actions a = new Actions(driver);
		a.contextClick(findElement).build().perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("nav success");
		
		String title = driver.getTitle();
	      System.out.println(title);
	
	  	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Electronics");
	  	driver.findElement(By.id("nav-search-submit-button")).click();
	  	System.out.println("this method Electronics will be executed");
	  	}
	


//	@Test
//	public void CheckLogIn() {
//		driver.findElement(By.id("ap_email")).sendKeys("automationtestingdemosite@gmail.com");
//		driver.findElement(By.id("continue")).click();
//		driver.findElement(By.id("ap_password")).sendKeys("123456789@Automation");
//		driver.findElement(By.id("signInSubmit")).click();
//		System.out.println("Login SuccesFully");

//	}
//	
//	@Test
//	public void HomePage() {
//      String title = driver.getTitle();
//      System.out.println(title);
//		
//	}

//
	
	
}

//	@Test
//	public void mobile() throws InterruptedException {
//		Thread.sleep(3000);
//		driver.findElement(By.id("twotabsearchtextbox")).clear();
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
//		driver.findElement(By.id("nav-search-submit-button")).click();
//		System.out.println("this method Mobile will be executed");
//	}
//
//	@Test
//	public void watch() throws InterruptedException {
//		Thread.sleep(3000);
//		driver.findElement(By.id("twotabsearchtextbox")).clear();
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Watch");
//		driver.findElement(By.id("nav-search-submit-button")).click();
//		System.out.println("this method watch will be executed");
//	}
//
//	@Test
//	public void tv() throws InterruptedException {
//		Thread.sleep(3000);
//		driver.findElement(By.id("twotabsearchtextbox")).clear();
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Television");
//		driver.findElement(By.id("nav-search-submit-button")).click();
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println("this method tv will be executed");
//
//	}
//
//	@Test
//	public void shoes() throws InterruptedException {
//		Thread.sleep(3000);
//		driver.findElement(By.id("twotabsearchtextbox")).clear();
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes");
//		driver.findElement(By.id("nav-search-submit-button")).click();
//		System.out.println("this method shoes will be executed");
//	}
//
//	@Test
//	public void laptop() throws InterruptedException {
//		Thread.sleep(3000);
//		driver.findElement(By.id("twotabsearchtextbox")).clear();
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("LapTop");
//		driver.findElement(By.id("nav-search-submit-button")).click();
//		System.out.println("this method laptop will be executed");
//	}
//
//	@AfterClass
//	public  void refresh() {
//		driver.navigate().refresh();
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println(currentUrl);
//		System.out.println("Refresh the page and get url");
//	}
//
//	@AfterTest
//	public void delete() {
//		driver.manage().deleteAllCookies();
//		System.out.println("Deleted all the Cookies");
//	}
//
//	@AfterSuite
//	public void cleanUp() {
//		driver.quit();
//		System.out.println("Quit the Program");
//	}

