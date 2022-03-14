package Greens.MavenProject;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppTest {
	@Test
	public void amazon() {
		System.setProperty("webdriver.chrome.driver", "C:\\All Files\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.close();
	}

	@Test
	public void Flipkart() {
		System.setProperty("webdriver.chrome.driver", "C:\\All Files\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.close();
	}

	@Test
	public void Tatacliq() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\All Files\\Software\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.tatacliq.com/");
		driver.quit();
	}
		
		
}
