package Tina_mvn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AppTest {
	@Test
	public void OpenBrowser() {
		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\geckodriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		
	}
    
}
